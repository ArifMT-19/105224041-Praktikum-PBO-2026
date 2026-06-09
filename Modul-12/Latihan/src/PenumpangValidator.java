// SOLID - ISP: Kontrak kecil khusus validasi data penumpang
public interface PenumpangValidator {
    void validasi(String nik, String namaPenumpang, int jumlahTiket);
}
