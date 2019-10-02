
package javaapplication2;

import java.io.*;
import  java.util.*;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws FileNotFoundException {
        int result = 0;
        File inputFile = new File("Number.txt");
        Scanner in = new Scanner(inputFile);
        for (int i; i<3 ; i++)
        {
            String number = in.next();
            int conv = Integer.parseInt(number);
            result = result + conv;
            System.out.println("Integer " + i+": "+conv );
            if(i == 3)
            {
                int avg = result/i;
                System.out.println("Average: "+ avg);
            }
                
                    
        }
            
         
    }
    
}
