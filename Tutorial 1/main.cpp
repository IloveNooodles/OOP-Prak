#include "Box.hpp"

int main()
{
  {
    Box box1;
    Box box2(2);
    Box box3(box2);
    Box box4;
    box4 = box1;
    // box3 = box2;
    // box3.peek();
  }
  // Box box1 = Box();
  // Box box2 = Box(2);
  // Box box3;
  // box3 = box2;
  // Box box4 = Box(box2);

}