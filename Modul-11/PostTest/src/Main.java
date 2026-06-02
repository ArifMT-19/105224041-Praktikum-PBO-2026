public class Main {
    public static void main(String[] args) {
        AkunBank akun1 = new AkunBank("111-222", 500000);
        AkunBank akun2 = new AkunBank("333-444", 20000000);
        AkunBank akun3 = new AkunBank("555-666", 1000000);

        try {
            System.out.println("--- Tarik Tunai ---");
            akun1.tarikTunai(200000);
            akun1.tarikTunai(300000);
            akun1.tarikTunai(100000);

        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            System.out.println("\n--- Transfer ---");
            akun2.transfer(akun1, 100000);
            akun2.transfer(akun3, 10000000);

        } catch (SaldoTidakMencukupiException e) {
            System.out.println("Error saldo: " + e.getMessage());
        } catch (BatasTransferHarianException e) {
            System.out.println("Error limit: " + e.getMessage());
        } finally {
            System.out.println("\nSesi transaksi ATM Anda telah diakhiri. Kartu dikeluarkan otomatis.");
        }
    }
}