import java.lang.reflect.*;

public class AssistantDecoder extends Assistant {
  private Assistant a;

  public AssistantDecoder(Assistant a) {
    super(1000);
    this.a = a;
  }

  public void addPersonToReccomendations(String name) throws Exception {
    Method addPerson = this.a.getClass().getDeclaredMethod("addPersonToReccomendations", String.class);
    addPerson.setAccessible(true);
    addPerson.invoke(this.a, "test");
  }

  public int getSalary() throws Exception {
    Field f = this.a.getClass().getDeclaredField("salary");
    f.setAccessible(true);
    return (int) f.get(this.a);
  }
}
