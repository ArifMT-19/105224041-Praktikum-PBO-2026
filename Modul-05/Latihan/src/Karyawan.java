public class Karyawan { 
  private String idKaryawan, nama; // Soal 1
  private double gajiPokok; // Soal 2
  private String department; // Soal 4

  public Karyawan(String idKaryawan, String nama, int gajiPokok, String department){
    setIdKaryawan(idKaryawan);
    setNama(nama);
    setGajiPokok(gajiPokok);
    setDepartment(department);
  } //Soal 1

  public String getIdKaryawan(){
    return idKaryawan;
  } 

  public String getNama(){
    return nama;
  } 

    public void setIdKaryawan(String idKaryawan){
    if(idKaryawan != null){
      this.idKaryawan = idKaryawan;
    } else {
      System.out.println("ID Karyawan tidak boleh null");
    }
  }

  public void setNama(String nama){
    if(nama != null){
      this.nama = nama;
    } else {
      System.out.println("Nama Karyawan tidak boleh null");
    }
  }

  public double getGajiPokok(){
    return gajiPokok;
  } // Soal 2

  public void setGajiPokok(double gajiPokok){
    if(gajiPokok > 0){
      this.gajiPokok = gajiPokok;
    } else {
      System.out.println("Gaji Pokok harus lebih dari 0");
    }
  }

  public String getDepartment(){
    return department;
  } // Soal 4


  public void setDepartment(String department){
    if(department != null){
      this.department = department;
    } else {
      System.out.println("Department tidak boleh null");
    }
  }

  public void tampilkanDataKaryawan(){
    System.out.println("ID Karyawan: " + getIdKaryawan());
    System.out.println("Nama Karyawan: " + getNama());
    System.out.println("Gaji Pokok: " + getGajiPokok());
    System.out.println("Department: " + getDepartment());
  } // Soal 3
}