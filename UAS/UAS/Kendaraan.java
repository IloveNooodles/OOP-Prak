
//dibuat dengan pattern observer (publisher subsrciber)
public class Kendaraan {
  public static int kendaraanCounter = 0;
  private int id;
  private String tipe;
  private Jalur jalur;
  private int lamaMudik;

  public Kendaraan() {
    kendaraanCounter++;
    this.id = kendaraanCounter;
    this.tipe = "";
  }

  public String getTipe() {
    return this.tipe;
  }

  public int getId() {
    return this.id;
  }

  public int getLamaMudik() {
    return this.lamaMudik;
  }

  public void setLamaMudik(int lamaMudik) {
    this.lamaMudik = lamaMudik;
  }

  public void setTipe(String tipe) {
    this.tipe = tipe;
  }

  public void setJalur(Jalur j) {
    this.jalur = j;
  }

  public void getTotalHarga() {
    try {
      System.out.println(String.format("Kendaraan dengan id: %d jalur: %s memiliki biaya sebesar: %d", this.id,
          this.jalur.getNamaJalur(), this.jalur.getHargaTotal() * this.lamaMudik));
    } catch (Exception e) {
      System.out.println("Belum daftar mudik");
    }
  }

  public void getPesan(String pesan) {
    System.out.println(
        "Mendapat pesan kendaraan dengan id: " + String.valueOf(this.id) + " dari jalur mudik bahwa: " + pesan);
  }

  public void cariJalurMudik(MudikWakanda mudik) {
    mudik.cariKetersidaanJalur();
  }

  public void daftarJalurMudik(MudikWakanda mudik) {
    mudik.daftarMudik(this);
  }
}
