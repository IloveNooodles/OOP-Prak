#include "Bottle.hpp"

int Bottle::numOfBottle = 0;

Bottle::Bottle() : id(numOfBottle + 1)
{
  this->height = 10;
  this->radius = 10;
  this->waterHeight = 0;
  numOfBottle++;
}

Bottle::Bottle(float height, float radius) : id(numOfBottle + 1)
{
  this->height = height;
  this->radius = radius;
  this->waterHeight = 0;
  numOfBottle++;
}

Bottle::Bottle(const Bottle &bottle) : id(bottle.getId())
{
  this->height = bottle.height;
  this->radius = bottle.radius;
  this->waterHeight = bottle.waterHeight;
  numOfBottle++;
}

Bottle::~Bottle()
{
}

int Bottle::getId() const
{
  return this->id;
}

float Bottle::getWaterVolume() const
{
  return (PI * this->radius * this->radius * this->waterHeight);
}

float Bottle::getBottleVolume() const
{
  return (PI * this->radius * this->radius * this->height);
}

void Bottle::setHeight(float height)
{
  this->height = height;
  if (this->waterHeight > this->height)
  {
    this->waterHeight = this->height;
  }
}

void Bottle::addWater(float waterVolume)
{
  float newHeight = getWaterHeightIfVolume(waterVolume);
  this->waterHeight += newHeight;
  if (this->waterHeight > this->height)
  {
    this->waterHeight = this->height;
  }
}

void Bottle::substractWater(float waterVolume)
{
  float newHeight = getWaterHeightIfVolume(waterVolume);
  this->waterHeight -= newHeight;
  if (this->waterHeight < 0)
  {
    this->waterHeight = 0;
  }
}

float Bottle::getWaterHeightIfVolume(float waterVolume) const
{
  return waterVolume / (PI * this->radius * this->radius);
}

void Bottle::pourWaterTo(Bottle &other)
{
  float newVolume = other.getBottleVolume() - other.getWaterVolume();
  float volume = getWaterVolume();
  float subs = volume;
  if (newVolume < volume)
  {
    subs = newVolume;
  }
  substractWater(subs);
  other.addWater(subs);
}