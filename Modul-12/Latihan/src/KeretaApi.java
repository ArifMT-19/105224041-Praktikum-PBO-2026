// SOLID - SRP: KeretaApi cuma menyimpan data kereta dan sisa kursi
public class KeretaApi {
    // SOLID - SRP: Data dijaga lewat method supaya perubahan lebih jelas
    private final String kodeKereta;
    private final String namaKereta;
    private final String rute;
    private int sisaKursi;

    public KeretaApi(String kodeKereta, String namaKereta, String rute, int sisaKursi) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.rute = rute;
        this.sisaKursi = sisaKursi;
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

    public int getSisaKursi() {
        return sisaKursi;
    }

    public boolean kursiCukup(int jumlahTiket) {
        return jumlahTiket <= sisaKursi;
    }

    public void kurangiKursi(int jumlahTiket) {
        sisaKursi -= jumlahTiket;
    }
}
