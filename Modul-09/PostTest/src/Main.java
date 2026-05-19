public class Main {
  public static void main(String[] args) {
    Ban ban1 = new Ban("Bridgestone", 17);
    Ban ban2 = new Ban("Bridgestone", 17);
    Ban ban3 = new Ban("Bridgestone", 17);
    Ban ban4 = new Ban("Bridgestone", 17);
    Ban[] setBan = {ban1, ban2, ban3, ban4};

    Mobil mobil = new Mobil("Toyota Supra", "Merah", "Bensin Turbo", 3000);
    mobil.pasangSetBan(setBan);
    System.out.println();

    mobil.tampilkanSpesifikasi();
    System.out.println();

    Montir montir = new Montir("MTR-001", "Pak Giooo");
    montir.lakukanQualityControl(mobil);
    System.out.println();

    mobil = null;
    System.out.println("---- Setelah Mobil Dihancurkan ----");

    System.out.println("Ban masih ada:");
    ban1.tampilkanBan();
    System.out.println();

    ban2.tampilkanBan();
    System.out.println();

    ban3.tampilkanBan();
    System.out.println();
    ban4.tampilkanBan();
  }
}

/*
Penjelasan:
Mesin ikut tidak bisa diakses karena dibuat langsung di dalam constructor Mobil. Jadi relasinya composition
Ban tetap bisa diakses karena dibuat di Main dan hanya dipasang ke Mobil. Jadi relasinya aggregation
Jika kode di bawah dijalankan, akan error NullPointerException karena mobil sudah null
mobil.tampilkanSpesifikasi(); // Akan error karena mobil sudah null
*/