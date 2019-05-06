import java.io.*;
import java.util.*;

public class PartTwo
{

    public static void main(String[] args) throws IOException 
    {
        
        File file = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\CECS277\\HW6\\alice30.txt"); 
        BufferedReader br = new BufferedReader(new FileReader(file)); 
        Scanner scanner = new Scanner(file);
        long start = System.nanoTime();
        while (scanner.hasNextLine()) 
        {
            String line = scanner.nextLine();
        }
        long finish = System.nanoTime();
        long timeElapsed = finish - start;
        System.out.println("Nanoseconds for Tree Map: "+timeElapsed +"\n");
    }
}