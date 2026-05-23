import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Nasabah nasabah = null;
    Rekening rekeningAktif = null;
    // Variabel ini dipakai untuk membuktikan konsep agregasi
    Rekening buktiAgregasi = null;
    CustomerService cs = new CustomerService();
    int pilih;

    do {
      System.out.println("\n=== NEOBANK ===");
      System.out.println("1. Registrasi Nasabah");
      System.out.println("2. Buka Rekening");
      System.out.println("3. Login");
      System.out.println("4. Setor");
      System.out.println("5. Tarik");
      System.out.println("6. Keluhan CS");
      System.out.println("7. Nonaktifkan Nasabah");
      System.out.println("0. Keluar");
      System.out.print("Pilih: ");
      pilih = input.nextInt();
      input.nextLine();

      switch (pilih) {
        case 1:
          System.out.print("Nama nasabah: ");
          String nama = input.nextLine();

          nasabah = new Nasabah(nama);
          System.out.println("Nasabah berhasil dibuat.");
          break;

        case 2:
          if (nasabah == null) {
            System.out.println("Registrasi nasabah dulu.");
            break;
          }

          System.out.print("Nomor rekening: ");
          String no = input.nextLine();

          System.out.print("Saldo awal: ");
          double saldo = input.nextDouble();
          input.nextLine();

          System.out.print("PIN: ");
          String pin = input.nextLine();

          System.out.println("1. Reguler");
          System.out.println("2. Prioritas");
          System.out.print("Pilih jenis: ");
          int jenis = input.nextInt();
          input.nextLine();

          Rekening rekening;

          // Polimorfisme: variabel bertipe Rekening bisa berisi objek subclass
          if (jenis == 1) {
            rekening = new RekeningReguler(no, nasabah.getNama(), saldo, pin);
          } else {
            rekening = new RekeningPrioritas(no, nasabah.getNama(), saldo, pin);
          }

          nasabah.tambahRekening(rekening);

          // Rekening juga disimpan di variabel lain untuk membuktikan agregasi
          buktiAgregasi = rekening;
          break;

        case 3:
          if (nasabah == null || nasabah.getRekeningPertama() == null) {
            System.out.println("Buat nasabah dan rekening dulu.");
            break;
          }

          rekeningAktif = nasabah.getRekeningPertama();

          System.out.print("Masukkan PIN: ");
          String inputPIN = input.nextLine();

          if (rekeningAktif.verifikasiPIN(inputPIN)) {
            System.out.println("Login berhasil.");
            rekeningAktif.tampilkanInfo();
          } else {
            System.out.println("PIN salah.");
            rekeningAktif = null;
          }
          break;

        case 4:
          if (rekeningAktif == null) {
            System.out.println("Login dulu.");
            break;
          }

          System.out.print("Jumlah setor: ");
          double setor = input.nextDouble();
          input.nextLine();

          rekeningAktif.setor(setor);
          break;

        case 5:
          if (rekeningAktif == null) {
            System.out.println("Login dulu.");
            break;
          }

          System.out.print("Jumlah tarik: ");
          double tarik = input.nextDouble();
          input.nextLine();

          // Method tarik akan berjalan sesuai jenis objeknya
          rekeningAktif.tarik(tarik);
          break;

        case 6:
          if (nasabah == null) {
            System.out.println("Nasabah belum ada.");
            break;
          }

          System.out.print("Masukkan keluhan: ");
          String keluhan = input.nextLine();

          nasabah.laporKeluhan(cs, keluhan);
          break;

        case 7:
          nasabah = null;
          rekeningAktif = null;

          System.out.println("Nasabah dinonaktifkan.");

          // Bukti agregasi:
          // Nasabah sudah null, tetapi rekening masih hidup
          // karena masih direferensikan oleh buktiAgregasi.
          if (buktiAgregasi != null) {
            buktiAgregasi.tampilkanInfo();
          }

          // Bukti komposisi:
          // BukuMutasi dibuat di dalam Rekening.
          // Jika objek Rekening dihancurkan, BukuMutasi ikut hilang.
          break;

        case 0:
          System.out.println("Program selesai.");
          break;

        default:
          System.out.println("Pilihan tidak valid.");
      }
    } while (pilih != 0);
    input.close();
  }
}
