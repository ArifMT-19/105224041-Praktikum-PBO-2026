// Nasabah memiliki beberapa rekening, tetapi rekening tetap bisa hidup sendiri
public class Nasabah {
  private String nama;
  // Agregasi: Nasabah menyimpan maksimal 3 objek Rekening
  private Rekening[] daftarRekening = new Rekening[3];
  private int jumlahRekening = 0;

  public Nasabah(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public void tambahRekening(Rekening rekening) {
    if (jumlahRekening < 3) {
      daftarRekening[jumlahRekening] = rekening;
      jumlahRekening++;
      System.out.println("Rekening berhasil ditambahkan.");
    } else {
      System.out.println("Maksimal 3 rekening.");
    }
  }

  // Untuk menyederhanakan program, transaksi memakai rekening pertama
  public Rekening getRekeningPertama() {
    return daftarRekening[0];
  }

  // Asosiasi: Nasabah berinteraksi dengan CustomerService
  public void laporKeluhan(CustomerService cs, String keluhan) {
    cs.terimaKeluhan(nama, keluhan);
  }
}
