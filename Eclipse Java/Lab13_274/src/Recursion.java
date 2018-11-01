import java.util.*;

public class Recursion 
{
    static String reverse = "";
    public static String reverseString(String str)
    {
        if(str.length() == 1)
        {
            return str;
        } 
        else 
        {
            reverse += str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
            return reverse;
        }
    }
     
    public static void main(String a[]){
    	String reverse = "";
    	Scanner in = new Scanner(System.in);
    	System.out.println("Please enter a string:");
    	reverse = in.nextLine();
        System.out.println("Result of Reversing: "+ reverseString(reverse));
    }
		
}
