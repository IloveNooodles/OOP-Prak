public class Car extends MotorizedVehicle implements Rideable, NeedFuel {

  public Car() {
    this.name = "Car";
    this.fuel = 5;
  }

  public Car(String name, int fuel) {
    this.fuel = fuel;
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public int getFuel() {
    return this.fuel;
  }

  @Override
  public void ride() {
    int fuel = this.getFuel();
    if (fuel > 0) {
      fuel--;
      this.fuel = fuel;
      System.out.println("Riding a " + this.getName() + ", fuel remaining: " + this.getFuel());
    } else {
      System.out.println("No fuel, cannot ride");
    }
  }

  @Override
  public void fillFuel(int amount) {
    this.fuel = this.getFuel() + amount;
    System.out.println("Filled " + amount + " units of fuel, fuel now: " + this.getFuel());
  }
}
