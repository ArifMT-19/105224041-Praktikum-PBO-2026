public class MataKuliahKKN extends MataKuliah {

    public MataKuliahKKN(String kode, String nama, int sks) {
        super(kode, nama, sks);
    }

    @Override
    public String getJenis() {
        return "KKN";
    }
}