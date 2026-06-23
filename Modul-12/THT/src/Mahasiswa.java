public class Mahasiswa {
    private String nim;
    private String nama;
    private SkemaUKT skemaUKT;

    public Mahasiswa(String nim, String nama, SkemaUKT skemaUKT) {
        this.nim = nim;
        this.nama = nama;
        this.skemaUKT = skemaUKT;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public long hitungUKT() {
        return skemaUKT.hitungUKT();
    }

    public String getJalurMasuk() {
        return skemaUKT.getNamaSkema();
    }
}