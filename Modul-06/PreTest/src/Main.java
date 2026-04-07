import minimarket.*;

public class Main {
  public static void main(String[] args) {
    Produk produk1 = new Produk("Sabun Mandi", 6000);
    produk1.tampilkanDetail();
    System.out.println();

    MakananRingan snack1 = new MakananRingan("Keripik Kentang", 1700, "Barbeque");
    snack1.tampilkanDetail();
  }
}