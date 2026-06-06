// Class untuk menyimpan data kereta api
public class KeretaApi {
    String kodeKereta;
    String namaKereta;
    String rute;
    int sisaKursi;

    // Constructor untuk mengisi data awal kereta
    public KeretaApi(String kodeKereta, String namaKereta, String rute, int sisaKursi) {
        this.kodeKereta = kodeKereta;
        this.namaKereta = namaKereta;
        this.rute = rute;
        this.sisaKursi = sisaKursi;
    }

    // Method untuk menampilkan informasi kereta
    public void tampilkanInfo() {
        System.out.println("Kode Kereta: " + kodeKereta);
        System.out.println("Nama Kereta: " + namaKereta);
        System.out.println("Rute: " + rute);
        System.out.println("Sisa Kursi: " + sisaKursi);
        System.out.println();
    }

    // Method untuk mengurangi sisa kursi setelah tiket berhasil dipesan
    public void kurangiKursi(int jumlah) {
        sisaKursi -= jumlah;
    }
}