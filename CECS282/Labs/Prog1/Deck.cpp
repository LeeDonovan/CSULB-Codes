#include "Deck.h"
#include "Card.h"
#include <cstdlib>
#include <time.h>
#include <iostream>


Deck::Deck()
{

    deckofCards[0].setCard('A','S');
    

    
    
    
};

void Deck::showDeck()
{
    using namespace std;
    for (int i = 0; i < 52; i++)
    {
        deckofCards[i].showCard();
        cout << "\n";
    }

    
}

// void Deck::shuffle()
// {
//     srand(time());
//     int x = rand() % 52;
//     int y = rand() % 52;
//     Card temp = deck[x]
//     deck[x] = deck[y];
//     deck [y] = temp;
// };