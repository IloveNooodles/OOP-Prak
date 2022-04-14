import java.util.ArrayList;
import java.util.List;

public class SummonedCharacter implements ISummoned {
  private Character c;
  private int level;
  private int exp;
  private List<Spell> activeSpell;

  public SummonedCharacter(Character c, int level, int exp) {
    this.c = c;
    this.level = level;
    this.exp = exp;
    this.activeSpell = new ArrayList<Spell>();
  }

  public int getLevel() {
    return this.level;
  }

  public int getExp() {
    return this.exp;
  }

  // menambahkan spell ke dalam daftar spell aktif
  public void addSpell(Spell s) {
    this.activeSpell.add(s);
  }

  // mengembalikan daftar spell aktif
  public List<Spell> getActiveSpells() {
    return this.activeSpell;
  }

  // meningkatkan level karakter sebanyak 1
  // mereset xp ke 0
  // meningkatkan baseAtk dan baseHp sebanyak attackUp dan healthUp
  public void levelUp() {
    this.level++;
    this.exp = 0;
    this.c = new Character(this.c.getName(), this.c.getAttackUpValue() + this.c.getAttackValue(),
        this.c.getHealthUpValue() + this.c.getHpValue(), this.c.getAttackUpValue(), this.c.getHealthUpValue());
  }

  // menggambar kartu ke layar
  public void render() {
    System.out.println("Nama: " + this.c.getName());
    System.out.println("Level: " + this.level);
    System.out.println("Exp: " + this.exp);
    System.out.println("Atk: " + this.c.getAttackValue());
    System.out.println("Hp: " + this.c.getHpValue());
    System.out.println("Memiliki " + this.activeSpell.size() + " spell aktif:");
    for (Spell s : this.activeSpell) {
      System.out.println(s);
    }
    System.out.println();
  }
}
