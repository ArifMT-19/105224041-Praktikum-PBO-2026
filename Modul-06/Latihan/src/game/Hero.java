package game;
  // Soal 1
public class Hero {
  private String name;
  private double health;
  private double attackPower;

  public Hero(String name, double health, double attackPower){
    setName(name);
    setHealth(health);
    setAttackPower(attackPower);
  }
  
  // Soal 2
  public void display(){
    System.out.println("Name: " + name);
    System.out.println("Health: " + health);
    System.out.println("Attack Power: " + attackPower);
  }

  public String getName(){
    return name;
  }

  public double getHealth(){
    return health;
  }

  public double getAttackPower(){
    return attackPower;
  }

  public void setName(String name){
    if(name != null){
      this.name = name;
    } else {
      System.out.println("Name tidak boleh null");
    }
  }

  public void setHealth(double health){
  if(health < 0){
    this.health = 0;
  } else {
    this.health = health;
  }
}

  public void setAttackPower(double attackPower){
    if(attackPower > 0){
      this.attackPower = attackPower;
    } else {
      System.out.println("Attack Power harus lebih dari 0");
    }
  }

  
  public void berlatih(){
    setAttackPower(getAttackPower() + 10);
    System.out.println(name + " sedang berlatih");
  }

  public void terimaSerangan(double damage){
    setHealth(getHealth() - damage);
    System.out.println(name + " menerima serangan sebesar " + damage);
  }
}
