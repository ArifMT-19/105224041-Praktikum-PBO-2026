import java.util.*;

public class SistemGudang {
  Map<String, Barang> databaseBarang = new HashMap<>();
  Set<String> kategoriUnik = new HashSet<>();
  List<String> riwayat = new ArrayList<>();

  public void tambahBarangBaru(String id, String nama, String kategori, int stok) {
    if (databaseBarang.containsKey(id)) {
      System.out.println("Barang gagal ditambahkan karena ID " + id + " sudah ada");
      riwayat.add("Gagal Tambah Barang: ID " + id + " sudah terdaftar");
    } else {
      Barang barang = new Barang(id, nama, kategori, stok);

      databaseBarang.put(id, barang);
      kategoriUnik.add(kategori);

      System.out.println("Barang " + nama + " berhasil ditambahkan");
      riwayat.add("Barang Baru: " + id + " - " + nama + " stok awal " + stok + " unit");
    }
  }

  public void tambahStok(String id, int jumlah) {
    if (databaseBarang.containsKey(id)) {
      Barang barang = databaseBarang.get(id);
      barang.stok += jumlah;

      System.out.println("Stok barang " + id + " berhasil ditambah " + jumlah + " unit");
      riwayat.add("Barang Masuk: " + id + " ditambah " + jumlah + " unit");
    } else {
      System.out.println("Tambah stok gagal karena ID " + id + " tidak ditemukan");
      riwayat.add("Gagal Tambah Stok: ID " + id + " tidak ditemukan");
    }
  }

  public void kurangiStok(String id, int jumlah) {
    if (!databaseBarang.containsKey(id)) {
      System.out.println("Kurangi stok gagal karena ID " + id + " tidak ditemukan");
      riwayat.add("Gagal Kurangi Stok: ID " + id + " tidak ditemukan");
    } else {
      Barang barang = databaseBarang.get(id);

      if (barang.stok >= jumlah) {
        barang.stok -= jumlah;

        System.out.println("Stok barang " + id + " berhasil dikurangi " + jumlah + " unit");
        riwayat.add("Barang Keluar: " + id + " dikurangi " + jumlah + " unit");
      } else {
        System.out.println("Kurangi stok gagal karena stok barang " + id + " tidak mencukupi");
        riwayat.add("Gagal Kurangi Stok: " + id + " stok kurang");
      }
    }
  }

  public void cetakLaporan() {
    System.out.println("\n--- Daftar Kategori ---");
    for (String kategori : kategoriUnik) {
      System.out.println(kategori);
    }

    System.out.println("\n--- Sisa Stok Barang ---");
    for (Barang barang : databaseBarang.values()) {
      barang.tampil();
      System.out.println();
    }

    System.out.println("\n--- Riwayat Transaki ----");
    for (String data : riwayat) {
      System.out.println(data);
    }
  }
}