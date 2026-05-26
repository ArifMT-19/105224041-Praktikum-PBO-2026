import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Buku> katalogBuku = new HashMap<>();

    katalogBuku.put("123-123-123", new Buku("123-123-123", "Dasar Pemrograman"));
    katalogBuku.put("456-456-456", new Buku("456-456-456", "Struktur Data"));
    katalogBuku.put("789-789-789", new Buku("789-789-789", "Kalkulus"));

    System.out.println("--- Katalog Buku ---");

    Buku cariBuku = katalogBuku.get("456-456-456");

    if (cariBuku != null) {
      cariBuku.tampil();
    } else {
      System.out.println("Buku tidak ditemukan");
    }

    Set<Anggota> daftarAnggota = new HashSet<>();

    Anggota anggota1 = new Anggota("A001", "Arif", "Mahasiswa");
    Anggota anggota2 = new Anggota("A002", "Razqa", "Mahasiswa");
    Anggota anggota3 = new Anggota("D001", "Pak Budi", "Dosen");

    daftarAnggota.add(anggota1);
    daftarAnggota.add(anggota2);
    daftarAnggota.add(anggota3);
    daftarAnggota.add(new Anggota("A002", "Razqa Duplikat", "Mahasiswa"));

    System.out.println("--- DATA ANGGOTA ---");
    System.out.println("Jumlah anggota: " + daftarAnggota.size());
    System.out.println();

    for (Anggota anggota : daftarAnggota) {
      anggota.tampil();
    }

    AntreanPeminjaman antreanPeminjaman = new AntreanPeminjaman();

    antreanPeminjaman.tambah(anggota1, "123-123-123");
    antreanPeminjaman.tambah(anggota3, "456-456-456");
    antreanPeminjaman.tambah(anggota2, "456-456-456");
    antreanPeminjaman.tambah(anggota1, "789-789-789");

    System.out.println("--- Antrean Peminjaman ----");
    System.out.println("Jumlah antrean: " + antreanPeminjaman.jumlah());
    System.out.println();

    antreanPeminjaman.tampil();
    System.out.println();

    Map<String, String> bukuSedangDipinjam = new HashMap<>();

    System.out.println("--- Preses Antrean -----");

    while (!antreanPeminjaman.isKosong()) {
      String proses = antreanPeminjaman.proses();

      String[] data = proses.split("#");
      String idAnggota = data[0];
      String isbn = data[1];

      Anggota anggota = cariAnggota(daftarAnggota, idAnggota);

      if (anggota == null) {
        System.out.println(proses + " ditolak karena anggota tidak terdaftar");
      } else if (!katalogBuku.containsKey(isbn)) {
        System.out.println(proses + " ditolak karena buku tidak terdaftar");
      } else if (bukuSedangDipinjam.containsKey(isbn)) {
        System.out.println(proses + " ditolak karena buku sedang dipinjam orang lain");
      } else {
        bukuSedangDipinjam.put(isbn, idAnggota);
        System.out.println(proses + " berhasil dipinjam");
      }
    }

    System.out.println();
    System.out.println("---- Laporan Buku Sedang Dipinjam ---");

    List<String> daftarIsbn = new ArrayList<>(bukuSedangDipinjam.keySet());

    Collections.sort(daftarIsbn, new Comparator<String>() {
      @Override
      public int compare(String isbn1, String isbn2) {
        String judul1 = katalogBuku.get(isbn1).judul;
        String judul2 = katalogBuku.get(isbn2).judul;

        return judul1.compareToIgnoreCase(judul2);
      }
    });

    for (String isbn : daftarIsbn) {
      Buku buku = katalogBuku.get(isbn);
      String idAnggota = bukuSedangDipinjam.get(isbn);

      System.out.println("Judul Buku: " + buku.judul);
      System.out.println("Isbn: " + isbn);
      System.out.println("Peminjam: " + idAnggota);
      System.out.println();
    }
  }

  public static Anggota cariAnggota(Set<Anggota> daftarAnggota, String idAnggota) {
    for (Anggota anggota : daftarAnggota) {
      if (anggota.idAnggota.equals(idAnggota)) {
        return anggota;
      }
    }

    return null;
  }
}