#include "Skeleton.hpp"
#include <iostream>
using namespace std;

Skeleton::Skeleton(int _stamina, int _arrow) : Undead(_stamina)
{
  this->arrow = _arrow;
}

void Skeleton::attack(Player &player)
{
  if (this->stamina)
  {
    if (this->stamina >= 2 && this->arrow)
    {
      this->arrow--;
      this->stamina -= 2;
      player.setHealth(max(player.getHealth() - 4, 0));
    }

    else
    {
      Undead::attack(player);
      cout << "switching to your fists is faster than reloading" << endl;
    }
  }
}