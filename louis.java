import java.util.*;

class louis{
    public static void main(String[] args) {
        ArrayList<String> cardSuite = new ArrayList<String>();
        cardSuite.add("Heart");
        cardSuite.add("Diamond");
        cardSuite.add("Clover");
        cardSuite.add("Spade");
        ArrayList<String> deckOfCards = new ArrayList<String>();
        String total = "";
        String toxic = "";
        int checker;
        for(int i = 0; i < 13; i++)
        {
            checker = i;
            if(checker == 0)
            {
                total = "Ace of ";
            }
            if(checker == 2)
            {
                total = "2 of ";
            }
            if(checker == 3)
            {
                total = "3 of ";
            }
            if(checker == 4)
            {
                total = "4 of ";
            }
            if(checker == 5)
            {
                total = "5 of ";
            }
            if(checker == 6)
            {
                total = "6 of ";
            }
            if(checker == 7)
            {
                total = "7 of ";
            }
            if(checker == 8)
            {
                total = "8 of ";
            }
            if(checker == 9)
            {
                total = "9 of ";
            }
            if(checker == 10)
            {
                total = "10 of ";
            }
            if(checker == 11)
            {
                total = "Jack of ";
            }
            if(checker == 12)
            {
                total = "Queen of ";
            }
            if(checker == 13)
            {
                total = "King of ";
            }
            for(int j = 0; j < 4; j++){
                if(j == 0)
                {
                    toxic = cardSuite.get(j);
                }
                if(j == 1)
                {
                    toxic = cardSuite.get(j);
                }
                if(j == 2)
                {
                    toxic = cardSuite.get(j);
                }
                if(j == 3)
                {
                    toxic = cardSuite.get(j);
                }
                deckOfCards.add(total + toxic);
            }
            

        }
        System.out.println(deckOfCards);
        System.out.println(deckOfCards.size());
    }
    

}