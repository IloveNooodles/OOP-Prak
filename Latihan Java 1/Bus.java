public class Bus extends Kendaraan {
    private int kapasitas;
    private String supir;

    public Bus() {
        super();
        this.kapasitas = 0;
        this.supir = "XXXX";
    }

    public Bus(int nomor, String merk, int tahun, int kapasitas, String supir) {
        super(nomor, merk, tahun);
        this.kapasitas = kapasitas;
        this.supir = supir;
    }

    public int getKapasitas() {
        return this.kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getSupir() {
        return this.supir;
    }

    public void setSupir(String supir) {
        this.supir = supir;
    }

    @Override
    public long BiayaSewa(int lamaSewa) {
        return 1000000 * lamaSewa;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Kategori: %s\n", "Bus");
        System.out.printf("Kapasitas: %d\n", this.kapasitas);
        System.out.printf("Supir: %s\n", this.supir);
    }
}
