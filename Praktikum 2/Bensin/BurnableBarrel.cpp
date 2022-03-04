#include "BurnableBarrel.hpp"
#include <iostream>
using namespace std;

BurnableBarrel::BurnableBarrel() : Damageable(), Burnable()
{
}

BurnableBarrel::BurnableBarrel(int maxHealth) : Damageable(maxHealth), Burnable()
{
}

void BurnableBarrel::takeDamage(int damage, string element)
{
  if (!this->isDestroyed())
  {

    if (element == "fire")
    {
      this->burn();
    }
    else if (element == "water")
    {
      this->watered();
    }
    int multiplier = 1;
    if (this->isBurned())
    {
      multiplier *= this->multiplier;
    }
    Damageable::takeDamage(damage * multiplier);
  }
}
