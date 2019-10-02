import java.io.*;
import java.util.*;
public class victor{
	public static void main (String[] args)throws FileNotFoundException
	{
		Scanner in= new Scanner(System.in);
		String flightDestination = in.nextLine();
		String stopover = in.nextLine();
		if (flightDestination == "MCO")
		{
			System.out.println("Choose a Stopover: ATL, IAH, NONE");
			String stopover = in.nextLine();
			if(stopover == "ATL")
			{
				String ScreenOutput = "$ 319.99";
			}
			if(stopover == "IAH")
			{
				String ScreenOutput = "$ 329.99";
			}
			if(stopover == "NONE")
			{
				String ScreenOutput = "$ 399.99";
			}
			
		}

		if(flightDestination == "JFK")
		{
			System.out.println("Choose a Stopover: ORD, STL, DTW, NONE");
			String stopover = in.nextLine();
			if(stopover == "ORD")
			{
				String ScreenOutput = "$ 419.99";
			}
			if(stopover == "STL")
			{
				String ScreenOutput = "$ 429.99";
			}
			if(stopover == "DTW")
			{
				String ScreenOutput = "$ 439.99";
			}
			if(stopover == "NONE")
			{
				String ScreenOutput = "$ 499.99";
			}
		}

		System.out.println("	Destination			Stopover		Screen Output");
		System.out.println(flightDestination +"		"+stopover+ "	LAX->"+stopover+"->"+flightDestination+": "+ScreenOutput);

	}
}

		
