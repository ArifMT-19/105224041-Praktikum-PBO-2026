import java.util.List;

// SOLID - DIP: Kontrak sederhana untuk fitur reservasi
public interface ReservasiService {
    List<KeretaApi> lihatJadwal();

    HasilBooking pesanTiket(String kodeKereta, String nik, String namaPenumpang, int jumlahTiket)
            throws RuteTidakDitemukanException, TiketHabisException;
}
