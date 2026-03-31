public class HitungGaji {
    // 105224041 | Modul 2 | POST-TEST
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();

        System.out.print("Gaji Pokok (Rp): ");
        double gajiPokok = input.nextDouble();

        System.out.print("Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double upahLemburJam = gajiPokok / 173;
        double totalUangLembur = jamLembur * upahLemburJam;
        double gajiBruto = gajiPokok + totalUangLembur;
        double pajak = gajiBruto * 0.05;
        double bpjs = gajiPokok * 0.01;
        double gajiNetto = gajiBruto - pajak - bpjs;

        System.out.println("\nSLIP GAJI");
        System.out.println("Karyawan : " + nama);
        System.out.println("Upah Lembur/Jam: Rp " + upahLemburJam);
        System.out.println("Total Uang Lembur: Rp " + totalUangLembur);
        System.out.println("Gaji Bruto : Rp " + gajiBruto);
        System.out.println("Potongan Pajak : Rp " + pajak);
        System.out.println("Potongan BPJS : Rp " + bpjs);
        System.out.println("GAJI BERSIH : Rp " + gajiNetto);

        input.close();
    }
}