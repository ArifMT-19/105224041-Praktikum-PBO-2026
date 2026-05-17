import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Pembayaran> daftarPembayaran = new ArrayList<>();

    daftarPembayaran.add(new KartuKredit("Arif", 500000, "1234-5678-9999"));
    daftarPembayaran.add(new EWallet("Budi", 250000, "081234567890"));

    for(Pembayaran pembayaran : daftarPembayaran) {
      pembayaran.tampilkanDetail();

      if(pembayaran instanceof Keamanan) {
        Keamanan keamanan = (Keamanan) pembayaran;
        if(keamanan.autentikasi()) {
          pembayaran.prosesPembayaran();
        }
      }
      System.out.println();
    }
  }
}