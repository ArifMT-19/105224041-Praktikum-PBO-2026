// SOLID - OCP: Jenis notifikasi baru bisa ditambah tanpa ubah service
public interface Notifier {
    void send(String message);
}