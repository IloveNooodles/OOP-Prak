#include "Pickaxe.hpp"
#include "ReinforcedAxe.hpp"
#include <iostream>

int main()
{
  Pickaxe *Pickaxe1 = new Pickaxe();
  Pickaxe1->use();
  Pickaxe1->enchant();
  Pickaxe *Pickaxe2 = new Pickaxe(*Pickaxe1);
  Pickaxe *Pickaxe3 = new Pickaxe();
  *Pickaxe3 = *Pickaxe3;
  ReinforcedAxe *ReinforcedAxe1 = new ReinforcedAxe();
  ReinforcedAxe1->use();
  ReinforcedAxe *ReinforcedAxe2 = new ReinforcedAxe(*ReinforcedAxe1);
  ReinforcedAxe2->enchant();
  ReinforcedAxe *ReinforcedAxe3 = new ReinforcedAxe(*ReinforcedAxe2 + *ReinforcedAxe2);
  ReinforcedAxe3->repair();
  delete ReinforcedAxe1;
  delete ReinforcedAxe2;
  delete ReinforcedAxe3;
  delete Pickaxe1;
  delete Pickaxe2;
}