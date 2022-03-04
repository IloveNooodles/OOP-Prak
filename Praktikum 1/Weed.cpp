#include "Weed.hpp"
#include <iostream>

Weed::Weed()
{
  this->many = 1;
}

Weed::Weed(int n)
{
  this->many = n;
}

Weed::Weed(const Weed &newWeed)
{
  this->many = newWeed.many;
}

Weed::~Weed()
{
}

void Weed::step()
{
  for (int i = 0; i < this->many; i++)
  {
    std::cout << "kresek...";
  }
  std::cout << std::endl;
}