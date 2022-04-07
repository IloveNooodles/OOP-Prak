public class Utility<T> {
  public static <T> void swap(T[] a, int i, int j) {
    if (i < 0 || i >= a.length || j < 0 || j >= a.length)
      return;
    T temp = a[i];
    a[i] = a[j];
    a[j] = temp;
  }

  public static <T> T[] repeat(T[] a, int N) {
    T[] newArr = (T[]) java.lang.reflect.Array.newInstance(a.getClass().getComponentType(), a.length * N);
    int k = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < a.length; j++) {
        newArr[k] = a[j];
        k++;
      }
    }
    return newArr;
  }

  public static <T> String join(T[] a) {
    String ans = "";
    for (int i = 0; i < a.length; i++) {
      ans += String.valueOf(a[i]);
      if (i != a.length - 1) {
        ans += ",";
      }
    }
    return ans;
  }

  public static <T extends Number> double sum(T[] a) {
    double sum = 0.0;
    for (T t : a) {
      sum += t.doubleValue();
    }
    return sum;
  }
}