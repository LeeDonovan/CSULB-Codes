#include <iostream>
using namespace std;

int main() 
{
    int a = 5, b = 4;
    int *ptr = &a;
    //ptr = ptr + 4;
    //*ptr = *ptr + b;
    cout << &ptr;
    cout <<endl;
    cout<< *ptr;
    cout<<endl<<ptr<<endl;
    cout <<&a<<endl;
    *ptr = 10;
    cout<< "new"<<endl;
    cout << &ptr;
    cout <<endl;
    cout<< *ptr;
    cout<<endl<<ptr<<endl;
    cout <<a<<endl;
    return 0;
}