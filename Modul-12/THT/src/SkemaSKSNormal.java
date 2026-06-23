public class SkemaSKSNormal implements SkemaSKS {
    @Override
    public int hitungTotalSKS(KRS krs) {
        int total = 0;

        for (MataKuliah mk : krs.getDaftarMataKuliah()) {
            total += mk.getSks();
        }

        return total;
    }
}