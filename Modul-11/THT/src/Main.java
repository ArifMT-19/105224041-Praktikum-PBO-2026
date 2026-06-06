import java.util.InputMismatchException;
import java.util.Scanner;

// Class utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SistemReservasi reservasi = new SistemReservasi();

        boolean jalan = true;

        try {
            // Perulangan menu agar program terus berjalan sampai user memilih keluar
            while (jalan) {
                try {
                    System.out.println("---- JAVA EXPRESS ------");
                    System.out.println("1. Lihat Jadwal Kereta");
                    System.out.println("2. Pesan Tiket");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih menu: ");

                    int pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {
                        case 1:
                            // Menampilkan jadwal kereta
                            reservasi.lihatJadwal();
                            break;

                        case 2:
                            // Form input pemesanan tiket
                            System.out.println("\n---- Form Pemesanan Tiket ---");

                            System.out.print("Masukkan kode kereta: ");
                            String kodeKereta = input.nextLine();

                            System.out.print("Masukkan NIK penumpang: ");
                            String nik = input.nextLine();

                            System.out.print("Masukkan nama penumpang: ");
                            String namaPenumpang = input.nextLine();

                            System.out.print("Masukkan jumlah tiket: ");
                            int jumlahTiket = input.nextInt();
                            input.nextLine();

                            // Memanggil method pemesanan tiket dari class SistemReservasi
                            reservasi.pesanTiket(kodeKereta, nik, namaPenumpang, jumlahTiket);
                            break;

                        case 3:
                            // Menghentikan perulangan program
                            System.out.println("Anda memilih keluar dari sistem");
                            jalan = false;
                            break;

                        default:
                            System.out.println("Pilihan menu tidak valid");
                    }

                } catch (InputMismatchException e) {
                    // Menangani error jika user memasukkan huruf pada input angka
                    System.out.println("Error: Input harus berupa angka");
                    input.nextLine();

                } catch (DataPenumpangTidakValidException e) {
                    // Menangani error data penumpang seperti NIK atau nama tidak valid
                    System.out.println("Error data penumpang: " + e.getMessage());

                } catch (RuteTidakDitemukanException e) {
                    // Menangani error jika kode kereta tidak ditemukan
                    System.out.println("Error rute: " + e.getMessage());

                } catch (TiketHabisException e) {
                    // Menangani error jika jumlah tiket melebihi sisa kursi
                    System.out.println("Error tiket: " + e.getMessage());
                    System.out.println("Nama Kereta: " + e.getNamaKereta());
                    System.out.println("Sisa Kursi: " + e.getSisaKursi());
                }
            }

        } finally {
            // Scanner ditutup saat program selesai
            input.close();
        }
    }
}