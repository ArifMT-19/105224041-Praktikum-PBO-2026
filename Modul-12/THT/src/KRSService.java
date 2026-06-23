public class KRSService {
    private KRSRepository repository;
    private KRSReportGenerator reportGenerator;
    private SkemaSKS skemaSKS;

    public KRSService(KRSRepository repository, KRSReportGenerator reportGenerator, SkemaSKS skemaSKS) {
        this.repository = repository;
        this.reportGenerator = reportGenerator;
        this.skemaSKS = skemaSKS;
    }

    public void tambahMataKuliah(KRS krs, MataKuliah mataKuliah) {
        for (MataKuliah mk : krs.getDaftarMataKuliah()) {
            if (mk.getKode().equalsIgnoreCase(mataKuliah.getKode())) {
                throw new IllegalArgumentException("Mata kuliah sudah diambil.");
            }
        }

        krs.tambahMataKuliah(mataKuliah);
    }

    public long hitungTagihanUKT(Mahasiswa mahasiswa) {
        return mahasiswa.hitungUKT();
    }

    public int hitungTotalSKS(KRS krs) {
        return skemaSKS.hitungTotalSKS(krs);
    }

    public void simpanKRS(KRS krs) {
        repository.simpan(krs);
    }

    public void cetakDraftKRS(KRS krs) {
        reportGenerator.cetak(krs);
    }
}