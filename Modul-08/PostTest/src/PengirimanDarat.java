public class PengirimanDarat extends LayananPengiriman implements LacakKargo {
  private String jenisTruk, statusSaatIni;

  public PengirimanDarat(String noResi, double beratBarang, double jarakTempuh, String jenisTruk) {
    super(noResi, beratBarang, jarakTempuh);
    this.jenisTruk = jenisTruk;
    this.statusSaatIni = "Menunggu Kurir";
  }

  @Override
  public double hitungOngkosKirim() {

    double total = (beratBarang * 5000) + (jarakTempuh * 2000);

    if(jenisTruk.equalsIgnoreCase("Tronton")) {
      total += 150000;
    }

    return total;
  }

  @Override
  public void updateStatus(String status) {
    statusSaatIni = status;
  }

  @Override
  public String cekLokasiTerakhir() {
    return statusSaatIni;
  }
}