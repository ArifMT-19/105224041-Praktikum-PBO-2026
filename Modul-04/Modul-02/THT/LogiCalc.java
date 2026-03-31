import java.util.Scanner;

public class LogiCalc {
// 105224041 | Arif Mufti Tharsa | THT Modul 2 Praktikum PBO 2026
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("=== SISTEM LOGICALC FASTSEND ===");

    System.out.print("Masukkan Nama Klien : ");
    String namaKlien = input.nextLine();

    System.out.print("Masukkan Berat (Kg) : ");
    double berat = input.nextDouble();

    System.out.print("Masukkan Jarak (Km) : ");
    int jarak = input.nextInt();

    System.out.print("Masukkan Jumlah Box : ");
    int jumlahBox = input.nextInt();

    int trukPenuh = jumlahBox / 150;
    int sisaBox = jumlahBox % 150;

    int jam = jarak / 60;
    int menit = jarak % 60;

    int tarifJarak = 15000;
    double tarifBerat = 5500;

    double dasarBiaya = (tarifJarak * jarak) + (tarifBerat * berat);
    double asuransi = dasarBiaya * 0.035;
    double totalBayar = dasarBiaya + asuransi;

    System.out.println();
    System.out.println("=== RESI PENGIRIMAN ===");
    System.out.println("Klien           : " + namaKlien);
    System.out.println("Total Box       : " + jumlahBox + " box");
    System.out.println("Kebutuhan Armada: " + trukPenuh + " Truk Penuh dan sisa " + sisaBox + " box via Pikap.");

    System.out.println();
    System.out.println("Estimasi Waktu  : " + jam + " Jam " + menit + " Menit (Asumsi 60km/jam)");

    System.out.println();
    System.out.println("=== RINCIAN BIAYA ===");
    System.out.println("Dasar Biaya     : Rp " + dasarBiaya);
    System.out.println("Asuransi (3.5%) : Rp " + asuransi);
    System.out.println("-----------------------------------");
    System.out.println("TOTAL BAYAR     : Rp " + totalBayar);
    System.out.println("===================================");

    input.close();
    }
}