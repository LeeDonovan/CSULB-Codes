import java.io.*;
import java.util.*;
public class PartOne 
{
	public void treeMap() throws IOException
	{
		System.out.println("Using TreeMap\n");
		File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\QnotfollowedbyU.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		TreeMap<Integer, String>  tmap = new TreeMap<Integer, String>();
		String word;
		int counter = 0;
		long start = System.nanoTime();
		while((word = br.readLine()) != null)
		{
			if(tmap == null)
			{
				break;
			}
			else
			{
				tmap.put(counter++, word);
			}
		}
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Nanoseconds for Tree Map: "+timeElapsed +" ns\n");
		//
		long start2 = System.nanoTime();
		int treeSize = tmap.size();
		for(int i = 0; i < treeSize; i++)
		{
			int scrabble = 0;
			String treeWord = tmap.get(i);
			for(int j = 0; j < treeWord.length(); j++)
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
			}
			long finish2 = System.nanoTime();
			long timeElapsed2 = finish2 - start2;
			System.out.println(treeWord + "'s value for scrabble is: " + scrabble);
			System.out.println("Time for Scrabbling: " + timeElapsed2 + " ns");
        }

	}
	public static void treeSet() throws IOException
	{
		System.out.println("Using TreeSet\n");
		Scanner file = new Scanner(new File("CC:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\alice30.txt"));
		Set<String> tree = new TreeSet<>();
		// For each word in the input
		//String test;
		while(file.hasNext())
		{
			//test = file.next();
			//System.out.println(test);
			//tree.add(test.trim());
			tree.add(file.next().trim());
		}
		//System.out.println("Inserting words into TreeSet: " + tree);
		//long finish = System.nanoTime();
		//long timeElapsed = finish - start;
	    //System.out.println("Nanoseconds for TreeSet: " + timeElapsed +"\n");
	    
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
		    if(tree.contains(word))
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
		    System.out.println("Nanoseconds for TreeSet in 100 searches: " + avgResult +"\n");
		}
	    //System.out.println("Nanoseconds for TreeSet: " + timeElapsed +"\n");
	    
	}
	public void arrayList() throws IOException
	{
		System.out.println("Using ArrayList\n");
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		ArrayList<String> list = new ArrayList<String>();
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
	    System.out.println("Nanoseconds for Tree Map: "+timeElapsed +"\n"); 
		//System.out.println("List of 100 items: " + list);
		//Iterator itr = list.iterator();
		
	}
	public void PlayGame() throws IOException
	{
		System.out.println("Using ArrayList\n");
		int number_of_players = 0;
		
		System.out.println("Please enter the number of teams: ");
	    Scanner input = new Scanner(System.in);
	    number_of_players = input.nextInt();
	    
	    // loading items from file
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < number_of_players; i++)
		{
			ArrayList<String> player = new ArrayList<>();
			lists.add(player);
		}
		long start = System.currentTimeMillis();//TIMER START
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
		long finish = System.currentTimeMillis();//TIMER END
		long timeElapsed = finish - start;
		System.out.println("Time Took To Traverse Through An Arraylist: "+timeElapsed +" ms\n");
		for(int i = 0; i < number_of_players; i++)
		{
			System.out.println(lists.get(i));
		}
		
		// ask user for what position to retrieve 
		long start_1 = System.currentTimeMillis();//NEXT TIMER
		System.out.println("Enter a position to be retrieved from the list: ");
		int position = input.nextInt();
		ArrayList<String> words = new ArrayList<String>();
		String retrieved;
		
		for(int i = 0; i < number_of_players; i++)
		{
			retrieved = lists.get(i).get(position);
			words.add(retrieved);
		}
		System.out.println(words);
		long finish_1 = System.currentTimeMillis();//END AGAIN
		long timeElapsed_1 = finish_1 - start_1;
		System.out.println("Time To Add Item into ArrayList: " + timeElapsed_1 +" ms\n");
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
		System.out.println("Using ArrayList\n");
		Random rand = new Random();
		int ran = rand.nextInt(100);
		int number_of_players = 0;
		
		System.out.println("Please enter the number of teams: ");
	    Scanner input = new Scanner(System.in);
	    number_of_players = input.nextInt();
	    
	    // loading items from file
		Scanner s = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\100NeighborhoodItems.txt"));
		ArrayList<ArrayList<String>> lists = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < number_of_players; i++)
		{
			ArrayList<String> player = new ArrayList<>();
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
		
		ArrayList<String> words = new ArrayList<String>();
		String retrieved;
		
		for(int i = 0; i < number_of_players; i++)
		{
			retrieved = lists.get(i).get(ran);
			words.add(retrieved);
		}
		System.out.println("These are the words at position: " + ran + " " + words);
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Time Taken For Randomizing Using An ArrayList: " + timeElapsed +" ms\n");
	
	}
	public static void main(String[] args) throws IOException
	{
		PartOne x = new PartOne();
		x.randomNumber();
		 //PartOne x = new PartOne();
		 //x.treeSet();
		//PartOne x = new PartOne();
		//x.arrayList();
		// PartOne x = new PartOne();
		// x.randomNumber();
    }
}
