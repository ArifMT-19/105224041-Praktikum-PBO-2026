public class KomputerServer {
  private String hostname;

  // Composition
  // Harddisk adalah bagian internal server, "menyatu" dan lifecycle-nya bergantung pada KomputerServer.
  // Jika KomputerServer "hilang", Harddisk dianggap ikut hilang.
  // Implementasi komposisi biasanya: objek bagian dibuat di dalam constructor pemilik.
  private final Harddisk harddisk;

  // Aggregation
  // Monitor eksternal bisa dilepas-pasang dan dapat eksis mandiri.
  // KomputerServer hanya "menampung referensi" ke kumpulan Monitor, bukan pemilik penuh lifecycle-nya.
  // Implementasi agregasi: Monitor dibuat di luar, lalu "dioper" ke KomputerServer.
  private Monitor[] monitors; // diminta pakai Array standar

  public KomputerServer(String hostname, String merkHdd, int kapasitasGB, String tipeHdd, Monitor[] monitors) {
    this.hostname = hostname;

    // KOMPOSISI: harddisk dibuat DI DALAM KomputerServer
    this.harddisk = new Harddisk(merkHdd, kapasitasGB, tipeHdd);

    // AGREGASI: monitors berasal dari luar (bisa dipakai/eksis tanpa server)
    this.monitors = monitors;
  }

  public String getRingkasan() {
    StringBuilder sb = new StringBuilder();
    sb.append("Server: ").append(hostname).append("\n");
    sb.append("Harddisk (komposisi): ").append(harddisk.getInfo()).append("\n");

    sb.append("Monitor (agregasi):\n");
    if (monitors == null || monitors.length == 0) {
      sb.append("- (tidak ada monitor terhubung)\n");
    } else {
        for (int i = 0; i < monitors.length; i++) {
      sb.append("- ").append(monitors[i].getInfo()).append("\n");
      }
    }
    return sb.toString();
  }

  // Association
  // Asosiasi adalah relasi "menggunakan" objek lain tanpa kepemilikan bagian.
  // Contoh: Pengguna melakukan login ke server.
  // Pengguna tidak menjadi bagian dari KomputerServer, dan server tidak "memiliki" lifecycle pengguna.
  // Biasanya asosiasi tampak sebagai parameter metode (atau reference sementara).
  public void login(Pengguna pengguna) {
    System.out.println(pengguna.getNama() + " login ke server " + hostname);
  }
}