import java.io.*;
import java.util.*;
import java.util.*;
public class PartOneL
{
	public static void hashMap() throws IOException
	{
		System.out.println("Using HashMap\n");
		 File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\QnotfollowedbyU.txt"); 
		  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
        String st;
        int counter = 0;
        System.out.println("Start loading HashMap...");
        long start = System.nanoTime();
        while ((st = br.readLine()) != null)
        {
            
            if(hmap == null)
            {
                break;
            }
            hmap.put(counter++,st);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Done loading Hash Map in: "+timeElapsed +" ns\n");
		// part one of of PARTONE
		long start2 = System.nanoTime();
        int hashSize = hmap.size();
        for(int i = 0;i<hashSize;i++)
        {
            int scrabble = 0;
            String treeWord = hmap.get(i);
            for(int j = 0; j < treeWord.length();j++)
            {
                char c = treeWord.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i'|| c == 'l' || c == 'n' || c == 'o' || c == 'r' || c == 's' || c == 't' || c == 'u')
                {
                    scrabble++;
                }
                else if(c == 'd' || c == 'g')
                {
                    scrabble = scrabble + 2;
                }
                else if(c == 'b' || c == 'c' || c == 'm' || c == 'p' )
                {
                    scrabble = scrabble + 3;
                }
                else if(c == 'f' || c == 'h' || c == 'v' || c == 'w' || c == 'y')
                {
                    scrabble = scrabble + 4;
                }
                else if(c == 'k')
                {
                    scrabble = scrabble + 5;
                }
                else if(c == 'j' || c == 'x')
                {
                    scrabble = scrabble + 8;
                }
                else if(c == 'q' || c == 'z')
                {
                    scrabble = scrabble + 10;
                }
                else
                {
                    scrabble = scrabble + 0;
                }
			}//for
			long finish2 = System.nanoTime();
			long timeElapsed2 = finish2 - start2;
            System.out.println(treeWord + "'s value for scrabble is: " + scrabble);
			System.out.println("Time for Scrabbling: " + timeElapsed2 + " ns");
		}//for
    }
	public static void hashSet() throws IOException
	
	{
		System.out.println("Using HashSet\n");
		Scanner file = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\alice30.txt"));
		Set<String> hash = new HashSet<>();
		// For each word in the input
		//long start = System.nanoTime();
		while(file.hasNext())
		{
			hash.add(file.next().trim());
		}
		//System.out.println("Inserting words into hashset: " + hash);
		
	    System.out.println("Enter a word to Search: ");
	    Scanner input = new Scanner(System.in);
	    String word = input.next().trim();
	    
	    boolean isFound = false;
	    long resultTotal = 0;
		long start, finish, timeElapsed;
		//= System.nanoTime();
		for (int i = 0; i < 100; i++)
		{
			start = System.nanoTime();
		    if(hash.contains(word))
		    {
		    	//System.out.println("Yes, word found: " + word);	
		    	finish = System.nanoTime();
		    	timeElapsed = finish - start;
		    	//System.out.println("Per search time: " + timeElapsed);
		    	resultTotal = resultTotal + timeElapsed;
		    	isFound = true;
		    }
		    else
		    {
		    	System.out.println("No, word not found");
		    	break;
		    }
		}//for
		if (isFound)
		{
			long avgResult =  resultTotal / 100;
		    System.out.println("Nanoseconds for HashSet in 100 searches: " + avgResult +"\n");
		}
	    //System.out.println("Nanoseconds for TreeSet: " + timeElapsed +"\n");
	    
	}
	public void LinkedList() throws IOException
	{
		System.out.println("Using LinkedList\n");
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		LinkedList<String> list = new LinkedList<String>();
		long start = System.nanoTime();
		while(s.hasNext())
		{
			list.add(s.next());
		}
		Iterator itr = list.iterator();
		ListIterator ritr = list.listIterator(list.size());
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		while(ritr.hasPrevious())
		{
			System.out.println(ritr.previous());
		}
		long finish = System.nanoTime();
	    long timeElapsed = finish - start;
	    System.out.println("Nanoseconds for LinkedList: "+timeElapsed +"\n"); 
		//System.out.println("List of 100 items: " + list);
		//Iterator itr = list.iterator();
	}
	public void PlayGame() throws IOException
	{
		System.out.println("Using LinkedList\n");
		int number_of_players = 0;
		
		System.out.println("Please enter the number of teams: ");
	    Scanner input = new Scanner(System.in);
	    number_of_players = input.nextInt();
	    
	    // loading items from file
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		LinkedList<LinkedList<String>> lists = new LinkedList<LinkedList<String>>();
		for (int i = 0; i < number_of_players; i++)
		{
			LinkedList<String> player = new LinkedList<>();
			lists.add(player);
		}
		long start = System.currentTimeMillis();
		String word;
		while(s.hasNext())
		{
			word = s.next();
			for (int i = 0; i < number_of_players; i++)
			{
				lists.get(i).add(word);
			}//for
		}//while
		for (int i = 0; i < number_of_players; i++)
		{
			Collections.shuffle(lists.get(i));
		}
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Time Took To Traverse Through An LinkedList: "+timeElapsed +" ms\n");
		for(int i = 0; i < number_of_players; i++)
		{
			System.out.println(lists.get(i));
		}
		
		// ask user for what position to retrieve 
		long start_1 = System.currentTimeMillis();
		System.out.println("Enter a position to be retrieved from the list: ");
		int position = input.nextInt();
		LinkedList<String> words = new LinkedList<String>();
		String retrieved;
		
		for(int i = 0; i < number_of_players; i++)
		{
			retrieved = lists.get(i).get(position);
			words.add(retrieved);
		}
		System.out.println(words);
		long finish_1 = System.currentTimeMillis();
		long timeElapsed_1 = finish_1 - start_1;
		System.out.println("Time To Add Item into LinkedList: " + timeElapsed_1 +" ms\n");
		// inserting
		words.clear();
		for(int i = 0; i < number_of_players; i++)
		{
			System.out.println("Please enter a word to insert into position " + position + " of list " + i);
			String x = input.next();
			words.add(x);
		}
		
		for (int i = 0; i < number_of_players; i++)
		{
			//lists.get(i).set(arg0, arg1)
			lists.get(i).set(position, words.get(i));
		}
		for(int i = 0; i < number_of_players; i++)
		{
			System.out.println(lists.get(i));
		}
	}
	public void randomNumber() throws IOException
	{
		System.out.println("Using LinkedList\n");
		Random rand = new Random();
		int ran = rand.nextInt(100);
		int number_of_players = 0;
		
		System.out.println("Please enter the number of teams: ");
	    Scanner input = new Scanner(System.in);
	    number_of_players = input.nextInt();
	    
	    // loading items from file
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		LinkedList<LinkedList<String>> lists = new LinkedList<LinkedList<String>>();
		for (int i = 0; i < number_of_players; i++)
		{
			LinkedList<String> player = new LinkedList<>();
			lists.add(player);
		}
		long start = System.currentTimeMillis();
		String word;
		while(s.hasNext())
		{
			word = s.next();
			for (int i = 0; i < number_of_players; i++)
			{
				lists.get(i).add(word);
			}//for
		}//while
		for (int i = 0; i < number_of_players; i++)
		{
			Collections.shuffle(lists.get(i));
		}
		for(int i = 0; i < number_of_players; i++)
		{
			System.out.println(lists.get(i));
		}
		
		// ask user for what position to retrieve 
		
		LinkedList<String> words = new LinkedList<String>();
		String retrieved;
		
		for(int i = 0; i < number_of_players; i++)
		{
			retrieved = lists.get(i).get(ran);
			words.add(retrieved);
		}
		System.out.println("These are the words at position: " + ran + " " + words);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Time Taken For Randomizing Using An LinkedList: " + timeElapsed +" ms\n");
	
	}
    public static void main(String[] args) throws IOException 
    {
    	PartOneL x = new PartOneL();
    	x.hashMap();
  
    }
}