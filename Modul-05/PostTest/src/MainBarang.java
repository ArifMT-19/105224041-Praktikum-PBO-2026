public class MainBarang {
  public static void main(String[] args) {
    Barang barang = new Barang("B001", "Laptop");


    barang.setHarga(-100); 
    barang.kurangiStok(10); 

    barang.setHarga(5000000);
    barang.tambahStok(20);
    barang.kurangiStok(5);
    barang.setKategori("Elektronik"); 

    barang.tampilkanDetailBarang();
  }
}