// Abstract class sebagai kerangka utama semua jenis rekening
public abstract class Rekening implements Otorisasi {
  private String nomorRekening, namaPemilik;
  private double saldo;
  private String pin;

  // Komposisi: BukuMutasi menjadi bagian dari Rekening
  private BukuMutasi bukuMutasi;

  public Rekening(String nomorRekening, String namaPemilik, double saldo, String pin) {
    this.nomorRekening = nomorRekening;
    this.namaPemilik = namaPemilik;
    this.saldo = saldo;
    this.pin = pin;

    // BukuMutasi dibuat otomatis saat rekening dibuat
    this.bukuMutasi = new BukuMutasi();
  }

  // Implementasi method dari interface Otorisasi
  @Override
  public boolean verifikasiPIN(String inputPIN) {
    return pin.equals(inputPIN);
  }

  // Method setor untuk menambah saldo
  public void setor(double jumlah) {
    saldo += jumlah;
    bukuMutasi.catat("Setor Rp" + jumlah);
  }

  // Method abstract yang wajib dioverride oleh subclass
  public abstract void tarik(double jumlah);

  // Method protected agar hanya class turunan yang bisa mengurangi saldo
  protected void kurangiSaldo(double jumlah) {
    if (saldo >= jumlah) {
      saldo -= jumlah;
      bukuMutasi.catat("Tarik Rp" + jumlah);
    } else {
      System.out.println("Saldo tidak cukup");
    }
  }

  // Getter tidak langsung mengubah saldo, hanya menampilkan informasi
  public void tampilkanInfo() {
    System.out.println("No Rekening: " + nomorRekening);
    System.out.println("Nama: " + namaPemilik);
    System.out.println("Saldo: Rp" + saldo);
  }
}
