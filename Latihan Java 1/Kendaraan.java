public abstract class Kendaraan {
    private int nomor;
    private String merk;
    private int tahun;

    public Kendaraan() {
        this.nomor = 0;
        this.merk = "XXX";
        this.tahun = 0;
    }

    public Kendaraan(int nomor, String merk, int tahun) {
        this.nomor = nomor;
        this.merk = merk;
        this.tahun = tahun;
    }

    public int getNomor() {
        return this.nomor;
    }

    public void setNomor(int nomor) {
        this.nomor = nomor;
    }

    public String getMerk() {
        return this.merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun() {
        return this.tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public abstract long BiayaSewa(int lamaSewa);

    public void printInfo() {
        System.out.printf("Nomor Kendaraan: %d\n", this.nomor);
        System.out.printf("Merk: %s\n", this.merk);
        System.out.printf("Tahun Keluaran: %d\n", this.tahun);
    }
}
