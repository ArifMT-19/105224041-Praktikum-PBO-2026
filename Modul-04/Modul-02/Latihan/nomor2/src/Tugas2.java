public class Tugas2 {
  // 105224041 | Modul 2 | Nomor2
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9 / 5) + 32;
        double kelvin = celcius + 273.15;
        double reamur = celcius * 4 / 5;

        System.out.printf("%.2f\n", fahrenheit);
        System.out.printf("%.2f\n", kelvin);
        System.out.printf("%.2f\n", reamur);

        input.close();
    }
}