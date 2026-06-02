import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kalkulator = new Kalkulator();

        System.out.println("Soal 1: Input Harga Menu Dasar");
        try {
            System.out.print("Masukkan angka pembilang: ");
            int pembilang = input.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            int penyebut = input.nextInt();

            int hasil = kalkulator.bagi(pembilang, penyebut);

            System.out.println("Hasil pembagian: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("Error: Penyebut tidak boleh bernilai 0");
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harus berupa angka");
        } finally {
            input.close();
            System.out.println("Proses kalkulasi selesai dan resource memory telah dibersihkan");
        }
    }
}