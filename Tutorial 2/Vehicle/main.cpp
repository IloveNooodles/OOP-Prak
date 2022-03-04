#include "Bike.h"
#include "Car.h"
#include "Vehicle.h"
#include  <iostream>

int main(){
  Car *car4 = new Car(4);
  Car *car10 = new Car(10);
  Bike *bike = new Bike();

  Vehicle *vehicle_bike = new Vehicle(*bike);
  delete bike;

  car10->drive();
  car10->Vehicle::drive();
  vehicle_bike->clean();
  car4->drive();
  vehicle_bike->park();
  
  delete car10;
  delete vehicle_bike;
  delete car4;
}