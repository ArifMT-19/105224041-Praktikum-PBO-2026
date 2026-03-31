import java.util.Scanner;
  // 105224041 | Arif Mufti Tharsa | Modul-03 | PostTest
public class ATMSederhana {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int saldo = 500000;
    int pilihan;

    do {
      System.out.println("\nATM sederhana");
      System.out.println("1. Cek saldo | 2. Setor tunai | 3. Tarik tunai | 4. Keluar");
      System.out.print("Masukkan pilihan: ");
      pilihan = input.nextInt();

      switch (pilihan) {
        case 1:
          System.out.println("Saldo Anda: " + saldo);
          break;
        case 2:
          System.out.print("Masukkan jumlah setor: ");
          int setor = input.nextInt();
          saldo += setor;
          System.out.println("Setoran berhasil. Saldo sekarang: " + saldo);
          break;
        case 3:
          System.out.print("Masukkan jumlah tarik: Rp ");
          int tarik = input.nextInt();
          if (tarik > saldo - 50000) {
            System.out.println("Saldo tidak mencukupi dan ssaldo harus minimal Rp 50.000");
          } else {
            saldo -= tarik;
            System.out.println("Penarikan berhasil. Saldo sekarang: " + saldo);
          }
          break;
        case 4:
          System.out.println("Terima kasih telah menggunakan ATM");
          break;
        default:
          System.out.println("Pilihan tidak valid Silakan coba lagi");
      }
    } while (pilihan != 4);
    input.close();
  }
}

