public class Buku {
  private String isbn;
  private String judul;

  public Buku(String isbn, String judul) {
    this.isbn = isbn;
    this.judul = judul;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getJudul() {
    return judul;
  }

  public void tampil() {
    System.out.println("Isbn: " + isbn);
    System.out.println("Judul: " + judul);
    System.out.println();
  }
}