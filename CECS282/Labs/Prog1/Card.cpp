#include Card.h
#include <iostream>
using namespace std;

void Card::Card()
{
    rank = 'Z';
    suit = 'Z';
    faceUp = false;
}

int Card::value()
{
    if (rank == 'A')return 1;
    if (rank == '2')return 2;
    if (rank == '3')return 3;
    if (rank == '4')return 4;
    if (rank == '5')return 5;
    if (rank == '6')return 6;
    if (rank == '7')return 7;
    if (rank == '8')return 8;
    if (rank == '9')return 9;
    if (rank == '10')return 10;
    if (rank == 'J')return 11;
    if (rank == 'Q')return 12;
    if (rank == 'K')return 13;

}

void Card::showCard()
{
    cout << "Rank: " <<rank;
}

