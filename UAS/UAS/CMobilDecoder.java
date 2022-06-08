import java.lang.reflect.*;

public class CMobilDecoder {
  CMobil mobil;

  CMobilDecoder(CMobil mobil) {
    this.mobil = mobil;
  }

  public void tambahMobilToMirip(String name) throws Exception {
    Method m = this.mobil.getClass().getDeclaredMethod("tambahMobilToMirip", String.class);
    m.setAccessible(true);
    m.invoke(this.mobil, name);
  }

  public int getHarga() throws Exception {
    Field f = this.mobil.getClass().getDeclaredField("harga");
    f.setAccessible(true);
    return (int) f.get(this);
  }
}