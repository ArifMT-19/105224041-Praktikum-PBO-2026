public class Perpustakaan {
  PenghitungDenda penghitungDenda;
  FormatStruk formatStruk;

  public Perpustakaan(PenghitungDenda penghitungDenda, FormatStruk formatStruk) {
    this.penghitungDenda = penghitungDenda;
    this.formatStruk = formatStruk;
  }

  public Buku cariBuku(String judul) {
    return null;
  }

  public void pinjamBuku(String judul, String namaAnggota) {
  }

  public void kembalikanBuku(String judul, String namaAnggota, int hariTerlambat) {
    int denda = penghitungDenda.hitungDenda(hariTerlambat);
    formatStruk.cetakStruk(namaAnggota, judul, hariTerlambat, denda);
  }
}