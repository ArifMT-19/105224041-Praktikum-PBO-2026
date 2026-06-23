public abstract class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (kode == null || kode.isBlank()) {
            throw new IllegalArgumentException("Kode mata kuliah tidak boleh kosong");
        }

        if (nama == null || nama.isBlank()) {
            throw new IllegalArgumentException("Nama mata kuliah tidak boleh kosong");
        }

        if (sks <= 0) {
            throw new IllegalArgumentException("SKS harus lebih dari 0");
        }

        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public abstract String getJenis();
}