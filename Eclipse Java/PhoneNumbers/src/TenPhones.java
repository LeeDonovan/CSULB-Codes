import java.util.*;

public class TenPhones {
	static Scanner scan = new Scanner(System.in);

	public static String getNumbers() 
	{
		String phonos ="";
		boolean keepGoing = true;
		while (keepGoing)
		{
		 keepGoing = false;
		 System.out.println("Type in a 10 digit phone number: ");
	     phonos = scan.nextLine();
	     for (int i = 0; i < phonos.length(); i++)
	     {
	    	if (!Character.isDigit(phonos.charAt(i)))
	    	{
	    		System.out.println("Invalid Input Try Again!");
	    		keepGoing = true;
	    		break;
	    		
	    	}
	     }
	     if (phonos.length() < 10)
	     {
	    	 System.out.println("Phone Number to short!!");
	    	 keepGoing = true;
	     }
	     else if (phonos.length() > 10)
	     {
	    	 System.out.println("Phone Number to long!!");
	    	 keepGoing = true;
	     }
	    
	   }
	  return phonos;
	}
	     
		

		
	
	public static ArrayList<String> arrayCreator() 
	{
		ArrayList<String> picks = new ArrayList<String>();
		int count = 0;
		String numerals;
		while (count < 3)
		{
			numerals = getNumbers();
			picks.add(numerals);
			count++;
		}
		return picks;
	}
		
	

	public static void main(String[] args)
	{
		System.out.println("Please enter 10 phone numbers with 10 digits each.");
		ArrayList<String> user = arrayCreator();
		for (int i = 0; i < ((CharSequence) user).length(); i++)
		{
			System.out.println(user);
		}
		
		
	}

}
