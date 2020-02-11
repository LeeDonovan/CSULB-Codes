public class Cards {
	//Instance Variables
	int suit;
	int rank;
	
	public Cards(int rank, int suit)	{
		this.suit = suit;
		this.rank = rank;
	}
	
	public int getSuit()	{
		return suit;
	}
	
	public int getRank()	{
		return rank;
	}
	
	public String suitToString()	{
		
		//1 = Hearts
		//2 = Diamonds
		//3 = Spades
		//4 = Clubs
		if (suit == 1)	{
			return "Hearts";
		}
		
		if (suit == 2)	{
			return "Diamonds";
		}
		
		if (suit == 3)	{
			return "Spades";
		}
		
		if (suit == 4)	{
			return "Clubs";
		}
		
		//If this is returned then mistakes were made
		return "??";
	}
	
	public String rankToString()	{
		
        if(rank == 2)
        {
            return "2";
        }
        
        if(rank == 3)
        {
            return "3";
        }
        
        if(rank == 4)
        {
            return "4";
        }
        
        if(rank == 5)
        {
            return "5";
        }
        
        if(rank == 6)
        {
            return "6";
        }
        
        if(rank == 7)
        {
            return "7";
        }
        
        if(rank == 8)
        {
            return "8";
        }
        
        if(rank == 9)
        {
            return "9";
        }
        
        if(rank == 10)
        {
            return "10";
        }
        
        if(rank == 11)
        {
            return "Jack";
        }
        
        if(rank == 12)
        {
            return "Queen";
        }
        
        if(rank == 13)
        {
        	return "King";
        }
        
        if(rank == 14)
        {
            return "Ace ";
        }
        
        //If this is returned a mistake was made
        return "??";
	}
	
	public String toString()	{
		return(rankToString() + " of " + suitToString());
	}
	
}//End Class Card
