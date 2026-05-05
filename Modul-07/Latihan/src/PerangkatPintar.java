public class PerangkatPintar {
  public void aktifkan() {
      System.out.println("Perangkat pintar diaktifkan");
  }
}

class LampuPintar extends PerangkatPintar {
  // Soal 1
  @Override
  public void aktifkan() {
    System.out.println("Lampu menyala dengan tingkat kecerahan standar");
  }
  // Soal 2
  public void aturKecerahan(int level) {
    System.out.println("Kecerahan lampu diatur ke level " + level + "%");
  }
  // Soal 2
  public void aturKecerahan(int level, String warna) {
    System.out.println("Kecerahan lampu diatur ke level " + level + "% dengan warna cahaya " + warna);
  }
}

class AcPintar extends PerangkatPintar {
  // Soal 1
  @Override
  public void aktifkan() {
    System.out.println("AC menyala dan mulai mendinginkan ruangan");
  }
  // Soal 4
  public void aturSuhu(int suhu) {
    System.out.println("Suhu ruangan diatur menjadi " + suhu + " derajat");
  }
}

