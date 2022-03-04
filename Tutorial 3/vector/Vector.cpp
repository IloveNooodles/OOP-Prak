#include "Vector.hpp"
#include <iostream>

int main()
{
  Vector<int, 4> v1, v2;
  cout << "Masukan vektor 4 element" << endl;
  cin >> v1;
  v2[0] = 1;
  v2[1] = 2;
  v2[2] = 3;
  v2[3] = 4;
  cout << v1 << " + " << v2 << " = " << v1 + v2 << endl;
}