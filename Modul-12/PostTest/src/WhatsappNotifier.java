// SOLID - SRP: Class ini khusus kirim WhatsApp
public class WhatsappNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Kirim notifikasi WhatsApp");
    }
}