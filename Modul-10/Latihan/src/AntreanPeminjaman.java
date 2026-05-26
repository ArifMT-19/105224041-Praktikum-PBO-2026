import java.util.*;

public class AntreanPeminjaman {
  private Deque<String> antrean = new LinkedList<>();

  public void tambah(Anggota anggota, String isbn) {
    String data = anggota.getId() + "#" + isbn;

    if (anggota.getTipe().equalsIgnoreCase("Dosen")) {
      antrean.addFirst(data);
    } else {
      antrean.addLast(data);
    }
  }

  public String proses() {
    return antrean.pollFirst();
  }

  public int jumlah() {
    return antrean.size();
  }

  public boolean isKosong() {
    return antrean.isEmpty();
  }

  public void tampil() {
    for (String data : antrean) {
      System.out.println(data);
    }
  }
}