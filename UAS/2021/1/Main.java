import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // membuat Component
    Picture p = new Picture("GITHUB");
    Text t = new Text("DOR");
    Component co = new Component(p, t);
    ArrayList<Component> cList = new ArrayList<Component>();
    cList.add(co);
    // membuat panel
    Panel panel1 = new Panel(cList);
    Panel panel2 = new Panel(cList);
    Panel panel3 = new Panel(cList);
    ArrayList<Panel> pList = new ArrayList<Panel>();
    pList.add(panel1);
    pList.add(panel2);
    pList.add(panel3);
    System.out.println(pList.toString());

    // membuat window
    Application app = new Application(new Window(pList));
    app.run();
  }
}
