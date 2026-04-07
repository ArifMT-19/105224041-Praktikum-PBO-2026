package minimarket;

public class MakananRingan extends Produk{
  private String rasa;

  public MakananRingan(String namaProduk, double harga, String rasa){
    super(namaProduk, harga);
    setRasa(rasa);
  }

  public void tampilkanDetail(){
    super.tampilkanDetail();
    System.out.println("Rasa: " + rasa);
  }

  public void getRasa(){
    System.out.println("Rasa: " + rasa);
  }

  public void setRasa(String rasa){
    if(rasa != null){
      this.rasa = rasa;
    } else {
      System.out.println("Rasa tidak boleh null");
    }
  }
}
