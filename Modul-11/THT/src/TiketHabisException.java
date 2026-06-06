// Custom checked exception untuk menangani jumlah tiket yang melebihi sisa kursi
public class TiketHabisException extends Exception {
    String namaKereta;
    int sisaKursi;

    public TiketHabisException(String namaKereta, int sisaKursi) {
        super("Tiket tidak mencukupi untuk kereta " + namaKereta);
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }

    // Mengambil nama kereta yang tiketnya tidak mencukupi
    public String getNamaKereta() {
        return namaKereta;
    }

    // Mengambil jumlah sisa kursi yang tersedia
    public int getSisaKursi() {
        return sisaKursi;
    }
}