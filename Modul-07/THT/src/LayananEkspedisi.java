public class LayananEkspedisi {
  protected String nomorResi;
  protected double beratAktualKg, panjang, lebar, tinggi;

  public LayananEkspedisi(String nomorResi, double beratAktualKg, double panjang, double lebar, double tinggi) {
    this.nomorResi = nomorResi;
    this.beratAktualKg = beratAktualKg;
    this.panjang = panjang;
    this.lebar = lebar;
    this.tinggi = tinggi;
  }

  public double hitungBeratEfektif() {
    double volumetrik = (panjang * lebar * tinggi) / 6000;
    return Math.max(beratAktualKg, volumetrik);
  }

  public void cetakResi() {
    System.out.println("Nomor Resi: " + nomorResi);
    System.out.println("Berat Efektif: " + hitungBeratEfektif() + " Kg");
  }

  public double hitungOngkir() {
    return 0.0;
  }
}