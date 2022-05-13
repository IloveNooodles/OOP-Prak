import java.lang.Comparable;

class Mahasiswa implements Comparable<Mahasiswa> {
  private float ipk;
  private int kodeJurusan;
  private int angkatan;

  public Mahasiswa(int kodeJurusan, int angkatan, float ipk) {
    this.ipk = ipk;
    this.kodeJurusan = kodeJurusan;
    this.angkatan = angkatan;
  }

  public float getIpk() {
    return this.ipk;
  }

  public void setIpk(float ipk) {
    this.ipk = ipk;
  }

  public int getKodeJurusan() {
    return this.kodeJurusan;
  }

  public void setKodeJurusan(int kodeJurusan) {
    this.kodeJurusan = kodeJurusan;
  }

  public int getAngkatan() {
    return this.angkatan;
  }

  public void setAngkatan(int angkatan) {
    this.angkatan = angkatan;
  }

  public int compareTo(Mahasiswa m) {
    // klo sama
    if (this.ipk == m.ipk && this.angkatan == m.angkatan && this.kodeJurusan == m.kodeJurusan) {
      return 0;
    }
    // klo kurang
    if (this.kodeJurusan <= m.kodeJurusan) {
      if (this.kodeJurusan == m.kodeJurusan) {
        if (this.angkatan >= m.angkatan) {
          if (this.angkatan == m.angkatan) {
            return this.ipk > m.ipk ? -1 : 1;
          }
          return -1;
        }
        return 1;
      }
      return -1;
    }
    return 1;
  }
}