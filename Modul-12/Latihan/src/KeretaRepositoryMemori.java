import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// SOLID - SRP: Repository ini khusus menyimpan data kereta di memori
public class KeretaRepositoryMemori implements KeretaRepository {
    private final List<KeretaApi> daftarKereta = new ArrayList<>();

    public KeretaRepositoryMemori() {
        daftarKereta.add(new KeretaApi("K01", "Argo Bromo", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("K02", "Parahyangan", "JKT - BDG", 15));
    }

    @Override
    public List<KeretaApi> getSemuaKereta() {
        return Collections.unmodifiableList(daftarKereta);
    }

    @Override
    public KeretaApi cariByKode(String kodeKereta) throws RuteTidakDitemukanException {
        for (KeretaApi kereta : daftarKereta) {
            if (kereta.getKodeKereta().equalsIgnoreCase(kodeKereta)) {
                return kereta;
            }
        }

        throw new RuteTidakDitemukanException("Kode kereta " + kodeKereta + " tidak ditemukan");
    }
}
