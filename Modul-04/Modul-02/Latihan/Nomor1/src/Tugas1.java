public class Tugas1 {
    // 105224041 | Modul 2 | Nomor1
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double panjang = input.nextDouble();
        double lebar = input.nextDouble();
        double tinggi = input.nextDouble();

        double luasDinding = (2 * panjang * tinggi) + (2 * lebar * tinggi);
        int literDibutuhkan = (int) Math.ceil(luasDinding / 10);

        System.out.println(luasDinding);
        System.out.println(literDibutuhkan);

        input.close();
    }
}