/*  Donovan Lee
    CECS 282 - 05
    Program 2 - My Date
    Feburary 28, 2019
*/

#include "myDate.h"

int main()
{
    myDate d;
    myDate d1 = myDate(3, 4, 2016);
    // d.increaseDate(1);
    // d.decreaseDate(3);
    d.display();
    d1.display();
    cout <<d.daysBetween(d1);
    cout << d1.dayName();


    return 0;
}

