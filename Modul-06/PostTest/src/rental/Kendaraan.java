package rental;

public class Kendaraan {
  private String nomorPolisi, merk;
  private int tahunProduksi;
  private double hargaSewaDasar;

  public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar){
    setNomorPolisi(nomorPolisi);
    setMerk(merk);
    setTahunProduksi(tahunProduksi);
    setHargaSewaDasar(hargaSewaDasar);
  }

  public String getNomorPolisi(){
    return nomorPolisi;
  }

  public String getMerk(){
    return merk;
  }

  public int getTahunProduksi(){
    return tahunProduksi;
  }

  public double getHargaSewaDasar(){
    return hargaSewaDasar;
  }

  public void setNomorPolisi(String nomorPolisi){
    if(nomorPolisi != null){
      this.nomorPolisi = nomorPolisi;
    } else {
      System.out.println("Nomor polisi tidak boleh null");
    }
  }

  public void setMerk(String merk){
    if(merk != null){
      this.merk = merk;
    } else {
      System.out.println("Merk tidak boleh null");
    }
  }

  public void setTahunProduksi(int tahunProduksi){
    if(tahunProduksi > 0){
      this.tahunProduksi = tahunProduksi;
    } else {
      System.out.println("Tahun tidak valid");
    }
  }

  public void setHargaSewaDasar(double hargaSewaDasar){
    if(hargaSewaDasar > 0){
      this.hargaSewaDasar = hargaSewaDasar;
    } else {
      System.out.println("Harga sewa harus > 0");
    }
  }

  public void displayInfo(){
    System.out.println("No Polisi: " + nomorPolisi);
    System.out.println("Merk: " + merk);
    System.out.println("Tahun: " + tahunProduksi);
    System.out.println("Harga Sewa/Hari: " + hargaSewaDasar);
  }

  public double hitungHargaSewa(int hari){
    double total = getHargaSewaDasar() * hari;

    if(getTahunProduksi() < 2015){
      total *= 0.9;
    }
    return total;
  }
}