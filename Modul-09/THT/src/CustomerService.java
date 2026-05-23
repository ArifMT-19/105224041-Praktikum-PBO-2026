// CustomerService berdiri sendiri, tidak dimiliki oleh Nasabah
public class CustomerService {
  public void terimaKeluhan(String namaNasabah, String keluhan) {
    System.out.println("Keluhan dari " + namaNasabah + ": " + keluhan);
  }
}
