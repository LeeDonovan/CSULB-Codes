import java.util.Scanner;
public class HW4 {
	
	public static int calculateNameScore(String name) 
	{
		int sum = 0;
		char c;
		for (int i = 0; i <name.length();i++)
		{
			c = name.charAt(i);
			if (Character.isLetter(c))
			{
				sum = sum + (int)c;
			}
			
			
		}
		return sum;
	}
	
	public static boolean isWinner(String chicken)
	{
		int hehe = calculateNameScore(chicken);
		if (hehe % 2 == 0)
		{
			return true;
		}
		return false;

	}
	
	public static String getName()
	{ 
		Scanner scan = new Scanner(System.in);
		String userInput = "";
		do 
		{
			System.out.println("Please enter your name:");
			userInput = scan.nextLine();
		}
		while(userInput.length() == 0);
		
		return userInput;
	}

	public static void main(String[] args) 
	{
		while(true)
		{
			String x = getName();
			if (x.equalsIgnoreCase("quit"))
			{
				System.out.println("Thanks for playing, but Thanos will return...");
				break;
			}
			boolean d = isWinner(x);
			if (d)
			{
				System.out.println("Congratulations, "+ x + ". You win!!!\n");
			}
			else
			{
				System.out.println("Sorry, " + x +". You have to go now.\n");
			}
		}
	}

}
