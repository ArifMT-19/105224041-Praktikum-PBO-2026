package perusahaan;

public class Developer extends Karyawan {
  private String level;
  private int jumlahBugFix;

  public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix){
    super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja);
    setLevel(level);
    setJumlahBugFix(jumlahBugFix);
  }

  public String getLevel(){
    return level;
  }

  public int getJumlahBugFix(){
    return jumlahBugFix;
  }

  public void setLevel(String level){
    if(level != null){
      this.level = level;
    } else {
      System.out.println("Level tidak boleh null");
    }
  }

  public void setJumlahBugFix(int jumlahBugFix){
    if(jumlahBugFix >= 0){
      this.jumlahBugFix = jumlahBugFix;
    } else {
      System.out.println("Jumlah bug tidak valid");
    }
  }

  @Override
  public void displayInfo(){
    super.displayInfo();
    System.out.println("Level: " + level);
    System.out.println("Bug Fix: " + jumlahBugFix);
  }

  @Override
  public double hitungGajiTotal(int tahunSekarang){
    double total = super.hitungGajiTotal(tahunSekarang);

    if(level.equalsIgnoreCase("Mid")){
      total += 1500000;
    } else if(level.equalsIgnoreCase("Senior")){
      total += 3000000;
    }

    if(getRatingKinerja() >= 3.0){
      total += getJumlahBugFix() * 50000;
    }
    return total;
  }
}