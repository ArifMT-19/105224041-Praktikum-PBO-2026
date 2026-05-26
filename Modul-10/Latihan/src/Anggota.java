import java.util.*;

public class Anggota {
  private String id, nama, tipe;

  public Anggota(String id, String nama, String tipe) {
    this.id = id;
    this.nama = nama;
    this.tipe = tipe;
  }

  public String getId() {
    return id;
  }

  public String getNama() {
    return nama;
  }

  public String getTipe() {
    return tipe;
  }

  public void tampil() {
    System.out.println("Id: " + id);
    System.out.println("Nama: " + nama);
    System.out.println("Tipe: " + tipe);
    System.out.println();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }

    Anggota anggota = (Anggota) obj;
    return Objects.equals(id, anggota.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}