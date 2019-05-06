import java.io.*;
import java.util.*;
public class BrianOne 
{
	public void treeMap() throws IOException
	{
		File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\Brian\\QnotfollowedbyU.txt");
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
        System.out.println("Nanoseconds for Tree Map: "+timeElapsed +"\n");
        //
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
            System.out.println(treeWord + "'s value for scrabble is: " + scrabble);
        }

	}
	public static void treeSet() throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\Brian\\alice30.txt"));
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
			long avgResult =  resultTotal / 100l;
		    System.out.println("Nanoseconds for TreeSet in 100 searches: " + avgResult +"\n");
		}
	    //System.out.println("Nanoseconds for TreeSet: " + timeElapsed +"\n");
	    
	}
	public static void main(String[] args) throws IOException
	{
		 BrianOne x = new BrianOne();
		 x.treeSet();
				
    }
}
