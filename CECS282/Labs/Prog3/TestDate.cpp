#include myDate.h


int main()
{
    myDate d;
    myDate d1 = myDate(3, 4, 2016);
    d.display();
    d1.display();
    cout <<d.daysBetween(d1);
    cout << d1.dayName();
    


    return 0;
}