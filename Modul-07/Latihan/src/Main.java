import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Soal 3
    ArrayList<PerangkatPintar> perangkatList = new ArrayList<>();
    perangkatList.add(new LampuPintar());   
    perangkatList.add(new AcPintar());     
    
/* Analisis:
Pesan yang tercetak berbeda karena polymorphism.
Meskipun referensi variabel bertipe PerangkatPintar, 
objek aslinya yang tersimpan di memori adalah LampuPintar dan AcPintar. 
Saat metode aktifkan() dipanggil, Java menentukan di runtime metode mana yang akan dijalankan berdasarkan tipe objek,
bukan tipe referensinya. Karena kedua subclass telah melakukan overriding terhadap metode aktifkan(),
maka versi milik subclass-lah yang dipanggil, menghasilkan keluaran yang spesifik sesuai perangkat aslinya.
*/

    // Soal 4
    for (PerangkatPintar p : perangkatList) {
      p.aktifkan();
      if (p instanceof AcPintar) {
        AcPintar ac = (AcPintar) p;
        ac.aturSuhu(20); 
      }  
    }

/* Analisis Soal 5:
Error terjadi karena Java memeriksa metode berdasarkan tipe referensi,
bukan objek aslinya. Variabel alat1 bertipe PerangkatPintar, 
dan di kelas itu tidak ada metode aturKecerahan(), jadi compiler menolak. 
Meskipun objeknya LampuPintar, Java tetap mengacu pada tipe referensi saat kompilasi.
*/
    // Perbaikan kode:
    PerangkatPintar alat1 = new LampuPintar();
    if (alat1 instanceof LampuPintar) {
    LampuPintar lamp = (LampuPintar) alat1;
    lamp.aturKecerahan(75, "Putih");
    }

  }
}