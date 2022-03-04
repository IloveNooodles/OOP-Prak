#include "WarungNasgor.hpp"
#include <iostream>

using namespace std;

WarungNasgor::WarungNasgor(int uang, int telur, int nasi, int kecap) : WarungNasi::WarungNasi(uang, telur, nasi){
  this->kecap = kecap;
}

bool WarungNasgor::masak(int pesanan){
  if(WarungNasi::getNasi() < pesanan && WarungNasi::getTelur() < pesanan && this->kecap < pesanan){
    return false;
  }
  else{
    WarungNasi::setNasi(WarungNasi::getNasi() - pesanan);
    WarungNasi::setTelur(WarungNasi::getTelur() - pesanan);
    this->kecap = this->kecap - pesanan;
    int pendapatan = pesanan * 15000;
    WarungNasi::setUang(WarungNasi::getUang() + pendapatan);
    return true;
  }
}



