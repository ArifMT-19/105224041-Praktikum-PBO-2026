public class Main {
  public static void main(String[] args) {
    Dokter dokter1 = new Dokter("Dr. Gio", "Penyakit Dalam");
    Dokter dokter2 = new Dokter("Dr. Rina", "Anak");

    Pasien pasien1 = new Pasien("Roby", 20);
    Pasien pasien2 = new Pasien("Salsa", 18);

    System.out.println("--- Pemeriksaan Pasien ---");
    dokter1.periksaPasien(pasien1);
    System.out.println();

    RumahSakit rs = new RumahSakit("Rs Sehat Selalu");
    rs.tambahDokter(dokter1, 0);
    rs.tambahDokter(dokter2, 1);
    rs.tampilkanRuangan();
    rs.tampilkanDokter();

    rs = null;
    System.out.println("--- Pengujian Setelah Rs Dihapus ---");
    System.out.println(dokter1.getNama());
    System.out.println(dokter2.getNama());
    System.out.println(pasien1.getNama());
    System.out.println(pasien2.getNama());
  }
}

/*
penjelasan:
1. Object RumahSakit sudah tidak memiliki reference, karena rs = null
2. Object Ruangan ikut hilang karena Ruangan dibuat dan dimiliki penuh oleh RumahSakit Composition
3. Object Dokter TIDAK hilang karena dokter dibuatdi luar RumahSakit dan hanya dipinjam/disimpan referencenya oleh RumahSakit Aggregation
4.Object Pasien juga masih ada karena tidak bergantung pada RumahSakit
*/