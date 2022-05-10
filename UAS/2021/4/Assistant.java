import java.util.*;

public class Assistant {
  private int salary;
  private List<String> recommendations;

  Assistant(int salary) {
    this.salary = salary;
    this.recommendations = new ArrayList<String>();
  }

  private void addPersonToReccomendations(String name) {
    this.recommendations.add(name);
  }
}
