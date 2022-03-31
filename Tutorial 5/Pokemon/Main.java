public class Main {
  public static void main(String[] args) {
    System.out.println("--- Section 1 ---");
    GhostPokemon g1 = new GhostPokemon();
    FightingPokemon f1 = new FightingPokemon();
    NormalPokemon n1 = new NormalPokemon();
    Pokemon p1 = new Pokemon();
    System.out.println(g1.getName());
    System.out.println(f1.getName());
    System.out.println(n1.getName());
    System.out.println(p1.getName());
    GhostPokemon g2 = new GhostPokemon("Gastly");
    FightingPokemon f2 = new FightingPokemon("Machop");
    NormalPokemon n2 = new NormalPokemon("Rattata");
    Pokemon p2 = new Pokemon("Big Boss");
    System.out.println(g2.getName());
    System.out.println(f2.getName());
    System.out.println(n2.getName());
    System.out.println(p2.getName());
    g2.displayClass();
    f2.displayClass();
    n2.displayClass();
    p2.displayClass();
    g1.setUniqueID("G1");
    f1.setUniqueID(12);
    System.out.println(g1.getUniqueID());
    System.out.println(f1.getUniqueID());
    System.out.println("--- Section 2 ---");
    g2.checkElement();
    f2.checkElement();
    n2.checkElement();
    g2.specialSkill();
    f2.displayAura();
    g2.displayAura();
    f2.specialSkill();
    System.out.println("--- Section 3 ---");
    PokemonAction pa1 = new PokemonAction(g2);
    PokemonAction pa2 = new PokemonAction(n2);
    pa1.displayPokemonClass();
    pa2.displayPokemonClass();
    System.out.printf("%s vs %s\n", g2.getName(), n2.getName());
    for (int i = 0; i < 7; i++) {
      pa1.attack();
      pa2.defense();
    }

    for (int i = 0; i < 3; i++) {
      pa2.attack();
      pa1.defense();
    }

    pa2.useSkill();
    pa1.useSkill();
    pa2.run();

    System.out.println("--- Section 4 ---");
    System.out.println("New Battle Found");
    pa1 = new PokemonAction(p2);
    pa2 = new PokemonAction(f2);
    pa2.displayPokemonClass();
    pa1.displayPokemonClass();
    System.out.printf("%s vs %s\n", p2.getName(), f2.getName());
    for (int i = 0; i < 4; i++) {
      pa2.attack();
      pa1.defense();
    }
    for (int i = 0; i < 8; i++) {
      pa1.attack();
      pa2.defense();
    }

    pa2.useSkill();
    pa1.useSkill();
    pa2.run();
    System.out.println("All Battle Finished");
  }
}
