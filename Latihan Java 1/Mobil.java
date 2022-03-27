public class Mobil extends Kendaraan {
    public Mobil() {
        super();
    }

    public Mobil(int nomor, String merk, int tahun) {
        super(nomor, merk, tahun);
    }

    @Override
    public long BiayaSewa(int lamaSewa) {
        return 500000 * lamaSewa;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Kategori: %s\n", "Mobil");
    }
}