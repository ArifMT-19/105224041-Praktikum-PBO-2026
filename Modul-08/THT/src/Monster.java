public class Monster extends Karakter {
  private String jenisMonster;

  public Monster(String nama, int hp, int baseDamage, String jenisMonster) {
    super(nama, hp, baseDamage);
    this.jenisMonster = jenisMonster;
  }

  @Override
  public int serang() {
    return baseDamage;
  }

  @Override
  public void bertahan() {
    hp += 10;
    System.out.println(nama + " memulihkan HP");
  }

  @Override
  public void gunakanItem() {
    hp += 20;
    System.out.println(nama + " menggunakan item monster");
  }

  @Override
  public void tampilkanStatus() {
    System.out.println("Monster: " + nama);
    System.out.println("Jenis: " + jenisMonster);
    System.out.println("HP: " + hp);
  }
}