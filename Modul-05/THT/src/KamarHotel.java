public class KamarHotel {
  private String nomorKamar, tipeKamar;
  private int kapasitasMaksimal;
  private double hargaPerMalam;
  private boolean isTersedia;

  public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
    this.nomorKamar = nomorKamar;
    setTipeKamar(tipeKamar);
    this.kapasitasMaksimal = kapasitasMaksimal;
    this.hargaPerMalam = 0;
    this.isTersedia = true;
  }

  public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
    this.nomorKamar = nomorKamar;
    setTipeKamar(tipeKamar);
    this.kapasitasMaksimal = kapasitasMaksimal;
    setHargaPerMalam(hargaPerMalam);
    this.isTersedia = true;
  }

  public String getNomorKamar(){
    return nomorKamar;
  }

  public String getTipeKamar(){
    return tipeKamar;
  }

  public int getKapasitasMaksimal(){
    return kapasitasMaksimal;
  }

  public double getHargaPerMalam(){
    return hargaPerMalam;
  }

  public boolean getStatus(){
    return isTersedia;
  }

  public void setTipeKamar(String tipeKamar){
    if (tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")){
      this.tipeKamar = tipeKamar;
    } else {
      System.out.println("Tipe tidak valid, diubah ke Reguler");
      this.tipeKamar = "Reguler";
    }
  }

  public void setHargaPerMalam(double hargaPerMalam){
    if (hargaPerMalam < 50000){
      System.out.println("Harga tidak valid, diubah ke 50000");
      this.hargaPerMalam = 50000;
    } else {
      this.hargaPerMalam = hargaPerMalam;
    }
  }

  public void pesanKamar(){
    if (isTersedia) {
      isTersedia = false;
      System.out.println("Kamar berhasil dipesan");
    } else {
      System.out.println("Kamar sudah terisi");
    }
  }

  public void pesanKamar(int jumlahTamu){
    if (!isTersedia){
      System.out.println("Kamar sudah terisi");
    } else if (jumlahTamu > kapasitasMaksimal){
      System.out.println("Tamu melebihi kapasitas!");
    } else {
      isTersedia = false;
      System.out.println("Berhasil pesan untuk " + jumlahTamu + " tamu");
    }
  }

  public void batalPesan(){
    isTersedia = true;
  }

  public double hitungTotalBayar(int malam){
    return malam * hargaPerMalam;
  }

  public double hitungTotalBayar(int malam, String kode){
    double total = malam * hargaPerMalam;

    if (kode.equalsIgnoreCase("PROMO") && malam >= 3){
      System.out.println("Diskon 20%");
      return total * 0.8;
    } else {
      System.out.println("Voucher gagal");
      return total;
    }
  }

  public void tampil(){
    System.out.println("\n--- Struk ---");
    System.out.println("Nomor: " + nomorKamar);
    System.out.println("Tipe: " + tipeKamar);
    System.out.println("Kapasitas: " + kapasitasMaksimal);
    System.out.println("Harga: " + hargaPerMalam);
    System.out.println("Status: " + (isTersedia ? "Tersedia" : "Terisi"));
  }
}