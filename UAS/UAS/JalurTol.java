public class JalurTol extends Jalur {
  public JalurTol() {
    super();
    this.setHargaJalur(750000);
    this.setTipeJalur("Tol");
  }

  public JalurTol(String namaJalur, int batasJumlahKendaraan) {
    super(namaJalur, batasJumlahKendaraan);
    this.setHargaJalur(750000);
    this.setTipeJalur("Tol");
  }
}
