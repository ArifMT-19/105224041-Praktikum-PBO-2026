public class Film {
  String judul;
  int harga;

  public Film(String judul, int harga) {
    this.judul = judul;
    this.harga = harga;
  }

  public void tampil() {
    System.out.println("Judul: " + judul);
    System.out.println("Harga: " + harga);
    System.out.println();
  }
}