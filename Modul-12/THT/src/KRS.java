import java.util.ArrayList;
import java.util.List;

public class KRS {
    private String nomorKRS;
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> daftarMataKuliah;

    public KRS(String nomorKRS, Mahasiswa mahasiswa) {
        this.nomorKRS = nomorKRS;
        this.mahasiswa = mahasiswa;
        this.daftarMataKuliah = new ArrayList<>();
    }

    public String getNomorKRS() {
        return nomorKRS;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public List<MataKuliah> getDaftarMataKuliah() {
        return daftarMataKuliah;
    }
}