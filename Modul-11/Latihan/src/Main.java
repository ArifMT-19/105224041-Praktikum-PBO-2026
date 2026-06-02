import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] hargaMenu = new int[3];
        System.out.println("Soal 1: Input Harga Menu Dasar");
        for (int i = 0; i < 4; i++) {
            try {
                System.out.print("Masukkan harga menu ke-" + (i + 1) + ": ");
                hargaMenu[i] = input.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harga harus berupa angka!");
                input.nextLine();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Kapasitas memori harga sudah penuh!");
            }
        }

        Pelanggan pelanggan = new Pelanggan();
        System.out.println("\nSoal 2: Validasi Umur Pelanggan");
        try {
            pelanggan.daftarMember(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSoal 3: Cek Ketersediaan Kopi");
        try {
            pelanggan.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println(e.getMessage());
        }

        MesinKasir kasir = new MesinKasir();
        System.out.println("\nSoal 4: Pembayaran di Kasir");
        try {
            kasir.bayar(50000, 30000);
        } catch (UangKurangException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nSoal 5: Mencetak Struk");
        try {
            kasir.cetakStruk(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup");
            input.close();
        }
    }
}