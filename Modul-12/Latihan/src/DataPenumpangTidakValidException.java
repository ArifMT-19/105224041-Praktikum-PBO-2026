// SOLID - SRP: Error khusus untuk data penumpang atau jumlah tiket
public class DataPenumpangTidakValidException extends RuntimeException {
    public DataPenumpangTidakValidException(String pesan) {
        super(pesan);
    }
}
