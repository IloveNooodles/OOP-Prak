import java.util.ArrayList;

//dibuat dengan design pattern singleton
class MudikWakanda {
  private static MudikWakanda mw;
  private int jumlahKapasitasJalur;
  private ArrayList<Jalur> listJalur;

  public MudikWakanda() {
    this.jumlahKapasitasJalur = 10; // asumsi
    this.listJalur = new ArrayList<Jalur>();
  }

  public MudikWakanda(int jumlahKapasitasJalur, ArrayList<Jalur> aj) {
    this.jumlahKapasitasJalur = jumlahKapasitasJalur;
    this.listJalur = aj;
  }

  public static MudikWakanda getInstance() {
    if (mw.equals(null)) {
      mw = new MudikWakanda();
    }
    return mw;
  }

  public void addJalur(Jalur j) {
    if (this.listJalur.size() < jumlahKapasitasJalur) {
      this.listJalur.add(j);
    }
  }

  public void cariKetersidaanJalur() {
    for (Jalur j : this.listJalur) {
      System.out.print(j.toString());
      if (j.listKendaraan.size() >= j.batasJumlahKendaraan) {
        System.out.print(". Jalur sudah penuh\n");
      } else {
        System.out.print(". Jalur masih tersedia\n");
      }
    }
  }

  public void daftarMudik(Kendaraan k) {
    for (Jalur j : this.listJalur) {
      if (j.listKendaraan.size() >= j.batasJumlahKendaraan) {
        System.out.println("Gagal daftar mudik");
        System.out.print("Jalur " + j.getNamaJalur() + " sudah penuh\n");
      } else {
        j.listKendaraan.add(k);
        k.setJalur(j);
        System.out.print("Berhasil mendaftar mudik dengan jalur " + j.getNamaJalur() + "\n");
        break;
      }
    }
  }
}