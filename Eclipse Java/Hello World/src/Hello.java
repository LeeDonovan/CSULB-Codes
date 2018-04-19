import java.util.Scanner;
public class Hello {

	public static void main(String[] args) {
		  Scanner input = new Scanner (System.in);
		  System.out.print("Input first name: ");
		  String fname = input.next();
		  System.out.print("Input Last name: ");
		  String lname = input.next();
		  System.out.println();
		  System.out.println("Hello \n" + fname +" "+ lname+ "\nWelcome to this code!");
		 }

	}

