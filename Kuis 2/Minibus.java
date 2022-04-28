public class Minibus extends Bus implements Diskon {

  public Minibus() {
    super(5);
  }

  @Override
  public void printInfo() {
    System.out.println(super.nomorUnikKendaraan);
    System.out.println(this.diskon(5000));
  }

  @Override
  public int diskon(int potonganHarga) {
    return this.biayaSewa(super.kapasitasKendaraan) - potonganHarga;
  }

  public int biayaSewa() {
    return super.kapasitasKendaraan * super.lamaSewa * 2500;
  }
}
