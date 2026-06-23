public class MySQLKRSRepository implements KRSRepository {
    @Override
    public void simpan(KRS krs) {
        System.out.println("KRS " + krs.getNomorKRS() + " disimpan ke MySQL.");
    }
}