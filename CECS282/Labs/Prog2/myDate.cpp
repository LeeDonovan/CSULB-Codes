#include "myDate.h"
#include <string>
#include <iostream>

int G2J(int month, int day, int year);



void J2G(int JD, int & month, int & day, int & year);


string myDate::dayName()
{
    string name{} = 
    
    //convert to Julian
    //do a mod 7
}


myDate::myDate()
{
    m = 5;//May
    d = 11;//11th
    y = 1959;//the year 
}

myDate::myDate(int m, int d, int y)
{
    month = m;
    day = d;
    year = y;
}

void myDate::display()
{
    cout << 
}

int myDate::getDay()
{
    return d;
}

int myDate::getMonth()
{
    return m;
}

int myDate::getYear()
{
    return y;
}

