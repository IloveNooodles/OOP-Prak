public class Text implements Drawable {
  private String caption;

  public Text(String caption) {
    this.caption = caption;
  }

  @Override
  public void draw() {
    System.out.println("menggambar teks: " + this.caption);
  }
}
