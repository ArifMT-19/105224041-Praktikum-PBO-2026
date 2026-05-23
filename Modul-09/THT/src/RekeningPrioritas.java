// RekeningPrioritas mewarisi Rekening
public class RekeningPrioritas extends Rekening {
  public RekeningPrioritas(String nomorRekening, String namaPemilik, double saldo, String pin) {
    super(nomorRekening, namaPemilik, saldo, pin);
  }

  // Override tarik: prioritas bebas admin, tetapi minimal tarik 1 juta
  @Override
  public void tarik(double jumlah) {
    if (jumlah >= 1000000) {
      kurangiSaldo(jumlah);
    } else {
      System.out.println("Minimal penarikan prioritas Rp1000000");
    }
  }
}
