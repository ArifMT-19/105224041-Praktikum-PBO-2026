import java.util.*;

public class Main {
  public static void main(String[] args) {
    Map<String, Film> jadwalFilm = new HashMap<>();

    jadwalFilm.put("F01", new Film("Avengers Endgame", 45000));
    jadwalFilm.put("F02", new Film("Spiderman No Way Home", 40000));
    jadwalFilm.put("F03", new Film("Interstellar", 50000));

    System.out.println("--- JADWAL FILM HARI INI ---");

    for (Map.Entry<String, Film> data : jadwalFilm.entrySet()) {
      System.out.println("Kode Film : " + data.getKey());
      data.getValue().tampil();
    }

    Set<String> kursiDipesan = new HashSet<>();
    List<Transaksi> riwayatTransaksi = new ArrayList<>();

    System.out.println("--- PROSES PEMESANAN TIKET ---");

    prosesPesanan("Gio", "F01", "A1", jadwalFilm, kursiDipesan, riwayatTransaksi);
    prosesPesanan("Razqa", "F01", "A2", jadwalFilm, kursiDipesan, riwayatTransaksi);
    prosesPesanan("Iman", "F02", "B1", jadwalFilm, kursiDipesan, riwayatTransaksi);
    prosesPesanan("Roby", "F01", "A1", jadwalFilm, kursiDipesan, riwayatTransaksi);
    prosesPesanan("Adit", "F03", "C1", jadwalFilm, kursiDipesan, riwayatTransaksi);

    System.out.println();
    System.out.println("--- RIWAYAT TRANSAKSI BERHASIL ---");

    for (Transaksi transaksi : riwayatTransaksi) {
      transaksi.tampil();
    }
  }

  public static void prosesPesanan(String namaPemesan, String kodeFilm, String nomorKursi,
      Map<String, Film> jadwalFilm, Set<String> kursiDipesan, List<Transaksi> riwayatTransaksi) {

    if (!jadwalFilm.containsKey(kodeFilm)) {
      System.out.println(namaPemesan + " gagal memesan karena kode film tidak valid");
      return;
    }

    String kunciKursi = kodeFilm + "#" + nomorKursi;

    if (!kursiDipesan.add(kunciKursi)) {
      System.out.println(namaPemesan + " gagal memesan karena kursi " + nomorKursi + " sudah dipesan");
      return;
    }

    Film film = jadwalFilm.get(kodeFilm);
    Transaksi transaksi = new Transaksi(namaPemesan, film.judul, nomorKursi, film.harga);

    riwayatTransaksi.add(transaksi);

    System.out.println(namaPemesan + " berhasil memesan tiket " + film.judul + " kursi " + nomorKursi);
  }
}