public class Main {
  public static void main(String[] args) {
    // Monitor dibuat di luar ini cocok untuk AGREGASI
    Monitor m1 = new Monitor("Dell", 24.0, "1920x1080");
    Monitor m2 = new Monitor("LG", 27.0, "2560x1440");

    Monitor[] monitors = { m1, m2 };

    // Harddisk tidak dibuat di luar, tapi spesifikasinya diberikan ke server.
    // Server akan membuat Harddisk nya sendiri ini KOMPOSISI
    KomputerServer server = new KomputerServer("server-utama", "Seagate", 1000, "HDD", monitors);

    System.out.println(server.getRingkasan());

    // ASOSIASI pengguna hanya berinteraksi dengan server
    Pengguna arif = new Pengguna("Arif");
    server.login(arif);
  }
}