package minimarket;

public class Produk {
  private String namaProduk;
  private double harga;

  public Produk(String namaProduk, double harga){
    setNamaProduk(namaProduk);
    setHarga(harga);
  }

  public void tampilkanDetail(){
    System.out.println("Nama Produk: " + namaProduk);
    System.out.println("Harga: " + harga);
  }

  public String getNamaProduk(){
    return namaProduk;
  }

  public double getHarga(){
    return harga;
  }

  public void setNamaProduk(String namaProduk){
    if(namaProduk != null){
      this.namaProduk = namaProduk;
    } else {
      System.out.println("Nama Produk tidak boleh null");
    }
  }

  public void setHarga(double harga){
    if(harga > 0){
      this.harga = harga;
    } else {
      System.out.println("Harga harus lebih dari 0");
    }
  }
}

class MakananRingan extends Produk{
  private int masaSimpan;

  public MakananRingan(String namaProduk, double harga, int masaSimpan) {
    super(namaProduk, harga);
    setMasaSimpan(masaSimpan);
  }

  public int getMasaSimpan() {
    return masaSimpan;
  }

  public void setMasaSimpan(int masaSimpan) {
    if (masaSimpan > 0) {
      this.masaSimpan = masaSimpan;
    } else {
      System.out.println("Masa simpan harus lebih dari 0");
    }
  }

  @Override
  public void tampilkanDetail() {
    super.tampilkanDetail();
    System.out.println("Masa Simpan: " + masaSimpan + " hari");
  }

}


