#ifndef MYDATE_H
#define MYDATE_H

#include <string>
#include <iostream>

using namespace std;


class myDate
{
    private:
        int m;
        int d;
        int y;

    public:
        myDate();//done
        myDate(int m, int d, int y);//done
        void display();//done
        void increaseDate(int n);//done
        void decreaseDate(int n);//done
        int daysBetween(myDate d);//done
        int getMonth();//done
        int getDay();//done
        int getYear();//done
        string dayName();//done
        int dayOfYear();//done
        string formatDate();

};

#endif 

