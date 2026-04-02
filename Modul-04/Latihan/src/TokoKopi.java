class MesinKopi { // Soal 1
  int bijiKopi, Air, Susu;

  MesinKopi() {  // Soal 4
    this.bijiKopi = 0;
    this.Air = 0;
    this.Susu = 0;
  }

  public void isiUlangBahan(int tambahKopi, int tambahAir, int tambahSusu) { //Soal 2
    this.bijiKopi += tambahKopi;
    this.Air += tambahAir;
    this.Susu += tambahSusu;
    System.out.println("Bahan baku berhasil diisi ulang");
    }

    public void tampil() {
    System.out.println("\nStok Sekarang");
    System.out.println("Biji kopi: " + bijiKopi + " gram");
    System.out.println("Air: " + Air + " ml");
    System.out.println("Susu: " + Susu + " ml");
    System.out.println("--------------------------------");
    }

  public boolean cekKetersediaanCappuccino() { // Soal 3
    if(bijiKopi >= 15 && Air >= 50 && Susu >= 100) {
      return true;
    } else {
      return false;
    }
  }
}

public class TokoKopi {
  public static void main(String[] args) {
    MesinKopi mesinLobby = new MesinKopi();
    MesinKopi mesinDapur = new MesinKopi();

    mesinDapur.tampil(); 
    mesinLobby.isiUlangBahan(15, 50, 100);
    mesinLobby.tampil(); 

    boolean tersedia = mesinLobby.cekKetersediaanCappuccino();
    System.out.println("Apakah bisa membuat Cappuccino? " + tersedia);
    }
}