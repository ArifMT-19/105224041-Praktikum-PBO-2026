public class AkunBank {
    private String nomorRekening;
    private double saldo;
    private double totalTransferHariIni;

    public AkunBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.totalTransferHariIni = 0;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public double getSaldo() {
        return saldo;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk tarik tunai");
        }

        saldo -= nominal;
        System.out.println("Tarik tunai Rp" + nominal);
        System.out.println("Sisa saldo: Rp" + saldo);
    }

    public void transfer(AkunBank tujuan, double nominal)
            throws SaldoTidakMencukupiException, BatasTransferHarianException {

        double limitHarian = 7000000;
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi untuk transfer");
        }

        if (totalTransferHariIni + nominal > limitHarian) {
            throw new BatasTransferHarianException("Transfer melebihi limit harian Rp7.000.000");
        }

        saldo -= nominal;
        tujuan.saldo += nominal;
        totalTransferHariIni += nominal;

        System.out.println("Transfer Rp" + nominal + " ke rekening " + tujuan.getNomorRekening() + " berhasil");
        System.out.println("Sisa saldo: Rp" + saldo);
    }
}