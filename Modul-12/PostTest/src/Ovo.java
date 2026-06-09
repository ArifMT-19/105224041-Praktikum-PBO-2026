// SOLID - LSP: OVO bisa dipakai sebagai PaymentMethod
public class Ovo implements PaymentMethod, RefundablePayment {
    public void pay(double amount) {
        System.out.println("Bayar dengan OVO");
    }

    public void refund(double amount) {
        System.out.println("Refund OVO");
    }
}