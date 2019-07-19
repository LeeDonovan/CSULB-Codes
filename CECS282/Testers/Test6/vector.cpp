#include <iostream>
using namespace std;

int main()
{
    int a = 3,b=6,c=9,d=10;
    int *ptr1 = &a, *ptr2=&b,*ptr3=&c,*ptr4=&d;

    ptr4 = ptr2;
    cout<<*ptr4<<endl;
    *ptr3 = *ptr2 + 2;
    cout<<*ptr3<<endl;
    *ptr3 = *ptr1 + *ptr4;
    cout<<*ptr3<<endl;
    ptr1 = ptr3;
    cout<<*ptr1<<endl;
    ptr3 = ptr2;
    cout<<*ptr3<<endl;
    ptr3 = ptr1;
    cout<<*ptr3<<endl;
    *ptr4 = 12;
    cout<<*ptr4<<endl;
    *ptr2 = *ptr1 + *ptr4;
    cout<<*ptr2;
    return 0;
}