public class JalurKereta extends Jalur {
  public JalurKereta() {
    super();
    this.setHargaJalur(1000000);
    this.setTipeJalur("Kereta");
  }

  public JalurKereta(String namaJalur, int batasJumlahKendaraan) {
    super(namaJalur, batasJumlahKendaraan);
    this.setHargaJalur(1000000);
    this.setTipeJalur("Kereta");
  }
}
