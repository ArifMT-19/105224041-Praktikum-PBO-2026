public class Barang {
  String idBarang, namaBarang, kategori;
  int stok;

  public Barang(String idBarang, String namaBarang, String kategori, int stok) {
    this.idBarang = idBarang;
    this.namaBarang = namaBarang;
    this.kategori = kategori;
    this.stok = stok;
  }

  public void tampil() {
    System.out.println("ID Barang: " + idBarang);
    System.out.println("Nama Barang: " + namaBarang);
    System.out.println("Kategori: " + kategori);
    System.out.println("Stok: " + stok);
  }
}