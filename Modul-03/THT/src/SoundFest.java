import java.util.Scanner;
  // 105224041 | Arif Mufti Tharsa | THT Modul 3 Praktikum PBO 2026
public class SoundFest {

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int stokVIP = 8;
    int stokFestival = 22;
    int stokTribune = 30;
    int hargaVIP = 800000;
    int hargaFestival = 500000;
    int hargaTribune = 200000;

    while (true){
      System.out.println("\n----KIOSK SOUND FEST-----");
      System.out.println("Stok VIP: " + stokVIP);
      System.out.println("Stok Festival: " + stokFestival);
      System.out.println("Stok Tribune: " + stokTribune);
      System.out.println("\n1. VIP");
      System.out.println("2. Festival");
      System.out.println("3. Tribune");
      System.out.println("4. Matikan Mesin");
      System.out.print("Pilih menu: ");
      int menu = input.nextInt();

      if (menu == 4){
        System.out.println("Mesin dimatikan");
        break;
      }
      int jumlah;
      int stok = 0;
      int harga = 0;
      int usiaMin = 0;

      switch (menu){
        case 1:
          stok = stokVIP;
          harga = hargaVIP;
          usiaMin = 18;
          break;

        case 2:
          stok = stokFestival;
          harga = hargaFestival;
          usiaMin = 15;
          break;

        case 3:
          stok = stokTribune;
          harga = hargaTribune;
          usiaMin = 0;
          break;

        default:
          System.out.println("Menu tidak ada");
          continue;
      }

      System.out.print("Jumlah tiket: ");
      jumlah = input.nextInt();

      if (jumlah > stok) {
        System.out.println("Stok tidak cukup");
        continue;
      }
      int berhasil = 0;
      for (int i = 1; i <= jumlah; i++){
        int usia;

        while (true) {
          System.out.print("Usia tiket ke-" + i + ": ");
          usia = input.nextInt();

          if (usia == -1) {
            System.out.println("Transaksi dibatalkan.");
            break;
          }
          if (usia <= 0 || usia > 120) {
            System.out.println("Usia tidak logis, masukkan lagi");
          } else {
            break;
          }
        }
        if (usia == -1){
          break;
        }
        if (usia >= usiaMin){
          berhasil++;
          System.out.println("Tiket berhasil");
        } else {
          System.out.println("Tidak memenuhi syarat usia");
        }
      }
      int total = berhasil * harga;

      if (menu == 1){
        stokVIP -= berhasil;
      }
      if (menu == 2){ 
        stokFestival -= berhasil;
      }
      if (menu == 3){
        stokTribune -= berhasil;
      }
      System.out.println("Tiket berhasil dibeli: " + berhasil);
      System.out.println("Total bayar: " + total);
    }
  input.close();
  }
}