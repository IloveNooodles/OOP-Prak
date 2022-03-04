#include "WarungSaltedEgg.hpp"
#include <iostream>

using namespace std;

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam) : WarungNasi::WarungNasi(uang, nasi, telur){
  this->telurAsin = telurAsin;
  this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan){
  if (WarungNasi::getNasi() < pesanan && WarungNasi::getTelur() < pesanan && this->ayam < pesanan && this->telurAsin < 3 * pesanan)
  {
    return false;
  }
  else
  {
    WarungNasi::setNasi(WarungNasi::getNasi() - pesanan);
    WarungNasi::setTelur(WarungNasi::getTelur() - pesanan);
    this->ayam = this->ayam - pesanan;
    this->telurAsin = this->telurAsin - 3 * pesanan;
    int pendapatan = pesanan * 30000;
    WarungNasi::setUang(WarungNasi::getUang() + pendapatan);
    return true;
  }
}