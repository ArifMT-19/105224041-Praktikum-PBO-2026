public class EWallet extends Pembayaran implements Keamanan {
  private String nomorHP;

  public EWallet(String namaPembayar, double nominal, String nomorHP) {
    super(namaPembayar, nominal);
    this.nomorHP = nomorHP;
  }

  @Override
  public boolean autentikasi() {
    System.out.println("Autentikasi berhasil");
    return true;
  }

  @Override
  public void prosesPembayaran() {
    System.out.println("Nomor HP      : " + nomorHP);
    System.out.println("Biaya Admin   : Rp0");
    System.out.println("Total Tagihan : Rp" + nominal);
  }
}