import java.util.Scanner;
public class Lab_16 
{
	public boolean isPrime(int prime)
	{
		int i;
		for (i = 2; i<prime/2; i++) 
		{
			if (prime % i ==0)
			{
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) 
	{
		isPrime primary = new isPrime
		Scanner scan = new Scanner(System.in);
		int times = 0;
		System.out.println("\nPlease enter 5 integers: ");
		while (times != 5)
		{
		     double userInput = scan.nextDouble();
		     
		     times = times +1;
		}
		
	}

}
