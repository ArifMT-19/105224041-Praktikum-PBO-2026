public class PDFKRSReportGenerator implements KRSReportGenerator {
    @Override
    public void cetak(KRS krs) {
        System.out.println("Draft PDF KRS untuk " + krs.getMahasiswa().getNama());

        for (MataKuliah mk : krs.getDaftarMataKuliah()) {
            System.out.println("- " + mk.getKode() + " | " + mk.getNama() + " | " + mk.getSks() + " SKS");
        }
    }
}