package rental;

public class Mobil extends Kendaraan {
  private int kapasitasPenumpang;

  public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasPenumpang){
    super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
    setKapasitasPenumpang(kapasitasPenumpang);
  }

  public int getKapasitasPenumpang(){
    return kapasitasPenumpang;
  }

  public void setKapasitasPenumpang(int kapasitasPenumpang){
    if(kapasitasPenumpang > 0){
      this.kapasitasPenumpang = kapasitasPenumpang;
    } else {
      System.out.println("Kapasitas tidak valid");
    }
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Kapasitas: " + kapasitasPenumpang);
  }

  @Override
  public double hitungHargaSewa(int hari){
    double total = super.hitungHargaSewa(hari);
    total += 50000 * hari;

    if(getKapasitasPenumpang() > 5){
      total += 50000;
    }
    return total;
  }
}