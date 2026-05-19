public class Monitor {
    private String merk, resolusi;
    private double ukuranInch;

    public Monitor(String merk, double ukuranInch, String resolusi) {
        this.merk = merk;
        this.ukuranInch = ukuranInch;
        this.resolusi = resolusi;
    }

    public String getInfo() {
        return merk + " " + ukuranInch + " inch (" + resolusi + ")";
    }
}