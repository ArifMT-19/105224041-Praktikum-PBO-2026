public class Mesin {
  private String tipeMesin;
  private int kapasitasCC;

  public Mesin(String tipeMesin, int kapasitasCC) {
    this.tipeMesin = tipeMesin;
    this.kapasitasCC = kapasitasCC;
  }

  public String getTipeMesin() {
    return tipeMesin;
  }

  public int getKapasitasCC() {
    return kapasitasCC;
  }

  public void tampilkanMesin() {
    System.out.println("Tipe Mesin: " + tipeMesin);
    System.out.println("Kapasitas CC: " + kapasitasCC);
  }
}