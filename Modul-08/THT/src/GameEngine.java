public class GameEngine {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);

    System.out.print("Masukkan nama pahlawan : ");
    String nama = input.nextLine();
    Pahlawan hero = new Pahlawan(nama, 150, 20, 100, 2);

    Monster[] daftarMonster = {
      new Monster("Goblin", 80, 10, "Normal"),
      new Monster("Orc", 120, 15, "Brute"),
      new Monster("Dragon", 200, 25, "Boss")
    };

    boolean menang = true;
    for(int i = 0; i < daftarMonster.length; i++) {

      Monster monster = daftarMonster[i];
      System.out.println("\n---- Musuh Muncul ----");
      monster.tampilkanStatus();

      while(hero.getHp() > 0 && monster.getHp() > 0) {
        System.out.println("\n---- STATUS ----");
        hero.tampilkanStatus();
        monster.tampilkanStatus();

        System.out.println("\n1. Serang");
        System.out.println("2. Skill");
        System.out.println("3. Bertahan / Heal");

        System.out.print("Pilih aksi : ");
        int pilih = input.nextInt();
        int damageHero = 0;

        switch(pilih) {
          case 1:
            damageHero = hero.serang();
            System.out.println(hero.getNama() + " menyerang monster");
            monster.terimaDamage(damageHero);
            break;

          case 2:
            damageHero = hero.serang("Fire Blast", 20);
            monster.terimaDamage(damageHero);
            break;

          case 3:
            hero.bertahan();
            hero.gunakanItem();
            break;

          default:
            System.out.println("Pilihan tidak valid");
        }

        if(monster.getHp() > 0) {
          int damageMonster = monster.serang();
          System.out.println(monster.getNama() + " menyerang balik");
          hero.terimaDamage(damageMonster);
        }
      }

      if(hero.getHp() <= 0) {
        menang = false;
        break;
      }
      System.out.println(monster.getNama() + " berhasil dikalahkan");
    }

    System.out.println("\n----- HASIL GAME ----");
    if(menang && hero.getHp() > 0) {
      System.out.println(hero.getNama() + " berhasil menamatkan Dungeon");
    } else {
      System.out.println("Game Over");
    }
    input.close();
  }
}