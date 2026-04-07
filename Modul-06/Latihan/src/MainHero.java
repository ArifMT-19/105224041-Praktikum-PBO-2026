import game.Hero;
import game.HeroStrength;

// Soal 5
public class MainHero {
  public static void main(String[] args){

    Hero hero1 = new Hero("GIO", 100, 20);
    HeroStrength hero2 = new HeroStrength("DANU", 150, 25);

    System.out.println("--- Status Awal ---");
    hero1.display();
    System.out.println();
    hero2.display();

    System.out.println("\n--- Setelah Berlatih ---");
    hero1.berlatih();
    hero2.berlatih();

    System.out.println("\n--- Setelah Kena Serangan ---");
    hero1.terimaSerangan(50);
    hero2.terimaSerangan(50);


    System.out.println("\n--- Status Akhir ---");
    hero1.display();
    System.out.println();
    hero2.display();
  }
}