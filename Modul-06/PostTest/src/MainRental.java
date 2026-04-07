import rental.*;
import java.util.ArrayList;

public class MainRental {
  public static void main(String[] args){
    ArrayList<Kendaraan> list = new ArrayList<>();

    list.add(new Mobil("F1234AA", "Toyota", 2010, 200000, 7));
    list.add(new Mobil("F5678BB", "Honda", 2020, 250000, 5));
    list.add(new Motor("F9999CC", "Yamaha", 2018, 100000, 300));
    list.add(new Motor("F1111DD", "Honda", 2022, 80000, 150));

    for(Kendaraan k : list){
      System.out.println("------------------");
      k.displayInfo();
      System.out.println("Total Biaya Sewa 5 Hari: " + k.hitungHargaSewa(5));
    }
  }
}