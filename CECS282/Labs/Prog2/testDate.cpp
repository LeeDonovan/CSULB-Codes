// testdate.cpp
// Author: Steven H Gold
// CECS 282-05 (Tu/Th)
// Program #2 due date: 2/28/2019
// 
//
//

#include "myDate.h" // X-code users change this to myDate.hpp
#include <iostream>
using namespace std;

int main()
{
	myDate Bday;
	myDate duedate(2,28,2019);

	int x;
	int month, day, year;
	
	Bday.display();
	cout << endl;
	duedate.display();
	cout << endl;
	x = Bday.daysBetween(duedate);
	cout << "Master Gold is "<< x << " days old today";
	cout << endl;

	Bday.increaseDate(x);

	cout << "Now these 2 dates should be the same:";
	Bday.display();
	cout << '\t';
	duedate.display();
	cout << "\n\n";

	Bday.decreaseDate(x); // setting Bday back to original value

	month = duedate.getMonth();
	day = duedate.getDay();
	year = duedate.getYear();

	duedate.display();
	cout << " is also equal to "<<month<<"/"<<day<<"/"<<year<<endl;

	myDate July4(7,4,2019);
	cout << "This year the 4th of July will happen "<< (July4.dayOfYear()-1) << "days after New Years\n\n";

	myDate bogus(23,12,2007);
	cout << "The value of the bogus date is:";
	bogus.display();
	cout << endl;

	myDate D5(8,21,2017);
	x = D5.dayOfYear();
	D5.decreaseDate(x-1);
	cout << "Happy Newyear 2017 happened on:";
	D5.display();
	cout << endl;
	
	cout << "Program is due on "<< duedate.dayName()<<endl;
	cout << "Master Gold was born on "<< Bday.dayName()<<endl;

	myDate today = duedate;
	cout << "\nHere are the dates for the next 2  weeks:\n";
	for (int i=0; i<14; i++)
	{
		today.display();
		cout << ":"<<today.dayName() << endl;
		today.increaseDate(1);
	}

	// find all the leap years since 1300
	int counter = 1;
	int leapSum = 0;
	cout << "\n\nLeap Years from 1300 to 2018\n\n";
	for (int y = 1300; y<=2018; y++)
	{
	
		myDate leapYear = myDate(12,31,y);
		// leapYear.display();
		// cout << ": ";
		//leapYear.dayOfYear();
		// cout << endl;
		if (leapYear.dayOfYear() == 366)
		{
			cout << y<<", ";
			leapSum++;
			if (counter++ % 12 == 0) 
			{
				cout<<endl;
			}
		}
	}
	cout<<"\b\b ";  // get rid of the last comma
	cout << "\n\nHere's the number of the above leapyears:"<<leapSum<<endl;
	cout << "\n\nPress enter to continue";
	getchar();
	return 0;
}
