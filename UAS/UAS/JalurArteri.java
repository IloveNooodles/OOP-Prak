public class JalurArteri extends Jalur {
  public JalurArteri() {
    super();
    this.setHargaJalur(150000);
    this.setTipeJalur("Arteri");
  }

  public JalurArteri(String namaJalur, int batasJumlahKendaraan) {
    super(namaJalur, batasJumlahKendaraan);
    this.setHargaJalur(150000);
    this.setTipeJalur("Arteri");
  }
}
