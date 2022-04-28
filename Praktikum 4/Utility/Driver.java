cimport java.util.Arrays;

public class Driver {
  public static void main(String args[]) {
    String[] x = { "aku", "suka", "informatika", "tapiboong" };
    Utility.<String>swap(x, 1, 3);
    System.out.println(Arrays.toString(x));
    String[] y = Utility.<String>repeat(x, 4);
    System.out.println(Arrays.toString(y));
    String z = Utility.<String>join(x);
    System.out.println(String.valueOf(x));
    System.out.println(z);
    Integer[] i = { new Integer(3), new Integer(4), new Integer(5) };
    double k = Utility.<Integer>sum(i);
    System.out.println(k);
  }
}