#include "Deck.h"
#include "Card.h"
#include <cstdlib>
#include <time.h>

Deck::Deck()
{
    Card x;
    char deck[52];
    for (int i = 0; i < 52; i++)
    {
        deck[i] = x;
    }
};

// void Deck::shuffle()
// {
//     srand(time());
//     int x = rand() % 52;
//     int y = rand() % 52;
//     Card temp = deck[x]
//     deck[x] = deck[y];
//     deck [y] = temp;
// };