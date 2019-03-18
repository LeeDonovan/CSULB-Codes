#ifndef MYDATE_H
#define MYDATE_H

#include <string>
#include <iostream>
#include <iomanip>

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
        void increaseByOne();//done
        void decreaseByOne();//done
        int dayOfYear();//done
        void formatDate(int x);
        string fixedDate();


};

#endif 

