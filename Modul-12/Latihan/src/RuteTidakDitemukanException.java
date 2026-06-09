// SOLID - SRP: Error khusus saat kode kereta tidak ada
public class RuteTidakDitemukanException extends Exception {
    public RuteTidakDitemukanException(String pesan) {
        super(pesan);
    }
}
