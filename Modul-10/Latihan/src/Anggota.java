import java.util.*;

public class Anggota {
  String idAnggota, nama, tipe;

  public Anggota(String idAnggota, String nama, String tipe) {
    this.idAnggota = idAnggota;
    this.nama = nama;
    this.tipe = tipe;
  }

  public void tampil() {
    System.out.println("ID Anggota : " + idAnggota);
    System.out.println("Nama       : " + nama);
    System.out.println("Tipe       : " + tipe);
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
    return Objects.equals(idAnggota, anggota.idAnggota);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idAnggota);
  }
}