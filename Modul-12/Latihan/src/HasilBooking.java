// SOLID - SRP: HasilBooking cuma jadi wadah data hasil pesan tiket
public class HasilBooking {
    private final String kodeBooking;
    private final String namaPenumpang;
    private final String nik;
    private final String kodeKereta;
    private final String namaKereta;
    private final String rute;
    private final int jumlahTiket;
    private final int sisaKursi;

    public HasilBooking(String kodeBooking, String namaPenumpang, String nik, KeretaApi kereta, int jumlahTiket) {
        this.kodeBooking = kodeBooking;
        this.namaPenumpang = namaPenumpang;
        this.nik = nik;
        this.kodeKereta = kereta.getKodeKereta();
        this.namaKereta = kereta.getNamaKereta();
        this.rute = kereta.getRute();
        this.jumlahTiket = jumlahTiket;
        this.sisaKursi = kereta.getSisaKursi();
    }

    public String getKodeBooking() {
        return kodeBooking;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public String getNik() {
        return nik;
    }

    public String getKodeKereta() {
        return kodeKereta;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getRute() {
        return rute;
    }

    public int getJumlahTiket() {
        return jumlahTiket;
    }

    public int getSisaKursi() {
        return sisaKursi;
    }
}
