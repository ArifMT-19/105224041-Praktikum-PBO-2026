import perusahaan.*;
import java.util.ArrayList;

public class MainPerusahaan {
  public static void main(String[] args){

    ArrayList<Karyawan> list = new ArrayList<>();

    list.add(new Karyawan("K1", "Budi", 2020, 5000000, 2.0));
    list.add(new Developer("D1", "Andi", 2018, 7000000, 4.0, "Senior", 20));
    list.add(new Developer("D2", "Siti", 2024, 6000000, 2.8, "Mid", 15));
    list.add(new Manajer("M1", "Rina", 2015, 10000000, 4.8, "IT", 10));
    list.add(new Manajer("M2", "Doni", 2025, 9000000, 3.5, "HR", 3));

    for(Karyawan k : list){
      System.out.println("--------------------");
      k.displayInfo();
      System.out.println("Total Gaji: " + k.hitungGajiTotal(2026));
    }
  }
}