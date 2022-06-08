import java.util.*;

//design pattern observer (publisher subscriber)
class Jalur {
  protected String namaJalur;
  protected int batasJumlahKendaraan;
  protected int hargaJalur;
  protected String tipeJalur;
  protected ArrayList<Kendaraan> listKendaraan;
  protected ArrayList<Penunjang> listPenunjang;

  public Jalur() {
    this.batasJumlahKendaraan = 50; // asumsi
    this.hargaJalur = 0;
    this.tipeJalur = "";
    this.namaJalur = "";
    this.listKendaraan = new ArrayList<Kendaraan>();
    this.listPenunjang = new ArrayList<Penunjang>();
  }

  public Jalur(String namaJalur, int batasJumlahKendaraan) {
    this.batasJumlahKendaraan = batasJumlahKendaraan;
    this.namaJalur = namaJalur;
    this.hargaJalur = 0;
    this.tipeJalur = "";
    this.listKendaraan = new ArrayList<Kendaraan>();
    this.listPenunjang = new ArrayList<Penunjang>();
  }

  public int getHargaJalur() {
    return this.hargaJalur;
  }

  public String getTipeJalur() {
    return this.tipeJalur;
  }

  public String getNamaJalur() {
    return this.namaJalur;
  }

  public int getHargaPenunjang() {
    int totalHarga = 0;
    for (Penunjang pen : this.listPenunjang) {
      totalHarga += pen.getHarga();
    }
    return totalHarga;
  }

  public int getHargaTotal() {
    return this.getHargaJalur() + this.getHargaPenunjang();
  }

  public void setHargaJalur(int hargaJalur) {
    this.hargaJalur = hargaJalur;
  }

  public void setTipeJalur(String tipeJalur) {
    this.tipeJalur = tipeJalur;
  }

  public void sendPesan(String pesan) {
    for (Kendaraan k : this.listKendaraan) {
      k.getPesan(pesan);
    }
  }

  public void addPenunjang(Penunjang p) {
    this.listPenunjang.add(p);
  }

  public void addKendaraan(Kendaraan k) {
    if (this.listKendaraan.size() < this.batasJumlahKendaraan) {
      this.listKendaraan.add(k);
    } else {
      System.out.println("Jalur sudah penuh");
    }
  }

  // klo udah sampe tujuan bisa keluar
  public void removeKendaraan(int index) {
    this.listKendaraan.remove(index);
  }

  @Override
  public String toString() {
    return String.format("Jalur %s Memiliki Kapasitas %d/%d dengan tarif %d per hari", this.namaJalur,
        this.listKendaraan.size(), this.batasJumlahKendaraan, this.getHargaTotal());
  }
}
