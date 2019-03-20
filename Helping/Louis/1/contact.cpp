#include "contact.h"

contact::contact()
{
    fn = "Louis";
    ln = "Monifero";
    pn = "1112223333";
    addr = "1234 HEHEXD";
    city = "Dank Tea";
    zip = "42069";
    state = "CA";
}
contact::contact(string f, string l, string p, string ad, string cit, string z, string st)
{
    fn = f;
    ln = l;
    pn = p;
    addr = ad;
    city = cit;
    zip = z;
    state = st;

}

void contact::display()
{
    cout<< fn<<" "<<ln<<": "<<pn<<"\n"<<addr + " " + city +", "+state + " " + zip;
}

