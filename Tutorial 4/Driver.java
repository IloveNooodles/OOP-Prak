import Time.*;
import Map.*;

public class Driver {
  public static void main(String[] args) {
    ListMap a = new ListMap();
    a.set("Anies", "940329502345");
    a.set("Basuki", "382901849102");
    System.out.println(a.get("Anies"));
    System.out.println(a.get("Basuki"));
    System.out.println(a.get("Jokowi"));

  }
}
