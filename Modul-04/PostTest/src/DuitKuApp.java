import java.util.Scanner;

class Pelanggan {
  String nama;
  String noHP;
  int saldo;

  Pelanggan(String nama, String noHP) {
    this.nama = nama;
    this.noHP = noHP;
    this.saldo = 0;
  }

  void topUp(int jumlah) {
    if (jumlah < 10000) {
      System.out.println("Top up gagal. Minimal Rp 10000");
    } else {
      saldo += jumlah;
      System.out.println("Top up berhasil: Rp " + jumlah);
    }
    System.out.println("Saldo sekarang: Rp " + saldo);
    System.out.println("------------------");
  }

  void bayarTagihan(int jumlah) {
    if (saldo >= jumlah) {
      saldo -= jumlah;
      System.out.println("Pembayaran berhasil: Rp " + jumlah);
    } else {
      System.out.println("Pembayaran gagal. Saldo tidak cukup");
    }
    System.out.println("Saldo sekarang: Rp " + saldo);
    System.out.println("------------------");
  }

  void tampilSaldo() {
    System.out.println("Sisa saldo: Rp " + saldo);
  }
}

public class DuitKuApp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nama Lengkap: ");
    String nama = input.nextLine();

    System.out.print("Masukkan no HP: ");
    String noHP = input.nextLine();

    Pelanggan anton = new Pelanggan(nama, noHP);

    System.out.print("Masukkan top up pertama: ");
    int topup1 = input.nextInt();
    anton.topUp(topup1);

    System.out.print("Masukkan tagihan: ");
    int tagihan = input.nextInt();
    anton.bayarTagihan(tagihan);

    System.out.print("Masukkan top up kedua: ");
    int topup2 = input.nextInt();
    anton.topUp(topup2);

    anton.bayarTagihan(tagihan);
    anton.tampilSaldo();
    input.close();
}
}