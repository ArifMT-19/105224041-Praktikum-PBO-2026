// SOLID - SRP: Class ini khusus kirim email
public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Kirim notifikasi email");
    }
}