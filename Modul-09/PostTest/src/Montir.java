public class Montir {
  private String idMontir;
  private String nama;

  public Montir(String idMontir, String nama) {
    this.idMontir = idMontir;
    this.nama = nama;
  }

  public void lakukanQualityControl(Mobil m) {
    System.out.println("---- Quality Control ----");
    System.out.println("ID Montir: " + idMontir);
    System.out.println("Nama Montir: " + nama);
    System.out.println("Memeriksa mobil " + m.getMerkMobil() + " warna " + m.getWarna());
    System.out.println("Status: Mobil layak diperiksa lebih lanjut");
  }
}