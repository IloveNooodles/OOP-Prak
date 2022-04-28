public class Bus extends KendaraanRental {
  protected int kapasitasKendaraan;

  public Bus(int kapasitasKendaraan) {
    super("Honda", 2022, 10);
    this.kapasitasKendaraan = kapasitasKendaraan;
  }

  @Override
  public void printInfo() {
    System.out.println(super.nomorUnikKendaraan);
    System.out.println(this.biayaSewa(super.lamaSewa));
  }

  @Override
  public int biayaSewa(int lamaSewa) {
    return this.kapasitasKendaraan * lamaSewa * 5000;
  }
}
