#include <iostream>
using namespace std;
int crazy(int, int*, int&, int, int*);

int main()
{
    int a = 2;
    int b = 4;
    int c = 6;
    int d = 8;
    int e = 10;
    int *ptr = &e;
    int f = crazy(a, &b, c, d, ptr);
    cout << "a: "<<a<<endl;
    cout << "b: "<<b<<endl;
    cout << "c: "<<c<<endl;
    cout << "d: "<<d<<endl;
    cout << "e: "<<e<<endl;
    cout << "f: "<<f<<endl;
    system("pause");
    return 0;
}

int crazy(int x1, int* x2, int &x3, int x4, int* x5)
{
    x1 = 10;
    x2 = &x1;
    x3 = 30;
    x4 = *x5 + 10;
    *x5 = x1;
    return x1 + *x2 + x3 + x4 + *x5;
}