public class Barang {
  private String idBarang, nama, kategori;
  private int stok;
  private double hargaSatuan;

  public Barang(String idBarang, String nama) {
    setIdBarang(idBarang);
    setNama(nama);
    this.stok = 0;
    this.hargaSatuan = 0;
  }

  public String getIdBarang() {
    return idBarang;
  }

  public void setIdBarang(String idBarang) {
    if (idBarang != null) {
      this.idBarang = idBarang;
    } else {
      System.out.println("ID Barang tidak boleh kosong");
    }
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    if (nama != null) {
      this.nama = nama;
    } else {
      System.out.println("Nama tidak boleh kosong");
    }
  }

  public double getHarga() {
    return hargaSatuan;
  }

  public void setHarga(double hargaSatuan) {
    if (hargaSatuan > 0) {
      this.hargaSatuan = hargaSatuan;
    } else {
      System.out.println("Harga harus lebih dari 0");
    }
  }

  public int getStok() {
    return stok;
  }

  public void setStok(int stok) {
    if (stok >= 0) {
      this.stok = stok;
    } else {
      System.out.println("Stok tidak boleh negatif");
    }
  }

  public String getKategori() {
    return kategori;
  }

  public void setKategori(String kategori) {
    if (kategori != null) {
      this.kategori = kategori;
    } else {
      System.out.println("Kategori tidak boleh kosong");
    }
  }

  public void tambahStok(int jumlah) {
    if (jumlah > 0) {
      stok += jumlah;
    } else {
      System.out.println("Penambahan harus lebih dari 0");
    }
  }

  public void kurangiStok(int jumlah) {
    if (jumlah > 0 && jumlah <= stok) {
      stok -= jumlah;
    } else {
      System.out.println("Pengurangan gagal, stok tidak cukup");
    }
  }

  public void tampilkanDetailBarang() {
    System.out.println("\nID: " + idBarang);
    System.out.println("Nama: " + nama);
    System.out.println("Kategori: " + kategori);
    System.out.println("Stok: " + stok);
    System.out.println("Harga: " + hargaSatuan);
  }
}