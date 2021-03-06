#ifndef VEHICLE_H
#define VEHICLE_H

class Vehicle
{
public:
  // Constructor, copy constructor, destructor, dan operasi assignment
  Vehicle();
  Vehicle(int wheels, int capacity);
  Vehicle(const Vehicle &);
  virtual ~Vehicle();
  Vehicle &operator=(const Vehicle &);

  void drive();
  void clean();
  virtual void park();

protected:
  int wheels;   // jumlah roda
  int capacity; // kapasitas penumpang
};

#endif
