// SOLID - ISP: Voucher tidak dipaksa punya method refund
public class GiftVoucher implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Bayar dengan gift voucher");
    }
}