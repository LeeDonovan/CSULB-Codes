/*Donovan Lee
  CECS 282-05
  Program 0 - Happy Birthday
  January 24, 2019
*/

#include <iostream>
#include <string>
using namespace std;
int main()
{
    string name;
    int age;
    int birthYear;
    char thisYear;
    cout <<"What is your name? ";
    cin >> name;
    cout <<"How old are you? ";
    cin >> age;
    cout << name <<", have you had your birthday yet?? (y/n)";
    cin >> thisYear;

    if (thisYear == 'y' || thisYear == 'Y')
        birthYear = 2019 - age;
    else 
        birthYear = 2019 - age - 1;
    cout << endl;
    cout << "Hi " << name << "!!!\n\nI guess that you were born in " << birthYear << endl;
    cout << "\n\nPress 'Enter' to continue:";

    getchar();// this line will clear out the input buffer - there is a leftover carriage return
    getchar(); // this line will cause the program to pause until you press Enter key

    return 0;

}