import java.util.List;

// SOLID - SRP: SistemReservasi fokus ke alur booking
public class SistemReservasi implements ReservasiService {
    // SOLID - DIP: Sumber data kereta ditaruh di balik interface
    private final KeretaRepository keretaRepository;
    // SOLID - DIP: Aturan validasi penumpang juga lewat interface
    private final PenumpangValidator penumpangValidator;
    // SOLID - DIP: Pembuatan kode booking tidak digantungkan ke class konkret
    private final BookingCodeGenerator bookingCodeGenerator;

    public SistemReservasi(KeretaRepository keretaRepository, PenumpangValidator penumpangValidator, BookingCodeGenerator bookingCodeGenerator) {
        this.keretaRepository = keretaRepository;
        this.penumpangValidator = penumpangValidator;
        this.bookingCodeGenerator = bookingCodeGenerator;
    }

    @Override
    public List<KeretaApi> lihatJadwal() {
        return keretaRepository.getSemuaKereta();
    }

    @Override
    public HasilBooking pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket)
            throws RuteTidakDitemukanException, TiketHabisException {
        // SOLID - SRP: Validasi data penumpang dikerjakan validator
        penumpangValidator.validasi(nik, namaPenumpang, jumlahTiket);

        KeretaApi kereta = keretaRepository.cariByKode(kodeKereta);

        if (!kereta.kursiCukup(jumlahTiket)) {
            throw new TiketHabisException(kereta.getNamaKereta(), kereta.getSisaKursi());
        }

        kereta.kurangiKursi(jumlahTiket);
        String kodeBooking = bookingCodeGenerator.buatKodeBooking();

        // SOLID - SRP: Hasil booking dibungkus object, bukan dicetak di service
        return new HasilBooking(kodeBooking, namaPenumpang, nik, kereta, jumlahTiket);
    }
}
