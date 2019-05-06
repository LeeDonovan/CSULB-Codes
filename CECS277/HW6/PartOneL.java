import java.io.*;
import java.util.*;

public class PartOneL
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\QnotfollowedbyU.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        HashMap<Integer,String> hmap=new HashMap<Integer,String>();  
        String st;
        int counter = 0;
        long start = System.nanoTime();
        while ((st = br.readLine()) != null)
        {
            
            if(hmap == null)
            {
                break;
            }
            hmap.put(counter++,st);
        }
        int hashSize = hmap.size();
        for(int i = 0;i<hashSize-1;i++)
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
            }
            System.out.println(treeWord + "'s value for scrabble is: " + scrabble);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Nanoseconds for Tree Map: "+timeElapsed +"\n");

    }
}