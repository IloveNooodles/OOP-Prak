public class Component implements Drawable {
  private Picture name;
  private Text text;

  public Component(Picture name, Text test) {
    this.name = name;
    this.text = test;
  }

  @Override
  public void draw() {
    this.name.draw();
    this.text.draw();
  }
}
