#ifndef CARD_H
#define CARD_H
#include <string>
class Card
{
    private: 
        char rank;
        char suit;
        //bool faceUp;
    public:
        Card();
        Card(char r, char s);
        void setCard(char r, char s);
        int getValue();
        void showCard();
        //void flipCard();   
};

#endif