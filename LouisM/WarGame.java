import java.util.*;

public class WarGame {
	public static void main(String[] args)	{
		ArrayList<String> cardSuite = new ArrayList<String>();
        

	}//Ends Main
}//Ends class WarGAme

public class Cards	{
	private int suit, rank;
	private String[] cardSuit = {"Spades", "Clubs", "Diamond", "Hearts"};
	private String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
	
	public Cards(int suits, int ranks)	{
		suit = suits;
		rank = ranks;
	}
	
	public String toString()	{
		String cardType = cardRank[rank] + " of " + cardSuit[suit];
		
		return cardType;
	}
}

public class Deck	{
	private ArrayList<Cards> firstDeck;
	private ArrayList<Cards> playerOne;
	private ArrayList<Cards> playerTwo;
	private ArrayList<Cards> discardPile;
	
	public Deck()	{
		firstDeck = new ArrayList<Cards>();
		
		for(int i = 0; i < 4; i++)	{
			for(int j = 0; j < 13; j++)	{
				firstDeck.add(new Cards(a, b));
			}
		}
		
	}
	
	public Cards shuffleCards()	{
		Collections.shuffle(firstDeck);;
	}
}