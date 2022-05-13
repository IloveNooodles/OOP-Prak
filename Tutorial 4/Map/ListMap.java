public class ListMap implements Map {
  private ListMapEntry map;

  public ListMap() {
    this.map = null;
  }

  public ListMap(ListMapEntry l) {
    this.map = l;
  }

  /**
   * Menambahkan (key, value) ke dalam map
   * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
   */
  public void set(String key, String value) {
    ListMapEntry l = this.map;
    boolean found = false;
    if (l == null) {
      this.map = new ListMapEntry(key, value);
    } else {
      while (l != null && !found) {
        if (l.getKey().equals(key)) {
          l.setValue(value);
          found = true;
        }
        l = l.getNext();
      }
      if (!found) {
        this.map = new ListMapEntry(key, value, this.map);
      }
    }
  }

  /**
   * Mengembalikan value yang tersimpan untuk key tertentu pada map
   * Mengembalikan NULL apabila map tidak mengandung key masukan.
   */
  public String get(String key) {
    ListMapEntry l = this.map;
    while (l != null) {
      if (l.getKey().equals(key)) {
        return l.getValue();
      }
      l = l.getNext();
    }
    return null;
  }

  /**
   * Menghitung jumlah elemen yang ada pada map
   */
  public int size() {
    ListMapEntry l = this.map;
    int size = 0;
    while (l != null) {
      size++;
      l = l.getNext();
    }
    return size;
  }
}
