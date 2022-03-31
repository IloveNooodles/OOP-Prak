import java.io.*;

public class FightingPokemon extends Pokemon implements ElementalType<Integer> {

  // Buat kelas FightingPokemon yang merupakan turunan dari kelas Pokemon dan
  // mengimplementasi interface ElementalType<Integer>

  // Atribut tolong dilihat sendiri pada diagram kelas
  private int id;
  private String elementName;

  // Buat constructor tanpa parameter, meng-assign "Fighting" ke atribut
  // elementalName dan mencetak "ctor1 FightingPokemon" ke layar
  public FightingPokemon() {
    super();
    this.elementName = "Fighting";
    System.out.println("ctor1 FightingPokemon");
  }

  // Buat constructor dengan parameter String name, meng-assign "Fighting" ke
  // atribut elementalName dan mencetak "ctor2 FightingPokemon" ke layar
  public FightingPokemon(String name) {
    super(name);
    this.elementName = "Fighting";
    System.out.println("ctor2 FightingPokemon");
  }
  // Buat prosedur checkElement yang mencetak "[name] have [elementName] type" ke
  // layar

  public void checkElement() {
    System.out.printf("%s have %s type\n", super.getName(), this.elementName);
  }

  // Override prosedur displayClass yang mencetak "Sub Class FightingPokemon"
  @Override
  public void displayClass() {
    System.out.println("Sub Class FightingPokemon");
  }

  // Realisasi prosedur displayAura, mencetak "There is fighting spirit around"
  public void displayAura() {
    System.out.println("There is fighting spirit around");
  }

  // Realisasi prosedur specialSkill, mencetak "Special skill berserk"
  public void specialSkill() {
    System.out.println("Special skill berserk");
  }

  public Integer getUniqueID() {
    return this.id;
  }

  public void setUniqueID(Integer id) {
    this.id = id;
  }
  // Realisasi setUniqueID dan getUniqueID
}
