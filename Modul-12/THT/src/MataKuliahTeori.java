public class MataKuliahTeori extends MataKuliah {

    public MataKuliahTeori(String kode, String nama, int sks) {
        super(kode, nama, sks);
    }

    @Override
    public String getJenis() {
        return "Teori";
    }
}