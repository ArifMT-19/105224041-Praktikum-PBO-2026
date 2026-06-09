// SOLID - LSP: CreditCard bisa menggantikan PaymentMethod
public class CreditCard implements PaymentMethod, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Bayar dengan kartu kredit");
    }

    public void refund(double amount) {
        System.out.println("Refund kartu kredit");
    }
}