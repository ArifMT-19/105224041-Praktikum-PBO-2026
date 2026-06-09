// SOLID - SRP: KodeBookingGenerator cuma ngurus nomor booking
public class KodeBookingGenerator implements BookingCodeGenerator {
    private int nomorBooking = 1;

    @Override
    public String buatKodeBooking() {
        String kodeBooking = "JEX-" + nomorBooking;
        nomorBooking++;
        return kodeBooking;
    }
}
