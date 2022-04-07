import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

// ANDA TIDAK BOLEH MENAMBAH, MENGURANGI, ATAU MENGUBAH NAMA ATRIBUT KELAS
class NummerReageerbuisje {
  private Stack<Integer> contents; // Isi dari NummerReageerbuisje
  private int capacity; // Kapasitas maksimal dari NummerReageerbuisje
  private int filledCap; // Berapa banyak angka yang telah mengisi NummerReageerbuisje

  public NummerReageerbuisje() {
    this.contents = new Stack<Integer>();
    this.capacity = 3;
    this.filledCap = 0;
    // Default konstruktor dengan capacity = 3
  }

  public NummerReageerbuisje(int cap) {
    this.contents = new Stack<Integer>();
    this.capacity = cap;
    this.filledCap = 0;
    // Modified konstruktor dengan capacity = cap
  }

  public int getCapacity() {
    return this.capacity;
  }

  public int getFilledCap() {
    return this.filledCap;
  }

  public void receiveOneSubstance(int substance) {
    if (this.filledCap < this.capacity) {
      contents.push(substance);
      this.filledCap++;
    }
    // NummerReageerbuisje menerima satu "substance" yaitu angka yang masuk
  }

  public void pour(NummerReageerbuisje other) {
    while (other.getFilledCap() < other.getCapacity() && this.filledCap > 0) {
      other.receiveOneSubstance(this.contents.pop());
      this.filledCap--;
    }
    // NummerReageerbuisje menuangkan isi dari contents ke NummerReageerbuisje other
    // hingga other penuh
    // Note: Angka yang dituangkan terlebih dahulu adalah angka yang paling atas
    // posisinya
  }

  public void pourAllContents() {
    while (this.filledCap > 0) {
      System.out.println(this.contents.pop());
      this.filledCap--;
    }
    // NummerReageerbuisje ditumpahkan sepenuhnya, sehigga contents kosong
    // Melakukan println untuk setiap elemen yang tumpah berurut dari yang paling
    // awal tumpah
  }

  public void stirSwirl() {
    Stack<Integer> revStack = new Stack<Integer>();
    for (int i = 0; i < this.filledCap; i++) {
      revStack.push(this.contents.pop());
    }
    this.contents = revStack;
    // contents dari NummerReageerbuisje menjadi terbalik urutannya
  }

  public void centrifuge() {
    ArrayList<Integer> a = new ArrayList<Integer>();
    for (int i = 0; i < this.filledCap; i++) {
      a.add(this.contents.pop());
    }
    Collections.sort(a, Collections.reverseOrder());
    for (int i = 0; i < a.size(); i++) {
      this.contents.push(a.get(i));
    }
    // contents dari NummerReageerbuisje diurutkan berdasarkan nilai angkanya,
    // dengan yang terbesar di paling bawah dan yang terkecil di paling atas
  }
}
