class Mahasiswa {
  String nama;
  int umur;
  String jurusanStudi;

  Mahasiswa(String nama, int umur, String jurusanStudi) {
    this.nama = nama;
    this.umur = umur;
    this.jurusanStudi = jurusanStudi;
  }

  public void belajar() {
    System.out.println(nama +" sedang belajar");
  }

  public void gantiProdi(String jurusanStudi) {
    this.jurusanStudi = jurusanStudi;
  }

  public void tampilkan(){
    System.out.println("Nama: " + nama);
    System.out.println("Umur: " + umur);
    System.out.println("Jurusan: " + jurusanStudi);
  
  }
}