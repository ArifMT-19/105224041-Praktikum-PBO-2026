public class Main {
  public static void main(String[] args) {
    RekeningBank rb = new RekeningBank(12345, 100000);
    rb.cetakRekening();
    rb.tambahSaldo(50000);
    rb.cetakRekening();
  }

}
