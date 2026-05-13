public class LayananInternasional extends LayananEkspedisi {
  private String negaraTujuan;
  private double nilaiBarangUSD;

  public LayananInternasional(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi, String negaraTujuan, double nilaiBarangUSD) {
    super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
    this.negaraTujuan = negaraTujuan;
    this.nilaiBarangUSD = nilaiBarangUSD;
  }

  @Override
  public double hitungOngkir() {
    double ongkirDasar = hitungBeratEfektif() * 200000;
    double pajak = 0;

    if(nilaiBarangUSD > 50) {
      pajak = ongkirDasar * 0.2;
    }

    return ongkirDasar + pajak;
  }

  public void cetakManifest() {
    System.out.println("Manifest Internasional ke " + negaraTujuan + " - Deklarasi Nilai: $" + nilaiBarangUSD);
  }
}