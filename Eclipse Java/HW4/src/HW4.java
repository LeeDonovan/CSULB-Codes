import java.util.Scanner;
public class HW4 {
	
	public static int calculateNameScore(String name) 
	{
		int sum = 0;
		char c;
		for (int i = 0; i <name.length();i++)
		{
			c = name.charAt(i); // charAt takes a single character
			if (Character.isLetter(c))//checks if c is a letter
			{
				sum = sum + (int)c;//adds c to sum every time it iterates
			}
			
			
		}
		return sum;
	}
	
	public static boolean isWinner(String chicken)
	{
		int hehe = calculateNameScore(chicken);//calls calculateNameScore
		if (hehe % 2 == 0)//if remainder equals 0 then true, if there is a remainder then false
		{
			return true;
		}
		return false;

	}
	
	public static String getName()
	{ 
		Scanner scan = new Scanner(System.in);
		String userInput = "";//sets empty string to be called later
		do 
		{
			System.out.println("Please enter your name:");
			userInput = scan.nextLine();
		}
		while(userInput.length() == 0);//checks if string is empty
		
		return userInput;
	}

	public static void main(String[] args) 
	{
		while(true)
		{
			String x = getName();
			if (x.equalsIgnoreCase("quit"))//if user input equaled quit then program stops
			{
				System.out.println("Thanks for playing, but Thanos will return...");
				break;
			}
			boolean d = isWinner(x);
			if (d)//if true then you win
			{
				System.out.println("Congratulations, "+ x + ". You win!!!\n");
			}
			else//if false then you lose
			{
				System.out.println("Sorry, " + x +". You have to go now.\n");
			}
		}
	}

}
