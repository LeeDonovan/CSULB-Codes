/*Donovan Lee
  CECS 282-05
  Program 1 - Solitaire Prime
  January 29, 2019
*/

#include "Card.h"
#ifdef "Card.h"
#include <iostream>
using namespace std;
int main()
{
    int menuNum;
    cout <<"1. New Deck";
    cout <<"2. Display Deck";
    cout <<"3. Shuffle Deck";
    cout <<"4. Play Solitaire Prime";
    cout <<"5. Exit";
    cin >> menuNum;

    Card c1; 
    c1.showCard();
    return 0;
}