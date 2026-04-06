public class MainKamarHotel {
  public static void main(String[] args) {

    KamarHotel kamar1 = new KamarHotel("101", "Presidential", 3, -10000);
    kamar1.setTipeKamar("Presidential");
    kamar1.setHargaPerMalam(-10000);

    KamarHotel kamar2 = new KamarHotel("102", "Premium", 2);
    kamar2.pesanKamar(4);
    kamar2.pesanKamar(2);
    kamar2.pesanKamar();

    System.out.println("\n--- Total pembayaran ---");
    double total1 = kamar1.hitungTotalBayar(2, "PROMO");
    System.out.println("Total kamar1: " + total1);
    double total2 = kamar2.hitungTotalBayar(4, "PROMO");
    System.out.println("Total kamar2: " + total2);

    kamar1.tampil();
    kamar2.tampil();
  }
}