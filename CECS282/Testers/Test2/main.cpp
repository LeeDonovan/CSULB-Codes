
#include <time.h>
#include <cstdlib.h>
#include <iostream>

int sum(int,int);

int main()
{
    int x = 3;
    int y = 7;
    int z = sum(x,y);
    std::cout<<z;
    return 0;
}

int sum(int a, int b)
{
  return a+b;
}

srand(time())


