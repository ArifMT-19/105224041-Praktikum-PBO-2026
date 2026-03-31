import java.util.Scanner;
  // 105224041 | Arif Mufti Tharsa | Modul-03 | Latihan-02
public class ATM {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String pinBenar = "123456";
    int percobaan = 0;

    while (percobaan < 3) {
      System.out.print("Masukkan PIN: ");
      String pin = input.nextLine();

      if (pin.equals(pinBenar)) {
        System.out.println("PIN benar");
        break; 
      } else {
        percobaan++;
        System.out.println("PIN salah");
      }
    }
    if (percobaan == 3) {
      System.out.println("Akun diblokir");
    }
    input.close();
  }
}