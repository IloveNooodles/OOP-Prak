#include "Triplet.hpp"
#include <iostream>
using namespace std;

int main()
{

  Triplet<string, float, string> a("abc", 4.5, "def");
  Triplet<string, float, string> b("ghi", -1.0, "def");
  Triplet<string, float, string> c("abc", 4.5, "def");

  if (a == b)
  {
    cout << "a == b" << endl;
  }
  if (a == c)
  {
    cout << "a == c" << endl;
  }
  return 0;
}