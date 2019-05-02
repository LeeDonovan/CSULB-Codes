/* Numbers between a range 0-51
51 - 0 + 1
x = rand()%52 + 0
x = rand()%(18-3+1) + 3 ( lands btw 3 - 18)
take max value then subtract min value then add 1 
Deck myDeck;
if (choice == 2)
    myDeck.refreshDeck();

use Deck() to set top = 0;

Card deal()
    top++

reset()
Top = 0; 

reset calls setcard() 52 times
*/ 

/* 

void swap(int x, int y);

void swap(int x, int y)
{
    int temp;
    temp = x;
    x = y;
    y = temp;
}


passing by value
int main()
{
    int a = 20;
    int b = 30;
    swap(a,b);
    cout << a << b;
    return 0;
}
*/

/*
passing by reference
int main()
{
    int x;
    x = 2;
    int &y = x;
}
*/

//pass by pointer