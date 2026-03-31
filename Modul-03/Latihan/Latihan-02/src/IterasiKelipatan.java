// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class IterasiKelipatan {
   public IterasiKelipatan() {
   }

   public static void main(String[] var0) {
      System.out.println("Angka dari 1 hingga 50 tanpa kelipatan 3 atau 5:");

      for(int var1 = 1; var1 <= 50; ++var1) {
         if (var1 % 3 != 0 && var1 % 5 != 0) {
            System.out.print(var1 + " ");
         }
      }

      System.out.println();
   }
}
