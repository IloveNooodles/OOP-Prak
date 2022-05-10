public class TimeOfDay {
  private int h;
  private int m;
  private int s;

  public TimeOfDay(int seconds) throws IllegalArgumentException {
    if (seconds < 0 || seconds > 86399)
      throw new IllegalArgumentException("Detik gabisa negatif");

    this.h = seconds / 3600;
    int rem = seconds % 3600;
    this.m = rem / 60;
    s = rem % 60;

    assert this.h * 3600 + this.m * 60 + this.s == seconds;
  }

  @Override
  public String toString() {
    return String.format("%02d:%02d:%02d", this.h, this.m, this.s);
  }

  public static void main(String[] args) {
    try {
      TimeOfDay t = new TimeOfDay(0);
      System.out.println(t);
      t = new TimeOfDay(77777);
      System.out.println(t);
      t = new TimeOfDay(99999);
      System.out.println(t);
    } catch (Exception e) {
      System.out.println("Input tidak valid");
    }

  }
}
