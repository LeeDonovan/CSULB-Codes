#ifndef MYDATE_H
#define MYDATE_H

#include <string>


class myDate
{
    private:
        int m;
        int d;
        int y;

    public:
        myDate();//done
        myDate(int m, int d, int y);//done
        void display();
        void increaseDate(int n);
        void decreaseDate(int n);
        int daysBetween(myDate d);
        int getMonth();//done
        int getDay();//done
        int getYear();//done
        string dayName();

};

#endif 