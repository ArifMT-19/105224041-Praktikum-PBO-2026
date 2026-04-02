public class MainMhs {
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa();

    mhs.nama = "GIOIG";
    System.out.println("Nama Mahasiswa: " + mhs.nama);

    mhs.setNim("105224048");
    System.out.println("NIM Mahasiswa: " + mhs.getNim());
  }
}