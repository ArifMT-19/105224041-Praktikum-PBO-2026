import java.util.*;

public class Main {
  public static void main(String[] args) {
    Set<Anggota> setAnggota = new HashSet<>();

    Anggota anggota1 = new Anggota("A001", "Arif", "Mahasiswa");
    Anggota anggota2 = new Anggota("A002", "Razqa", "Mahasiswa");
    Anggota anggota3 = new Anggota("D001", "Pak Ade", "Dosen");
    Anggota anggota4 = new Anggota("D002", "Bu Mere", "Dosen");

    setAnggota.add(anggota1);
    setAnggota.add(anggota2);
    setAnggota.add(anggota3);
    setAnggota.add(anggota4);

    setAnggota.add(new Anggota("A002", "Razqa", "Mahasiswa"));
    setAnggota.add(new Anggota("D001", "Pak Ade", "Dosen"));

    System.out.println("--- Data Anggota ----");
    System.out.println("Jumlah anggota: " + setAnggota.size());
    System.out.println();

    for (Anggota anggota : setAnggota) {
      anggota.tampil();
    }

    Map<String, Buku> databaseBuku = new HashMap<>();

    databaseBuku.put("123-123-123", new Buku("123-123-123", "Artificial Intelligence"));
    databaseBuku.put("456-456-456", new Buku("456-456-456", "Struktur Data"));
    databaseBuku.put("789-789-789", new Buku("789-789-789", "Kalkulus"));
    databaseBuku.put("111-111-111", new Buku("111-111-111", "Artificial Intelligence"));

    AntreanPeminjaman antreanPeminjaman = new AntreanPeminjaman();

    antreanPeminjaman.tambah(anggota1, "123-123-123");
    antreanPeminjaman.tambah(anggota3, "456-456-456");
    antreanPeminjaman.tambah(anggota2, "456-456-456");
    antreanPeminjaman.tambah(anggota4, "789-789-789");

    System.out.println("--- Antrean Peminjaman ----");
    System.out.println("Jumlah antrean: " + antreanPeminjaman.jumlah());
    System.out.println();

    antreanPeminjaman.tampil();
    System.out.println();

    Map<String, String> bukuSedangDipinjam = new HashMap<>();

    System.out.println("--- Proses Antrean ----");

    while (!antreanPeminjaman.isKosong()) {
      String proses = antreanPeminjaman.proses();

      String[] data = proses.split("#");
      String idAnggota = data[0];
      String isbn = data[1];

      Anggota anggota = cariAnggota(setAnggota, idAnggota);

      if (anggota == null) {
        System.out.println(proses + " ditolak karena anggota tidak terdaftar");
      } else if (!databaseBuku.containsKey(isbn)) {
        System.out.println(proses + " ditolak karena buku tidak terdaftar");
      } else if (bukuSedangDipinjam.containsKey(isbn)) {
        System.out.println(proses + " ditolak karena buku sedang dipinjam orang lain");
      } else {
        bukuSedangDipinjam.put(isbn, idAnggota);
        System.out.println(proses + " berhasil dipinjam");
      }
    }

    System.out.println();
    System.out.println("----- Laporan Buku Sedang Dipinjam ---");

    List<String> daftarIsbn = new ArrayList<>(bukuSedangDipinjam.keySet());

    daftarIsbn.sort(Comparator.comparing(isbn -> databaseBuku.get(isbn).getJudul()));

    for (String isbn : daftarIsbn) {
      Buku buku = databaseBuku.get(isbn);
      String idAnggota = bukuSedangDipinjam.get(isbn);

      System.out.println("Judul Buku: " + buku.getJudul());
      System.out.println("Isbn: " + isbn);
      System.out.println("Peminjaman: " + idAnggota);
      System.out.println();
    }
  }

  public static Anggota cariAnggota(Set<Anggota> setAnggota, String idAnggota) {
    for (Anggota anggota : setAnggota) {
      if (anggota.getId().equals(idAnggota)) {
        return anggota;
      }
    }
    return null;
  }
}