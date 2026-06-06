// Custom unchecked exception untuk menangani data penumpang yang tidak valid
public class DataPenumpangTidakValidException extends RuntimeException {
    public DataPenumpangTidakValidException(String pesan) {
        super(pesan); // Mengirim pesan error ke class RuntimeException
    }
}