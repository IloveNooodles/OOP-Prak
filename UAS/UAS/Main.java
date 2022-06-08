import java.util.*;

public class Main {
  public static void main(String[] args) {

    // Buat Jalur
    JalurArteri arteri = new JalurArteri("Arteri 1", 2);
    JalurTol tol = new JalurTol("Tol 1", 100);
    JalurKereta jalurkereta = new JalurKereta("Kereta 1", 5);

    // jalur tol punya penunjang
    PenunjangNetkliks netkliks = new PenunjangNetkliks();
    PenunjangFoodStreet foodStreet = new PenunjangFoodStreet();
    PenunjangGoMassage goMassage = new PenunjangGoMassage();
    tol.addPenunjang(netkliks);
    tol.addPenunjang(foodStreet);

    ArrayList<Jalur> listJalurMudik = new ArrayList<Jalur>();
    listJalurMudik.add(arteri);
    listJalurMudik.add(tol);
    listJalurMudik.add(jalurkereta);

    // Buat MudikWakanda
    MudikWakanda mudikWakanda = new MudikWakanda(3, listJalurMudik);

    // tambahin jalur ke mudik
    for (int i = 0; i < 2; i++) {
      Mobil k = new Mobil(1);
      k.daftarJalurMudik(mudikWakanda);
    }

    Kereta k = new Kereta(2);
    k.cariJalurMudik(mudikWakanda);
    arteri.sendPesan("HATI HATI MACET");

    k.daftarJalurMudik(mudikWakanda);

    k.getTotalHarga();
  }
}
