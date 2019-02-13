/*Donovan Lee
  CECS 282-05
  Program 1 - Solitaire Prime
  Feburary 12, 2019
*/

#include "Card.h"
#include "Deck.h"
#include <iostream>
using namespace std;

bool isPrime(int x); 


int getInt();

bool isPrime(int x)
{
  if (x == 0)
  {
    return false;
  }
  for (int i = 2; i <= x/2; i++)
  {
    if (x%i == 0)
    {
      return false;
    }
  }
  return true;
}


int main()
{
    int prime = 0;
    bool loop = true;
    Deck d1;
    int menuNum;
    Card hand[52];
    while(loop)
    {
      cout <<"\n1. New Deck\n";
      cout <<"2. Display Deck\n";
      cout <<"3. Shuffle Deck\n";
      cout <<"4. Play Solitaire Prime\n";
      cout <<"5. Exit\n";
      menuNum = getInt();
      if (menuNum == 1) 
      {
        cout << "New deck has been created." << endl;
        d1 = Deck();
      }

      if (menuNum == 2)
      {
        d1.showDeck();
      }
      if (menuNum == 3)
      {
        cout << "Shuffling Deck In Progress..."<< endl;
        d1.shuffle();
      }
      if (menuNum == 4)
      {
        int index = 0;
        int pile = 0;
        while (d1.cardsLeft() > 0)
        {
          if (!isPrime(prime))
          {
            hand[index] = d1.deal();
            prime = prime + hand[index].getValue();
            index++;
          }
          else
          {
            for (int i = 0; i < index; i++)
            {
              hand[i].showCard();
              cout << ", ";
            }
            cout << "Prime: "<< prime << endl;
            pile++;
            index = 0;
            prime = 0;
          }
        }
        if (isPrime(prime))
        {
          cout << "Winner in " << pile << " piles!"<< endl;
        }
        else
        {
          for (int i = 0; i < index; i++)
          {
            hand[i].showCard();
            cout << ", ";
          }
          cout << "Loser" << endl;
        }
      }

      if (menuNum == 5)
      {
        cout << "Goodbye.." << endl;
        loop = false;
      }
      
    }
    
    return 0;
}

int getInt()
{
  int integer = 0;
  bool valid = false;
  while (!valid)
  {
    if (cin >> integer)
    {
      if (integer >= 1 && integer <= 5)
        {
        valid = true;
        }
      else
      {
        cout<< "Invalid. Enter a new number from 1 to 5: ";
      }
      
    }
    else
    {
      cin.clear();
      string invalid;
      cin >> invalid;
      cout << "Invalid. Enter a number from 1 to 5: ";
    }
    
  }
  return integer;
}