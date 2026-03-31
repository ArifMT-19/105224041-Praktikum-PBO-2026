import java.util.Scanner;
// 105224041 | Arif Mufti Tharsa | Modul-3 | PreTest
public class PreTestDonor {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan usia: ");
    int usia = input.nextInt();

    System.out.print("Masukkan berat badan: ");
    float berat = input.nextFloat();

    System.out.print("Masukkan hemooglobin: ");
    float hb = input.nextFloat();

    if (usia >= 17) {
      if (berat >= 45) {
        if (hb >= 12.5) {
          System.out.println("Layak menjadi donor darah");
        } else {
          System.out.println("Tidak layak: Hemoglobin rendah");
        }
      } else {
        System.out.println("Tidak layak: Berat badan kurang dari 45 kg");
      }
    } else {
      System.out.println("Tidak layak: Usia kuraang dari 17 tahun");
    }
    input.close();
  }
}