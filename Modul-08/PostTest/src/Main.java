public class Main {
  public static void main(String[] args) {
    PengirimanDarat darat = new PengirimanDarat("DRT-001", 50, 100, "Tronton");
    PengirimanUdara udara = new PengirimanUdara("UDR-999", 10, 800, "GA-123", 5000000);

    darat.updateStatus("Sedang di jalan tol Cipali");
    udara.updateStatus("Transit di Bandara Soekarno-Hatta");

    LayananPengiriman[] daftarPengiriman = {darat, udara};
    for(LayananPengiriman pengiriman : daftarPengiriman) {
      System.out.println();
      pengiriman.cetakResi();

      if(pengiriman instanceof LacakKargo) {
        LacakKargo lacak = (LacakKargo) pengiriman;
        System.out.println(
          "Status Lokasi : " +
          lacak.cekLokasiTerakhir()
        );
      }
      double ongkosDasar = pengiriman.hitungOngkosKirim();
      double totalTagihan = ongkosDasar;

      System.out.println(
        "Ongkos Dasar  : Rp" +
        ongkosDasar
      );

      if(pengiriman instanceof Asuransi) {
        Asuransi asuransi = (Asuransi) pengiriman;
        asuransi.cetakPolis();
        double premi = asuransi.hitungPremi(5000000);

        System.out.println(
          "Premi Asuransi : Rp" +
          premi
        );
        totalTagihan += premi;
      }

      System.out.println(
        "Total Tagihan : Rp" +
        totalTagihan
      );
    }
  }
}