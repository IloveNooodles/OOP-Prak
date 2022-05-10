import java.lang.reflect.*;
import java.util.HashMap;

public class Injector {
  HashMap<Class, Object> dMap;

  public Injector() {
    dMap = new HashMap<Class, Object>();
  }
  // Menerima sebuah definisi dependencies
  // yang berupa sebuah instansiasi kelas
  // Catatan: Injector bisa menampung lebih dari 1 dependency,
  // jadi injector bisa menginject banyak sekaligus.
  // Jika ada 2 objek dengan kelas yang sama,
  // inject dengan object terakhir yang di add ke daftar dependency

  // cari dulu objeknya klo ada
  void addDependencies(Object object) {
    dMap.put(object.getClass(), object);
  }

  /*
   * Menginjeksi dependencies yang telah dibuat ke dalam objek
   * Injeksi dilakukan dengan mengacu pada dependencies yang ditambah
   * pada method addDependencies.
   * 
   * Setiap field di object yang diinject, bila kelasnya
   * sudah ditambahkan sebagai dependency, maka akan diset sebagai
   * object yang sudah di add didependency.
   */
  void inject(Object object) throws Exception {
    Field[] listField = object.getClass().getDeclaredFields();
    for (Field field : listField) {
      field.setAccessible(true);
      if (dMap.containsKey(field.getType())) {
        field.set(object, dMap.get(field.getType()));
      }
    }
  }
}