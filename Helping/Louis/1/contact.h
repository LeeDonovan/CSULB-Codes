#ifndef CONTACT_H
#define CONTACT_H

#include <string>
#include <iostream>

using namespace std;

class contact
{
    private:
        string fn;
        string ln;
        string pn;
        string addr;
        string city;
        string zip;
        string state;
    
    public:
        contact();
        contact(string f, string l, string p, string ad, string cit, string z, string st);
        void display();
        
};

#endif

