// SOLID - ISP: Kontrak kecil khusus untuk pembayaran
public interface PaymentMethod {
    void pay(double amount);
}