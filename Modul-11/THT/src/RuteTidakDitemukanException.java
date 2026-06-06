// Custom checked exception untuk menangani kode/rute kereta yang tidak ditemukan
public class RuteTidakDitemukanException extends Exception {
    public RuteTidakDitemukanException(String pesan) {
        super(pesan); // Mengirim pesan error ke class Exception
    }
}