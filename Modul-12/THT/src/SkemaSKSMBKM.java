public class SkemaSKSMBKM implements SkemaSKS {
    @Override
    public int hitungTotalSKS(KRS krs) {
        int total = 0;

        for (MataKuliah mk : krs.getDaftarMataKuliah()) {
            if (mk instanceof MataKuliahKKN) {
                total += 20;
            } else {
                total += mk.getSks();
            }
        }

        return total;
    }
}