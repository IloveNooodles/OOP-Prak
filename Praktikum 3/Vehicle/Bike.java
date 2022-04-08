public class Bike extends NonMotorizedVehicle implements Rideable {

  public Bike() {
    this.name = "Bike";
  }

  public Bike(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public void ride() {
    System.out.println("Riding a " + this.getName());
  }
}
