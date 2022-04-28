public abstract class KendaraanRental {
  protected int nomorUnikKendaraan;
  protected String merk;
  protected int tahun;
  protected int lamaSewa;
  protected static int counter = 0;

  public KendaraanRental(String merk, int tahun, int lamaSewa) {
    counter += 1;
    this.nomorUnikKendaraan = counter;
    this.merk = "honda";
    this.tahun = 2022;
    this.lamaSewa = 5;
  }

  public abstract void printInfo();

  public abstract int biayaSewa(int lamaSewa);
}
