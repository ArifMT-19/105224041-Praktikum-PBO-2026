public class MainKaryawan {
  public static void main(String[] args) {
    System.out.println("Sebelum perubahan data:");
    Karyawan kry1 = new Karyawan("K001", "Danu Dimas Putra", 3000000, "HRD");
    kry1.tampilkanDataKaryawan();

    kry1.setIdKaryawan("K002");
    kry1.setNama("Arif Mufti Tharsa");
    kry1.setGajiPokok(5000000);
    kry1.setDepartment("IT");
    System.out.println("\nSetelah perubahan data:");
    kry1.tampilkanDataKaryawan();
  }
}
