import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

// SOLID - SRP: App cukup ngurus menu, input user, dan tampilan
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        // SOLID - DIP: App pakai kontrak ReservasiService, bukan detail class reservasinya
        ReservasiService reservasi = buatReservasiService();
        boolean jalan = true;

        try {
            while (jalan) {
                try {
                    tampilkanMenu();
                    int pilihan = input.nextInt();
                    input.nextLine();

                    switch (pilihan) {
                        case 1:
                            tampilkanJadwal(reservasi.lihatJadwal());
                            break;
                        case 2:
                            prosesPemesanan(input, reservasi);
                            break;
                        case 3:
                            System.out.println("Anda memilih keluar dari sistem");
                            jalan = false;
                            break;
                        default:
                            System.out.println("Pilihan menu tidak valid");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Input harus berupa angka");
                    input.nextLine();
                } catch (DataPenumpangTidakValidException e) {
                    System.out.println("Error data penumpang: " + e.getMessage());
                } catch (RuteTidakDitemukanException e) {
                    System.out.println("Error rute: " + e.getMessage());
                } catch (TiketHabisException e) {
                    System.out.println("Error tiket: " + e.getMessage());
                    System.out.println("Nama Kereta: " + e.getNamaKereta());
                    System.out.println("Sisa Kursi: " + e.getSisaKursi());
                }
            }
        } finally {
            input.close();
        }
    }

    private static ReservasiService buatReservasiService() {
        // SOLID - SRP: Tiap kebutuhan dibuat dari class terpisah biar tugasnya tidak numpuk
        KeretaRepository repository = new KeretaRepositoryMemori();
        PenumpangValidator validator = new ValidasiPenumpang();
        BookingCodeGenerator generator = new KodeBookingGenerator();
        return new SistemReservasi(repository, validator, generator);
    }

    // SOLID - SRP: Menu dipisah biar alur main tidak terlalu penuh
    private static void tampilkanMenu() {
        System.out.println("---- JAVA EXPRESS ------");
        System.out.println("1. Lihat Jadwal Kereta");
        System.out.println("2. Pesan Tiket");
        System.out.println("3. Keluar");
        System.out.print("Pilih menu: ");
    }

    // SOLID - SRP: Bagian ini cuma menampilkan jadwal dari data service
    private static void tampilkanJadwal(List<KeretaApi> daftarKereta) {
        System.out.println("\n--- Jadwal Kereta Java Express ----");
        for (KeretaApi kereta : daftarKereta) {
            System.out.println("Kode Kereta: " + kereta.getKodeKereta());
            System.out.println("Nama Kereta: " + kereta.getNamaKereta());
            System.out.println("Rute: " + kereta.getRute());
            System.out.println("Sisa Kursi: " + kereta.getSisaKursi());
            System.out.println();
        }
    }

    // SOLID - SRP: Input pemesanan dikumpulkan di sini, prosesnya tetap di service
    private static void prosesPemesanan(Scanner input, ReservasiService reservasi)
            throws RuteTidakDitemukanException, TiketHabisException {
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

        HasilBooking hasil = reservasi.pesanTiket(kodeKereta, nik, namaPenumpang, jumlahTiket);
        tampilkanHasilBooking(hasil);
    }

    // SOLID - SRP: Bagian ini cuma mencetak hasil booking
    private static void tampilkanHasilBooking(HasilBooking hasil) {
        System.out.println("\n--- Pemesanan Berhasil ---");
        System.out.println("Kode Booking: " + hasil.getKodeBooking());
        System.out.println("Nama Penumpang: " + hasil.getNamaPenumpang());
        System.out.println("NIK: " + hasil.getNik());
        System.out.println("Kereta: " + hasil.getNamaKereta());
        System.out.println("Kode Kereta: " + hasil.getKodeKereta());
        System.out.println("Rute: " + hasil.getRute());
        System.out.println("Jumlah Tiket: " + hasil.getJumlahTiket());
        System.out.println("Sisa Kursi: " + hasil.getSisaKursi());
    }
}
