// RekeningReguler mewarisi Rekening
public class RekeningReguler extends Rekening {
  public RekeningReguler(String nomorRekening, String namaPemilik, double saldo, String pin) {
    super(nomorRekening, namaPemilik, saldo, pin);
  }

  // Override tarik: rekening reguler dikenakan biaya admin
  @Override
  public void tarik(double jumlah) {
    double admin = 2500;
    kurangiSaldo(jumlah + admin);
  }
}
