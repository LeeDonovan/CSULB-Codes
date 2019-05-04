import java.io.*;
import java.util.*;

public class PartOne
{
    public static void main(String[] args) throws IOException 
    {
        File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\QnotfollowedbyU.txt"); 
  
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        String st;
        int counter = ;
        long start = System.nanoTime();
        while ((st = br.readLine()) != null)
        {
            
            if(tmap == null)
            {
                break;
            }
            tmap.put(counter++,st);
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Nanoseconds for Tree Map: "+timeElapsed +"\n");
        System.out.println(tmap);

    }
}
