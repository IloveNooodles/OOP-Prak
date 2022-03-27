public class App {
    public static void main(String[] args) throws Exception {
        Kendaraan K1 = new Bus(1, "Mercedes", 2020, 50, "Pa Dadang");
        Kendaraan K2 = new Minibus(2, "Livina", 2019);
        Kendaraan K3 = new Mobil(3, "Kia", 2021);

        KoleksiKendaraan KL = new KoleksiKendaraan(6);

        KL.push(K1);
        KL.push(K2);
        KL.push(K3);

        KoleksiKendaraan KLNew = new KoleksiKendaraan(3);

        KLNew.push(K3);
        KLNew.push(K2);
        KLNew.push(K1);

        KL.append(KLNew);

        KL.printAll();
    }
}
