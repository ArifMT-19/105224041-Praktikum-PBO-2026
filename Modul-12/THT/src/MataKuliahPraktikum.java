public class MataKuliahPraktikum extends MataKuliah implements OperasiPraktikum {
    public MataKuliahPraktikum(String kode, String nama, int sks) {
        super(kode, nama, sks);
    }

    @Override
    public String getJenis() {
        return "Praktikum";
    }

    @Override
    public void alokasiAsistenLab() {
        System.out.println("Asisten lab dialokasikan untuk " + getNama());
    }

    @Override
    public void cekPeralatanPraktikum() {
        System.out.println("Peralatan praktikum dicek untuk " + getNama());
    }
}