public class RekeningBank {
  private int rekening, saldo;

  RekeningBank(int rekening, int saldo){
    setRekening(rekening);
    setSaldo(saldo);
  }

  public int getRekenig(){
    return rekening;
  }

  public int getSaldo(){
    return saldo;
  }

  public void setRekening(int rekening){
    if (rekening == 0){
    this.rekening = rekening;
    } else {
      System.out.println("Rekening tidak boleh kosong");
    }
  }

  public void setSaldo(int saldo){
    if (saldo >= 0){
      this.saldo = saldo;
    } else {
      System.out.println("Saldo tidak boleh negatif");
    }
  }

  public void tambahSaldo(int saldo){
    this.saldo += saldo;
  }

  public void cetakRekening(){
    System.out.println("Rekening: " + rekening);
    System.out.println("Saldo: " + saldo);
  }
}
