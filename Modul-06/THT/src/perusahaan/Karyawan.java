package perusahaan;

public class Karyawan {
  private String idKaryawan, nama;
  private int tahunMasuk;
  private double gajiPokok, ratingKinerja;

  public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja){
    setIdKaryawan(idKaryawan);
    setNama(nama);
    setTahunMasuk(tahunMasuk);
    setGajiPokok(gajiPokok);
    setRatingKinerja(ratingKinerja);
  }

  public String getIdKaryawan(){
    return idKaryawan;
  }

  public String getNama(){
    return nama;
  }

  public int getTahunMasuk(){
    return tahunMasuk;
  }

  public double getGajiPokok(){
    return gajiPokok;
  }

  public double getRatingKinerja(){
    return ratingKinerja;
  }

  public void setIdKaryawan(String idKaryawan){
    if(idKaryawan != null){
      this.idKaryawan = idKaryawan;
    } else {
      System.out.println("ID tidak boleh null");
    }
  }

  public void setNama(String nama){
    if(nama != null){
      this.nama = nama;
    } else {
      System.out.println("Nama tidak boleh null");
    }
  }

  public void setTahunMasuk(int tahunMasuk){
    if(tahunMasuk > 0){
      this.tahunMasuk = tahunMasuk;
    } else {
      System.out.println("Tahun tidak valid");
    }
  }

  public void setGajiPokok(double gajiPokok){
    if(gajiPokok > 0){
      this.gajiPokok = gajiPokok;
    } else {
      System.out.println("Gaji harus > 0");
    }
  }

  public void setRatingKinerja(double ratingKinerja){
    if(ratingKinerja >= 1.0 && ratingKinerja <= 5.0){
      this.ratingKinerja = ratingKinerja;
    } else {
      System.out.println("Rating harus 1 - 5");
    }
  }

  public void displayInfo(){
    System.out.println("ID: " + idKaryawan);
    System.out.println("Nama: " + nama);
    System.out.println("Tahun Masuk: " + tahunMasuk);
    System.out.println("Rating: " + ratingKinerja);
    System.out.println("Gaji Pokok: " + gajiPokok);
  }

  public double hitungGajiTotal(int tahunSekarang){
    int masaKerja = tahunSekarang - getTahunMasuk();
    double total = getGajiPokok() * masaKerja;

    if(getRatingKinerja() < 2.5){
      total *= 0.9;
    }
    return total;
  }
}