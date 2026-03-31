public class Tugas3 {
    // 105224041 | Modul 2 | Nomor3
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int jmlA = input.nextInt();
        int jmlB = input.nextInt();
        int bayar = input.nextInt();

        double totalBelanja = (jmlA * 25500) + (jmlB * 14200);
        double totalPlusPPN = totalBelanja * 1.11;
        int kembalian = (int) (bayar - totalPlusPPN);

        int lembar50rb = kembalian / 50000;
        int lembar10rb = (kembalian % 50000) / 10000;

        System.out.println((int)totalPlusPPN);
        System.out.println(kembalian);
        System.out.println(lembar50rb);
        System.out.println(lembar10rb);

        input.close();
    }
}