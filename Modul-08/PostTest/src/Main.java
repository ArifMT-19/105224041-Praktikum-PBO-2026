abstract class Karyawan {
	protected String nama;

	public Karyawan(String nama) {
		this.nama = nama;
	}
	public abstract double hitungGaji();

	public String getNama() {
		return nama;
	}
}

class Programmer extends Karyawan {
	private double gajiPokok;

	public Programmer(String nama, double gajiPokok) {
		super(nama); 
		this.gajiPokok = gajiPokok;
	}

	@Override
	public double hitungGaji() {
		return gajiPokok; 
	}
}

public class Main {
	public static void main(String[] args) {
		Karyawan k1 = new Programmer("Arif", 8000000);

		System.out.println("Nama Karyawan : " + k1.getNama());
		System.out.println("Total Gaji    : " + k1.hitungGaji());
	}
}