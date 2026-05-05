import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<MetodePembayaran> daftarPembayaran = new ArrayList<>();
    daftarPembayaran.add(new EWallet());
    daftarPembayaran.add(new KartuKredit());

    for (MetodePembayaran mp : daftarPembayaran) {
      mp.bayar(100000);

      if (mp instanceof EWallet) {
        EWallet ew = (EWallet) mp;
        ew.bayar(50000, "08123456789");
      } else if (mp instanceof KartuKredit) {
        KartuKredit kk = (KartuKredit) mp;
        kk.verifikasiPIN();
      }
    }
  }
}