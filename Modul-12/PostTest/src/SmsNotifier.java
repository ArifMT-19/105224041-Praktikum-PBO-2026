// SOLID - SRP: Class ini khusus kirim SMS
public class SmsNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Kirim notifikasi SMS");
    }
}