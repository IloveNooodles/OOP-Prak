public class Minibus extends Kendaraan {
    public Minibus() {
        super();
    }

    public Minibus(int nomor, String merk, int tahun) {
        super(nomor, merk, tahun);
    }

    @Override
    public long BiayaSewa(int lamaSewa) {
        if (lamaSewa <= 5) {
            return 5000000;
        } else {
            return 5000000 + (5000000 * (lamaSewa - 5));
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Kategori: %s\n", "Minibus");
    }

    public double Diskon(int lamaSewa) {
        if (lamaSewa > 10) {
            return BiayaSewa(lamaSewa) * 0.9;
        } else {
            return BiayaSewa(lamaSewa);
        }
    }
}
