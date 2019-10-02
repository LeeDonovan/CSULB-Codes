/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victoroof;

import java.io.*;
import  java.util.*;
public class VictorOof {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File inputFile = new File("C:\\Users\\Donald\\Desktop\\Dont Open\\CSULB-Codes\\Helper\\VictorOof\\src\\Database.txt");
        Scanner in = new Scanner(inputFile);
        String first = in.next();
        String second = in.next();
        String third = in.next();
        System.out.println(third);
        Scanner use = new Scanner(System.in);
        System.out.println("FileName: ");
        String filename = use.next();
        if(filename != "Database.txt")
        {
            System.out.println("Error .txt");
            System.out.println("Reinput Filename: ");
            filename = use.next();
        }
            
        System.out.println("Username: ");
        String userFirst = use.next();
        if(userFirst.equals(first))
        {
            System.out.println("Password: ");
            String password = use.next();
            if(password.equals(second))
            {
                System.out.println("Something!");
            }
            else
            {
                System.out.println("Incorrect Password, Reinput: ");
                password = use.next();
            }  
        }
        else
        {
            System.out.println("Incorrect Username, Reinput: ");
            userFirst = use.next();
        }      
    }
    
}
