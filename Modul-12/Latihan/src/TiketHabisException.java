// SOLID - SRP: Error khusus saat kursi tidak cukup
public class TiketHabisException extends Exception {
    private final String namaKereta;
    private final int sisaKursi;

    public TiketHabisException(String namaKereta, int sisaKursi) {
        super("Tiket tidak mencukupi untuk kereta " + namaKereta);
        this.namaKereta = namaKereta;
        this.sisaKursi = sisaKursi;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public int getSisaKursi() {
        return sisaKursi;
    }
}
