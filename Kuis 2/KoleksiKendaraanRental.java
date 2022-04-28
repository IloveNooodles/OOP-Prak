import java.util.ArrayList;

public class KoleksiKendaraanRental {
  private int kapasitasRentalMaksimum;
  private int kapasistasRentalSaatIni;
  private ArrayList<? extends KendaraanRental> koleksiKendaraan;

  public KoleksiKendaraanRental() {
    this.kapasitasRentalMaksimum = 5;
    this.kapasistasRentalSaatIni = 0;
    this.koleksiKendaraan = new ArrayList<? extends KendaraanRental>();
  }

  public KoleksiKendaraanRental(int kapasitasRentalMaksimum, int kapasistasRentalSaatIni) {
    this.kapasitasRentalMaksimum = kapasitasRentalMaksimum;
    this.kapasistasRentalSaatIni = kapasistasRentalSaatIni;
  }

  public void tambahKendaraan(KendaraanRental a) {
    if (this.kapasistasRentalSaatIni < this.kapasitasRentalMaksimum) {
      this.kapasistasRentalSaatIni++;
      this.koleksiKendaraan.add(a);
    } else {
      System.out.println("Koleksi kendaraan sudah penuh");
    }
  }

  public void printAll() {
    int sum = 0;
    for (KendaraanRental a : this.koleksiKendaraan) {
      a.printInfo();
      sum += a.biayaSewa;
    }
    System.out.println("Keuntungan total " + sum);
  }

  public static void main(String[] args) {
    Mobil a = new Mobil(3);
    Bus b = new Bus(10);
    Minibus c = new Minibus();

    KoleksiKendaraanRental d = new KoleksiKendaraanRental();
    d.tambahKendaraan(a);
    d.tambahKendaraan(b);
    d.tambahKendaraan(c);

    d.printAll();
  }
}
