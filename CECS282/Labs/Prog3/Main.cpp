/*  Donovan Lee
    CECS 282 - 05
    Program 3 - Structs and Pointers
    March 14, 2019
*/


#include "myDate.h"
#include <string>
#include <iostream>
#include <iomanip>
#include <ctime>
#include <cstdlib>
#include <sstream>
#include <cstdio>
#include <stdio.h>
#include <string.h>

using namespace std;
struct Student
{
    char name[40];
    int ID;
    char grade;
    myDate birthday;
    string hometown;
};

int G2J(int, int, int);

void J2G(int, int &, int &, int &);

void populate(Student *sar[])
{
    srand(time(NULL));
    int IDNum[10];
    for (int sid = 0; sid < 10; sid++)
        {
            IDNum[sid] = rand() % 99999 + 10000;
        } 
    int newBday;
    myDate Bdays[10];
    myDate minD(1,1,1996);
    myDate maxD(12,31,2003);
    for(int b = 0; b< 10 ; b++)
    {
        newBday = rand()% minD.daysBetween(maxD) + G2J(minD.getYear(),minD.getMonth(),minD.getDay());
        Bdays[b].formatDate(newBday);
    }
    char grade[] = {'A','B','C','D','F','B','A','C','F','A','D','A'};

    string firName[] = {"Harry ", "Morty ",  "Lenard ", "King ","Astro ","Barry ",
                            "Leo ","Vanessa ","Carol ", "Cammy "};

    string lName[] = {"Potter", "Rick", "Snart", "James", "Shakira",
                        "Allan", "Ksary", "Ramone", "Danvers", "Lan"};

    string homes[] = {"Bikini Bottom", "Chicago", "Compton", "Central City", "Metropolis", "Gotham",
                        "Havana", "Los Angeles", "Star City","Riverdale"};
    for(int i = 0; i <10 ; i++)
    {
        
        sar[i] = new Student;
        sar[i]->grade = grade[i];
        strcpy(sar[i]->name, (firName[i]+lName[i]).c_str());
        sar[i]->ID = IDNum[i];
        sar[i]->hometown = homes[i];
        sar[i]-> birthday = Bdays[i];
    }
        
  
}

//////////////////////////////////////////////////Display Below///////////////////////////////////////////////////////////////////////

void display(Student *sar[])
{
    cout <<setw(20)<<left<<"Name"<<setw(10)<<left<<"ID"<<setw(10)<<left<<"Grade"<<setw(10)<<left<<"Birthday\t\t      "<<left<<"Hometown"<<setw(20)<<endl;

    for(int i = 0; i < 10; i++)
    {
        string tempd = (sar[i]->birthday).fixedDate();
        string temph = (sar[i]->hometown);
        cout <<setw(20)<<left<<sar[i]->name<< setw(10)<< left<< sar[i]->ID<<setw(10)<<sar[i]->grade<<setw(10);
        cout <<(sar[i]->birthday).fixedDate()<<right<<setw(30 - tempd.length() +temph.length()) <<sar[i]->hometown<<endl;

        
    }
    
}
/////////////////////////////////////Sorting Below///////////////////////////////////sar[i]->hometown/////////////////////////////////////


void sortBday(Student *sar[])
{
    for(int i = 0; i<10- 1;i++)
    {
        for(int j = 0; j < 10 - i- 1;j++)
        {
            myDate tempd = ((*sar[j]).birthday);
            myDate tempd1 = ((*sar[j+1]).birthday);
            int temp = G2J(tempd.getYear(),tempd.getMonth(),tempd.getDay());
            int temp1 = G2J(tempd1.getYear(),tempd1.getMonth(),tempd1.getDay());
            if(temp> temp1)
                {
                    swap(sar[j],sar[j+1]);
                }
        }
    }
    display(sar);
}


void sortGrade(Student *sar[])//works
{
    for(int i = 0; i<10 -1;i++)
    {
        for (int j = 0; j < 10-i-1;j++)
        {
            if((*sar[j]).grade > (*sar[j+1]).grade)
            {
                swap(sar[j],sar[j+1]);
            }
        }
    }
    display(sar);
}

void sortHT(Student *sar[])//works
{ 
	for ( int i = 0; i < 10 -1 ; ++i )
	{	
	    for ( int j = 0; j < 10 - i - 1; ++j )
		{		               
			if((*sar[j]).hometown > (*sar[j+1]).hometown)
            {
                swap(sar[j],sar[j+1]);
            }	 	
		}
    }
    display(sar);
}



void orderID(Student *sar[])//works
{
    int temp;
    for(int i=0;i<10;i++)
	{		
		for(int j=i+1;j<10;j++)
		{
			if((sar[i]->ID)>(sar[j]->ID))
			{
				temp  = sar[i]->ID;
				sar[i]->ID = sar[j]->ID;
				sar[j]->ID = temp;
                swap ( sar[j]->name , sar[i]->name );
                swap ( sar[j]->grade , sar[i]->grade );
                swap ( sar[j]->hometown , sar[i]->hometown );		
                swap ( sar[j]->birthday , sar[i]->birthday );	
			}
		}
	}
    display(sar);
}

void sortName(Student *sar[]) //works
{ 
   int size = 10;   
	for ( int i = 0; i < size -1 ; ++i )
	{	
	    for ( int j = 0; j < size - i - 1; ++j )
		{		               
			string temp = (*sar[j]).name;
            string temp1 = (*sar[j+1]).name;	              
			if (temp > temp1)		
            {   
				swap ( sar[j]->name , sar[j+1]->name );
                swap ( sar[j]->grade , sar[j+1]->grade );		
                swap ( sar[j]->ID , sar[j+1]->ID );		
                swap ( sar[j]->hometown , sar[j+1]->hometown );		
                swap ( sar[j]->birthday , sar[j+1]->birthday );				
			}		 	
		}
    }
    display(sar);
}


//////////////////////////////////////Main Below///////////////////////////////////////////////////////////////////////////////////////
int main()
{
    bool loop = true;
    int menuNum;
    Student *OG[10];
    Student *Other[10];
    populate(OG);
    for(int i = 0; i< 10;i++)
    {
        Other[i] = new Student;
        Other[i]->ID = (*OG[i]).ID;
        strcpy(Other[i]->name, ((*OG[i]).name));
        Other[i]->birthday = (*OG[i]).birthday;
        Other[i]->grade = (*OG[i]).grade;
        Other[i]->hometown = (*OG[i]).hometown;
    }

    while(loop)
    {
        cout<<endl;
        cout << "1) Display Orginal List"<<endl;
        cout << "2) Display list sorted by Name"<<endl;
        cout << "3) Display list sorted by Student ID"<<endl;
        cout << "4) Display list sorted by Grade"<<endl;
        cout << "5) Display list sorted by Birthday"<<endl;
        cout << "6) Display list sorted by Hometown"<<endl;
        cout << "7) Exit"<<endl;
        cout <<"Choose a Menu: ";
        cin >> menuNum;

        if(menuNum == 1)
        {
            display(OG);
        }
        if(menuNum == 2)
        {
            sortName(Other);
        }
        if(menuNum == 3)
        {
            orderID(Other);
            
        }
        if(menuNum == 4)
        {
            sortGrade(Other);
        }
        if(menuNum == 5)
        {
            sortBday(Other);
        }
        if(menuNum == 6)
        {
            sortHT(Other);
        }
        if(menuNum == 7)
        {
            cout << "GoodBye..."<<endl;
            loop = false;
        }
    }
   
    return 0;
}







