public class Main {
  public static void main(String[] args) {
    SistemGudang gudang = new SistemGudang();

    gudang.tambahBarangBaru("B01", "Laptop", "Elektronik", 10);
    gudang.tambahBarangBaru("B02", "Buku Tulis", "ATK", 50);
    gudang.tambahBarangBaru("B03", "Meja Kantor", "Furniture", 5);
    gudang.tambahBarangBaru("B02", "Buku Gambar", "ATK", 57);
    

    gudang.tambahStok("B01", 5);
    gudang.kurangiStok("B02", 10);
    gudang.kurangiStok("B03", 10);
    gudang.cetakLaporan();
  }
}