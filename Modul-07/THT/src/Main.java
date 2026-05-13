import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    ArrayList<LayananEkspedisi> daftar = new ArrayList<>();
    daftar.add(new LayananReguler("REG-11", 2, 50, 50, 50));
    daftar.add(new LayananExpress("EXP-22", 5, 10, 10, 10));
    daftar.add(new LayananInternasional("INT-33", 3, 20, 20, 20, "Korea", 100));

    double totalPendapatanPerusahaan = 0.0;
    for(LayananEkspedisi layanan : daftar) {
      layanan.cetakResi();
      totalPendapatanPerusahaan += layanan.hitungOngkir();

      if(layanan instanceof LayananReguler) {
        LayananReguler reguler = (LayananReguler) layanan;
        System.out.println(
          "Ongkir Member + Jarak: Rp" +
          reguler.hitungOngkir(true, 25)
        );
      }
      if(layanan instanceof LayananExpress) {
        LayananExpress express = (LayananExpress) layanan;
        express.klaimAsuransi(1500000);
      }
      if(layanan instanceof LayananInternasional) {
        LayananInternasional internasional = (LayananInternasional) layanan;
        internasional.cetakManifest();
      }
      System.out.println();
    }

    System.out.println(
      "Total Pendapatan Perusahaan: Rp" +
      totalPendapatanPerusahaan
    );
  }
}