import java.util.List;

// SOLID - OCP: Kontrak akses data kereta supaya sumber data mudah diganti
public interface KeretaRepository {
    List<KeretaApi> getSemuaKereta();

    KeretaApi cariByKode(String kodeKereta) throws RuteTidakDitemukanException;
}
