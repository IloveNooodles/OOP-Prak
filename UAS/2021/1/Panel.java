import java.util.ArrayList;

public class Panel implements Drawable {
  private ArrayList<Component> components;

  public Panel() {
    this.components = new ArrayList<Component>();
  }

  public Panel(ArrayList<Component> components) {
    this.components = components;
  }

  @Override
  public void draw() {
    for (Component c : components) {
      c.draw();
    }
  }
}
