package rental;

public class Motor extends Kendaraan {
  private int kapasitasMesin;

  public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitasMesin){
    super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
    setKapasitasMesin(kapasitasMesin);
  }

  public int getKapasitasMesin(){
    return kapasitasMesin;
  }

  public void setKapasitasMesin(int kapasitasMesin){
    if(kapasitasMesin > 0){
      this.kapasitasMesin = kapasitasMesin;
    } else {
      System.out.println("CC tidak valid");
    }
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("CC: " + kapasitasMesin);
  }

  @Override
  public double hitungHargaSewa(int hari){
    double total = super.hitungHargaSewa(hari);

    if(getKapasitasMesin() >= 250){
      total += 25000 * hari;
    }
    return total;
  }
}