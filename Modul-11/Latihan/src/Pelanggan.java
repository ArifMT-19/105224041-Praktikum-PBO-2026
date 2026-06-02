public class Pelanggan {
    int stokKopi = 5;

    public void daftarMember(int umur) {
        if (umur < 17) {
            throw new IllegalArgumentException("Maaf, umur Anda belum mencukupi untuk menjadi Member VIP");
        }
        System.out.println("Pelanggan berhasil menjadi Member VIP");
    }

    public void pesanKopi(int jumlahPesanan) {
        if (jumlahPesanan > stokKopi) {
            throw new KopiHabisException("Stok kopi tidak cukup.");
        }
        stokKopi -= jumlahPesanan;
        System.out.println("Pesanan kopi berhasil");
        System.out.println("Sisa stok kopi: " + stokKopi);
    }
}