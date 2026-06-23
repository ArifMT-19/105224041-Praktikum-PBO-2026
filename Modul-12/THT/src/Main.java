public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa("105224041", "Arif Mufti Tharsa", new UKTReguler());

        MataKuliah mk1 = new MataKuliahTeori("IF101", "Rekayasa Perangkat Lunak", 3);
        MataKuliah mk2 = new MataKuliahPraktikum("IF102", "Praktikum PBO", 1);
        MataKuliah mk3 = new MataKuliahKKN("UP301", "Kuliah Kerja Nyata", 4);

        KRS krs = new KRS("KRS001", mahasiswa);

        KRSRepository repository = new CloudNoSQLKRSRepository();
        KRSReportGenerator report = new PDFKRSReportGenerator();
        SkemaSKS skemaNormal = new SkemaSKSNormal();

        KRSService service = new KRSService(repository, report, skemaNormal);

        service.tambahMataKuliah(krs, mk1);
        service.tambahMataKuliah(krs, mk2);
        service.tambahMataKuliah(krs, mk3);

        System.out.println("--- Data Krs ---");
        System.out.println("Nama Mahasiswa: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Jalur UKT: " + mahasiswa.getJalurMasuk());
        System.out.println("Tagihan UKT: " + service.hitungTagihanUKT(mahasiswa));
        System.out.println("Total SKS: " + service.hitungTotalSKS(krs));
        System.out.println();

        System.out.println("---- Daftar Mata Kuliah ---");
        for (MataKuliah mk : krs.getDaftarMataKuliah()) {
            System.out.println(mk.getKode() + " - " + mk.getNama() + " - " + mk.getJenis());

            if (mk instanceof OperasiPraktikum) {
                OperasiPraktikum praktikum = (OperasiPraktikum) mk;
                praktikum.alokasiAsistenLab();
                praktikum.cekPeralatanPraktikum();
            }
        }

        System.out.println();
        service.simpanKRS(krs);
        service.cetakDraftKRS(krs);

        System.out.println();
        System.out.println("---- Pindah Database ---");
        KRSService serviceMySQL = new KRSService(new MySQLKRSRepository(), report, skemaNormal);
        serviceMySQL.simpanKRS(krs);

        System.out.println();
        System.out.println("--- Skema Mbkm ----");
        KRSService serviceMBKM = new KRSService(repository, report, new SkemaSKSMBKM());
        System.out.println("Total SKS MBKM: " + serviceMBKM.hitungTotalSKS(krs));

        System.out.println();
        System.out.println("--- UKT Bidikmisi ---");
        Mahasiswa mahasiswa2 = new Mahasiswa("105224099", "Budi", new UKTBidikmisi());
        System.out.println("Nama Mahasiswa: " + mahasiswa2.getNama());
        System.out.println("Jalur UKT: " + mahasiswa2.getJalurMasuk());
        System.out.println("Tagihan UKT: Rp" + mahasiswa2.hitungUKT());
    }
}