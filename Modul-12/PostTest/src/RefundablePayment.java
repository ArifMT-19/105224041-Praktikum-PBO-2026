// SOLID - ISP: Dipisah karena tidak semua pembayaran bisa refund
public interface RefundablePayment {
    void refund(double amount);
}