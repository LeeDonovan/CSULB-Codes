#include <iostream>
using namespace std;
int count();

int count()
{
    static int counter = 0;
    counter++;
    return counter;
}

int main()
{
    for (int i = 0; i<10;i++)
    {
        cout<<count()<<" ";
    }
    return 0;
}