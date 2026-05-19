public class Harddisk {
  private String merk, tipe;
  private int kapasitasGB;

  public Harddisk(String merk, int kapasitasGB, String tipe) {
    this.merk = merk;
    this.kapasitasGB = kapasitasGB;
    this.tipe = tipe;
  }

  public String getInfo() {
      return merk + " " + tipe + " " + kapasitasGB + "GB";
  }
}