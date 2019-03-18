#include "myDate.h"

int G2J(int, int, int);

void J2G(int, int &, int &, int &);

int G2J(int year, int month, int day)
{
    int i, j, k, jd;
    i = year;
    j = month;
    k = day;

    jd = k - 32075+1461*(i+4800+(j-14)/12)/4+367*(j-2-(j-14)/12*12)/12-3*((i+4900+(j-14)/12)/100)/4;

    return jd;
}

void J2G(int jd, int & month, int & day, int & year)
{
    int l, n ,i, j, k;
    l = jd + 68569;
    n = 4*l/146097;
    l = l - (146097*n+3)/4;
    i = 4000*(l+1)/1461001;
    l = l - 1461*i/4+31;
    j = 80*l/2447;
    k = l - 2447*j/80;
    l = j/11;
    j = j+2-12*l;
    i = 100*(n-49)+i+l;

    year = i;
    month = j;
    day = k;
    

}


void myDate::increaseDate(int n)
{
    if (n < 0)
    {
        n = n * (-1);
    }
    J2G(G2J(y,m,d) + n, m , d, y) ;

}



void myDate::decreaseDate(int n)
{
    if (n < 0)
    {
        n = n * (-1);
    }
    J2G(G2J(y,m,d) - n, m , d, y) ;
    
}




string myDate::dayName()
{
    string name[7] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    int jd = G2J(y, m, d);
    int temp = jd %7;
    
    return name[temp];
    
    //convert to Julian
    //do a mod 7
}


myDate::myDate()
{

    m = 5;//May
    d = 11;//11th
    y = 1959;//the year 
}

myDate::myDate(int month, int day, int year)//contructs new date
{
    m = month;
    d = day;
    y = year;
}

void myDate::display()
{
    string month[12] = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    if (m > 0 && m <= 12)
    {
        if (m == 2 || m == 4 || m== 6 || m == 9 || m == 11 )
        {
            if ( m == 2 && y % 4 == 0 && d == 29)
            {
                cout << month[m-1] << "" << d << ", " << y;
            }
            else if (d <=30)
            {
                cout << month[m-1] << "" << d << ", " << y;
            }
            else
            {
                m = 5;//May
                d = 11;//11th
                y = 1959;
                cout << month[m-1] << "" << d << ", " << y;
            }
        }
        else
        {
            if (d <= 31 && d > 0)
            {
                cout << month[m-1] << "" << d << ", " << y;
            }
            else
            {
                m = 5;//May
                d = 11;//11th
                y = 1959;
                cout << month[m-1] << " " << d << ", " << y;
            }
            
        }
    }
    else
    {
        m = 5;//May
        d = 11;//11th
        y = 1959;
        cout << month[m-1] << " " << d << ", " << y;
    }
    

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

int myDate::daysBetween(myDate x)
{
    int dd = x.getDay();
    int mm = x.getMonth();
    int yy = x.getYear();
    int q = G2J(yy,mm, dd);
    int p = G2J(y, m, d);
    return (q- p);


}

int  myDate::dayOfYear()
{
    myDate temp(1,1,y);
    int og = G2J(y, m, d);
    int def = G2J(temp.getYear(), temp.getMonth(), temp.getDay());
    return (og - def)+1;
}

void myDate::formatDate(int x)
{
    J2G(x, m,d,y);
    
}

string myDate::fixedDate()
{
    string month[12] = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    string monthr = month[this->getMonth()-1] +" " +to_string(this->getDay()) + ", " + to_string(this->getYear());
    return monthr;
}
