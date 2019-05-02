#include "Card.h"
class Deck
{
    private:
        Card deckofCards[52];
        int top = 0;
    public:
        Deck();
        void refresh();
        Card deal();
        void shuffle();
        int cardsLeft();
        void showDeck();
};