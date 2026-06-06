import java.util.ArrayList;

// Class utama untuk mengatur proses reservasi tiket
public class SistemReservasi {
    ArrayList<KeretaApi> daftarKereta = new ArrayList<>();
    int nomorBooking = 1;

    // Constructor untuk menambahkan data awal kereta ke dalam sistem
    public SistemReservasi() {
        daftarKereta.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    // Method untuk menampilkan seluruh jadwal kereta
    public void lihatJadwal() {
        System.out.println("\n--- Jadwal Kereta Java Express ----");

        for (int i = 0; i < daftarKereta.size(); i++) {
            daftarKereta.get(i).tampilkanInfo();
        }
    }

    // Method untuk mengecek apakah NIK valid atau tidak
    public void validasiNik(String nik) {
        if (nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus berjumlah 16 digit");
        }

        // Mengecek satu per satu karakter NIK agar semuanya berupa angka
        for (int i = 0; i < nik.length(); i++) {
            if (!Character.isDigit(nik.charAt(i))) {
                throw new DataPenumpangTidakValidException("NIK hanya boleh berisi angka");
            }
        }
    }

    // Method untuk mengecek nama penumpang agar tidak kosong
    public void validasiNama(String namaPenumpang) {
        if (namaPenumpang.trim().isEmpty()) {
            throw new DataPenumpangTidakValidException("Nama penumpang tidak boleh kosong");
        }
    }

    // Method untuk mencari kereta berdasarkan kode kereta
    public KeretaApi cariKereta(String kodeKereta) {
        for (int i = 0; i < daftarKereta.size(); i++) {
            KeretaApi kereta = daftarKereta.get(i);

            if (kereta.kodeKereta.equalsIgnoreCase(kodeKereta)) {
                return kereta;
            }
        }

        return null;
    }

    // Method untuk memproses pemesanan tiket
    public void pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket)
            throws RuteTidakDitemukanException, TiketHabisException {

        // Validasi data penumpang terlebih dahulu
        validasiNik(nik);
        validasiNama(namaPenumpang);

        // Jumlah tiket tidak boleh 0 atau negatif
        if (jumlahTiket <= 0) {
            throw new DataPenumpangTidakValidException("Jumlah tiket harus lebih dari 0");
        }

        // Mencari kereta berdasarkan kode yang dimasukkan user
        KeretaApi kereta = cariKereta(kodeKereta);

        if (kereta == null) {
            throw new RuteTidakDitemukanException("Kode kereta " + kodeKereta + " tidak ditemukan");
        }

        // Mengecek apakah sisa kursi cukup atau tidak
        if (jumlahTiket > kereta.sisaKursi) {
            throw new TiketHabisException(kereta.namaKereta, kereta.sisaKursi);
        }

        // Jika semua valid, kursi dikurangi sesuai jumlah tiket
        kereta.kurangiKursi(jumlahTiket);

        // Membuat kode booking sederhana
        String kodeBooking = "JEX-" + nomorBooking;
        nomorBooking++;

        // Menampilkan hasil pemesanan
        System.out.println("\n--- Pemesanan Berhasil ---");
        System.out.println("Kode Booking: " + kodeBooking);
        System.out.println("Nama Penumpang: " + namaPenumpang);
        System.out.println("NIK: " + nik);
        System.out.println("Kereta: " + kereta.namaKereta);
        System.out.println("Kode Kereta: " + kereta.kodeKereta);
        System.out.println("Rute: " + kereta.rute);
        System.out.println("Jumlah Tiket: " + jumlahTiket);
        System.out.println("Sisa Kursi: " + kereta.sisaKursi);
    }
}