public class Mobil {
  private String merkMobil, warna;
  private Mesin mesin;
  private Ban[] daftarBan;

  public Mobil(String merkMobil, String warna, String tipeMesin, int kapasitasCC) {
    this.merkMobil = merkMobil;
    this.warna = warna;
    this.mesin = new Mesin(tipeMesin, kapasitasCC);
    this.daftarBan = new Ban[4];
  }

  public String getMerkMobil() {
    return merkMobil;
  }

  public String getWarna() {
    return warna;
  }

  public void pasangSetBan(Ban[] setBan) {
    if (setBan.length > 4) {
      System.out.println("Gagal memasang ban. Maksimal hanya 4 ban");
      return;
    }

    for (int i = 0; i < setBan.length; i++) {
      daftarBan[i] = setBan[i];
    }

    System.out.println("Set ban berhasil dipasang ke mobil");
  }

  public void tampilkanSpesifikasi() {
    System.out.println("--- Spesifikasi Mobil ---");
    System.out.println("Merk Mobil : " + merkMobil);
    System.out.println("Warna      : " + warna);

    System.out.println("\n--- Data Mesim ----");
    mesin.tampilkanMesin();

    System.out.println("\n--- Data Ban----");
    for (int i = 0; i < daftarBan.length; i++) {
      if (daftarBan[i] != null) {
        System.out.println("Ban ke-" + (i + 1));
        daftarBan[i].tampilkanBan();
        System.out.println();
      } else {
        System.out.println("Ban ke-" + (i + 1) + " belum terpasang");
      }
    }
  }
}