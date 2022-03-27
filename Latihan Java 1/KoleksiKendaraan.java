public class KoleksiKendaraan {
  private int nEff;
  private int size;
  private Kendaraan[] koleksiKendaran;

  public KoleksiKendaraan(){
    this.nEff = 0;
    this.size = 100;
    this.koleksiKendaran = new Kendaraan[100];
  }

  public KoleksiKendaraan(int size) {
    this.nEff = 0;
    this.size = size;
    this.koleksiKendaran = new Kendaraan[size];
  }

  public void printAll(){
    for(int i = 0; i < this.nEff; i++) {
      this.koleksiKendaran[i].printInfo();
      System.out.println("---------------");
    }
  }

  //asumsi selalu ada memori
  public void push(Kendaraan k) {
    this.koleksiKendaran[this.nEff++] = k;
  }

  //asumsi selalu ada memori
  public void append(KoleksiKendaraan kk) {
    for(int i = 0; i < kk.size; i++){
      if(this.nEff < this.size) {
        this.koleksiKendaran[this.nEff++] = kk.koleksiKendaran[i];
      }
    }
  }
}