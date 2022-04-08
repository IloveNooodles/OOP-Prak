class Crewmate {
  public String name;
  public boolean isDead;
  private int stabCount;
  static int id;

  public Crewmate() {
    id++;
    this.name = "Crewmate " + id;
  }

  public Crewmate(String name) {
    id++;
    this.name = name;
  }

  public void stab(Crewmate victim) {
    if (this.isDead) {
      System.out.print(this.name + " is dead\n");
    } else {
      victim.isDead = true;
      this.stabCount++;
      System.out.print(this.name + " stabs " + victim.name + "\n");
    }
  }

  @Override
  public String toString() {
    if (this.isDead) {
      return this.name + " is dead";
    } else if (!this.isDead && this.stabCount > 0) {
      return this.name + " is sus";
    } else {
      return this.name + " is cool";
    }
  }

  public static void main(String[] args) {
    Crewmate a = new Crewmate();
    Crewmate b = new Crewmate();
    Crewmate c = new Crewmate("Charlie");
    c.stab(a);
    System.out.println(a.toString());
    System.out.println(b.toString());
    System.out.println(c.toString());
    a.stab(b);
  }

};