package game;

// Soal 3
public class HeroStrength extends Hero {
  private String tipe = "Strength";
  
  public HeroStrength(String name, double health, double attackPower){
    super(name, health, attackPower);
  }

  // Soal 4
  @Override
  public void display(){
    super.display();
    System.out.println("Tipe: " + tipe);
  }

  @Override
public void terimaSerangan(double damage){
  double damageDiterima = damage * 0.5;

  setHealth(getHealth() - damageDiterima);
  System.out.println(getName() + " hanya menerima damage sebesar " + damageDiterima);
}
  
}
