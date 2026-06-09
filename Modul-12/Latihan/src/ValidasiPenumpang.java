// SOLID - SRP: ValidasiPenumpang cuma cek NIK, nama, dan jumlah tiket
public class ValidasiPenumpang implements PenumpangValidator {
    @Override
    public void validasi(String nik, String namaPenumpang, int jumlahTiket) {
        validasiNik(nik);
        validasiNama(namaPenumpang);
        validasiJumlahTiket(jumlahTiket);
    }

    private void validasiNik(String nik) {
        if (nik == null || nik.length() != 16) {
            throw new DataPenumpangTidakValidException("NIK harus berjumlah 16 digit");
        }

        for (int i = 0; i < nik.length(); i++) {
            if (!Character.isDigit(nik.charAt(i))) {
                throw new DataPenumpangTidakValidException("NIK hanya boleh berisi angka");
            }
        }
    }

    private void validasiNama(String namaPenumpang) {
        if (namaPenumpang == null || namaPenumpang.trim().isEmpty()) {
            throw new DataPenumpangTidakValidException("Nama penumpang tidak boleh kosong");
        }
    }

    private void validasiJumlahTiket(int jumlahTiket) {
        if (jumlahTiket <= 0) {
            throw new DataPenumpangTidakValidException("Jumlah tiket harus lebih dari 0");
        }
    }
}
