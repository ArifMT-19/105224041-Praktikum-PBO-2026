public class RumahSakit {
  private String namaRS;
  private Ruangan[] daftarRuangan;
  private Dokter[] daftarDokter;

  public RumahSakit(String namaRS) {
    this.namaRS = namaRS;

    daftarRuangan = new Ruangan[2];
    daftarRuangan[0] = new Ruangan("R-01", 10);
    daftarRuangan[1] = new Ruangan("R-02", 20);
    daftarDokter = new Dokter[2];
  }

  public void tambahDokter(Dokter dokter, int index) {
    daftarDokter[index] = dokter;
  }

  public void tampilkanRuangan() {
    System.out.println("--- Data Ruangan ----");

    for(Ruangan r : daftarRuangan) {
      r.tampilkanRuangan();
      System.out.println();
    }
  }

  public void tampilkanDokter() {
    System.out.println("---- Data Dokter ---");

    for (Dokter d : daftarDokter) {
      if (d != null) {
        System.out.println("Nama: " + d.getNama());
        System.out.println("Spesialisasi: " + d.getSpesialisasi());
        System.out.println();
      }
    }
  }
}