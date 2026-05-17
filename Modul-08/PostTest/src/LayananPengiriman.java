public abstract class LayananPengiriman {
  protected String noResi;
  protected double beratBarang, jarakTempuh;

  public LayananPengiriman(String noResi, double beratBarang, double jarakTempuh) {
    this.noResi = noResi;
    this.beratBarang = beratBarang;
    this.jarakTempuh = jarakTempuh;
  }

  public void cetakResi() {
    System.out.println("Nomor Resi   : " + noResi);
    System.out.println("Berat Barang : " + beratBarang + " Kg");
    System.out.println("Jarak Tempuh : " + jarakTempuh + " Km");
  }

  public abstract double hitungOngkosKirim();
}