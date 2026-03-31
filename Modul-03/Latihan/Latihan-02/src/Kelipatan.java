public class Kelipatan {
  // 105224041 | Arif Mufti Tharsa | Modul-03 | Latihan-02
  public static void main(String[] args) {
    System.out.println("Angka dari 1 hingga 50 tanpa kelipatan 3 atau 5:");
    
      for (int i = 1; i <= 50; i++) {
        if (i % 3 == 0 || i % 5 == 0) {
          continue;
          }
          System.out.print(i + " ");
      }
      System.out.println(); 
    }
  }

  /* 
  buat program menggunakan for loop untuk melakukan iterasi angka dari 1 hingga 50
  gunakan continue untuk melewati iterasi pada angka yang merupakan operator kelipatan 3 atau 5. cetak sisa angka yang tidak terlewati
   */