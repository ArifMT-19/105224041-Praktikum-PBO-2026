public class Buku {
  String isbn;
  String judul;

  public Buku(String isbn, String judul) {
    this.isbn = isbn;
    this.judul = judul;
  }

  public void tampil() {
    System.out.println("Isbn: " + isbn);
    System.out.println("Judul: " + judul);
    System.out.println();
  }
}