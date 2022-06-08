import java.util.*;

public class CMobil {
  private int harga;
  private List mirip;

  CMobil(int harga) {
    this.harga = harga;
    mirip = new ArrayList();
  }

  private void tambahMobilToMirip(String name) {
    this.mirip.add(name);
  }
}
