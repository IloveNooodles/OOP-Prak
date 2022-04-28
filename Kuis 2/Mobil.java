public class Mobil extends KendaraanRental {
  protected int rateSupir;

  public Mobil(int rateSupir) {
    this.rateSupir = rateSupir;
  }

  @Override
  public void printInfo() {
    System.out.println(super.nomorUnikKendaraan);
    System.out.println(this.biayaSewa());
  }

  @Override
  public int biayaSewa(int rateSupir) {
    return super.biayaSewa(super.kapasitasKendaraan) * rateSupir;
  }

}
