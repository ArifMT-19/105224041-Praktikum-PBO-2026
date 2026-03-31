import java.util.Scanner;
  // 105224041 | Arif Mufti Tharsa | Modul-03 | Latihan-01
public class Kalkulator {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double angka1, angka2, hasil;
    char operator;

    System.out.print("Masukkan angka pertama: ");
    angka1 = input.nextDouble();
    System.out.print("Masukkan operator maatematika: ");
    operator = input.next().charAt(0); 
    System.out.print("Masukkan angka kedua: ");
    angka2 = input.nextDouble();

    switch(operator) {
      case '+':
        hasil = angka1 + angka2;
        System.out.println("Hasil: " + hasil);
        break;
      case '-':
        hasil = angka1 - angka2;
        System.out.println("Hasil: " + hasil);
          break;
      case '*':
        hasil = angka1 * angka2;
        System.out.println("Hasil: " + hasil);
        break;
      case '/':
        if (angka2 != 0){
          hasil = angka1 / angka2;
          System.out.println("Hasil: " + hasil);
        } else {
          System.out.println("Tidak biisa melakukan pembagian dengan nol");
        }
        break;
        default:
        System.out.println("Operator tidak benar");
        break;
    }
    input.close();
  }
}