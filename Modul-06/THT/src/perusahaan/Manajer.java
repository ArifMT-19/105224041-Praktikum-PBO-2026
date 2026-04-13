package perusahaan;

public class Manajer extends Karyawan {
  private String divisi;
  private int jumlahAnggotaTim;

  public Manajer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim){
    super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
    setDivisi(divisi);
    setJumlahAnggotaTim(jumlahAnggotaTim);
  }

  public String getDivisi(){
    return divisi;
  }

  public int getJumlahAnggotaTim(){
    return jumlahAnggotaTim;
  }

  public void setDivisi(String divisi){
    if(divisi != null){
      this.divisi = divisi;
    } else {
      System.out.println("Divisi tidak boleh null");
    }
  }

  public void setJumlahAnggotaTim(int jumlahAnggotaTim){
    if(jumlahAnggotaTim >= 0){
      this.jumlahAnggotaTim = jumlahAnggotaTim;
    } else {
      System.out.println("Jumlah anggota tidak valid");
    }
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Divisi: " + divisi);
    System.out.println("Jumlah Tim: " + jumlahAnggotaTim);
  }

  @Override
  public double hitungGajiTotal(int tahunSekarang){
    double total = super.hitungGajiTotal(tahunSekarang);
    total += getJumlahAnggotaTim() * 300000;

    if(getRatingKinerja() > 4.5){
      total *= 1.15;
    }
    return total;
  }
}