import java.util.*;

public class Window extends Panel implements Drawable {
  protected ArrayList<Panel> panels;

  public Window(ArrayList<Panel> panels) {
    this.panels = panels;
  }

  @Override
  public void draw() {
    for (Panel p : this.panels) {
      p.draw();
    }
  }
}
