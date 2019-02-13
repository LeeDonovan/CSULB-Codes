#include "Deck.h"
#include "Card.h"
#include <cstdlib>
#include <time.h>
#include <iostream>
using namespace std;

Deck::Deck()
{
    int suitNum;
    char JT;
    char toxic;
    int yeet = 0;
    for (int i = 0; i < 4; i++)
    {
        suitNum = i;
        if (suitNum == 0) JT = 'S';
        if (suitNum == 1) JT = 'H'; 
        if (suitNum == 2) JT = 'D';
        if (suitNum == 3) JT = 'C'; 
        
        for (int j = 0; j < 13; j++)
        {
            if (j == 0) toxic = 'A';
            if (j == 1) toxic = '2';
            if (j == 2) toxic = '3';
            if (j == 3) toxic = '4';
            if (j == 4) toxic = '5';
            if (j == 5) toxic = '6';
            if (j == 6) toxic = '7';
            if (j == 7) toxic = '8';
            if (j == 8) toxic = '9';
            if (j == 9) toxic = 'T';
            if (j == 10) toxic = 'J';
            if (j == 11) toxic = 'Q';
            if (j == 12) toxic = 'K';
            
            deckofCards[yeet].setCard(toxic, JT);
            yeet++;
        }
    }
};

void Deck::showDeck()
{
    int counter = 0;
    for (int i = top; i < 52; i++)
    {
        deckofCards[i].showCard();
        cout << "  ";
        counter++;
        if (counter == 13)
        {
            cout << endl;
            counter = 0;
        }
    }
    cout <<"\n" << endl;
};

Card Deck::deal()
{
    return deckofCards[top++];
}

void Deck::shuffle()
{
    srand(time(NULL));
    for(int i = 0; i < 1000; i++)
    {
        int x = rand() % 52;
        int y = rand() % 52;
        Card temp = deckofCards[x];
        deckofCards[x] = deckofCards[y];
        deckofCards[y] = temp;
    }
};

int Deck::cardsLeft()
{
    return 52-top;
}