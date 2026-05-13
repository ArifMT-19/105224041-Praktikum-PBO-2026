public class LayananReguler extends LayananEkspedisi {

  public LayananReguler(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
    super(nomorResi, beratAktualKg, panjang, lebar, tinggi);
  }

  @Override
  public double hitungOngkir() {
    return hitungBeratEfektif() * 15000;
  }

  public double hitungOngkir(boolean isMember, int jarakKm) {
    double total = hitungOngkir();

    if(isMember) {
      total = total - (total * 0.1);
    }

    total = total + (500 * jarakKm);

    return total;
  }
}