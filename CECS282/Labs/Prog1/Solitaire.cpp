/*Donovan Lee
  CECS 282-05
  Program 1 - Solitaire Prime
  January 29, 2019
*/

#include "Card.h"
#include "Deck.h"
#include <iostream>
using namespace std;
int main()
{
    bool loop = true;
    int menuNum;
    cout <<"1. New Deck\n";
    cout <<"2. Display Deck\n";
    cout <<"3. Shuffle Deck\n";
    cout <<"4. Play Solitaire Prime\n";
    cout <<"5. Exit\n";
    cin >> menuNum;
    Card c1; 
    c1.setCard('A','H');
    Card c3('2','S');
    c1.showCard();
    c3.showCard();

    return 0;
}