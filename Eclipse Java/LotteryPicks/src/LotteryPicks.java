
/* Tea LAUREY #017056583
   Donovan LEE #016741645
     September 17, 2018
     Purpose: This program generates sets of 6 random integers going from 1 to 49. 
     		  A set cannot contain the same integer twice.
     		  It generates as much sets as the user asks.
     Inputs: The number of sets the user wants the program to generate
     Output: The number of sets the user asked
*/


import java.util.*;//import all the classes contained in the util package that we are going to need in the program
				   //classes such as :
				   //the Scanner class to allow us to get inputs from the user
				   //the ArrayList class to allow us to use/manipulate arrays in the program
				   //the Collection class to allow us to sort our array in numerical order


public class LotteryPicks { //this line of the code signals that we are creating a new class and name it "ArrayLists"
	
	static Scanner scan = new Scanner(System.in); //creating a scanner named "scan" which we're going to use in our getNumLottos() function to get the user's input
	
	
	public static int getNumLottos() {//creating the first function of our program named "getNumLottos()"
									  //"public" stands as an access specifier giving access to this part of the code to any other classes of the program
									  //"static" is the access modifier allowing the java program to create the space in memory automatically when the program is loaded
									  //"int" is the return type and specify that the program will return an integer

		String numberLottos =""; //creating a string value in which the user's input is later going to be stored

		boolean keepGoing = true; //creating a boolean (either True or False) value which is going to be used in our While loop
								  //set its initial value to "true"
		
		while (keepGoing) { //creating a While loop which will repeat while keepGoing is true
			
			
			keepGoing = false; //change keepGoing's value to "false"
			
		 System.out.println("How many lottery tickets do you want to buy: ");//asking the number of lottery tickets the user wants to buy
	     
		 numberLottos = scan.nextLine(); //get the user's input using the scanner created earlier
		 								 //store it as a string using the ".nextLine()" method
		 
	     for (int i = 0; i < numberLottos.length(); i++) //creating a For loop which will repeat as much times as the number of character contained in the user's input
	    	 											 //using the ".length()" method to get the number of character the input has
	     {
	    	if (!Character.isDigit(numberLottos.charAt(i))) //if the character number i is not a digit
	    													//determining if it is not a digit using the "Character.isDigit()" method
	    													//indicating that the value of "Character.isDigit()" should be "false" by adding "!"
	    													//using the ".charAt()" method to get the character at index i of the input
	    	{
	    		System.out.println("Invalid Input Try Again!"); //then, we print an error message to the user
	    		keepGoing = true; //set keepGoing's value back to "true"
	    		break; //and exit the for loop using the control flow statement "break" 
	    			   //once we exit the for loop, since keepGoing is true, the while loop will repeat again until the user inputs an integer
	    		
	    	}
	     }
	   }
	  return Integer.parseInt(numberLottos);//lastly, we return the input's value as an integer 
	  										//using the "Integer.parseInt()" method to convert the input into an integer
	}
	
	public static int generaterandomnumber() { //creating the second function of our program named "generaterandomnumber()"
												  //this time, our function must return an integer type of value
		
		int numbers = (int)(Math.random()*49+1); //beginning by generating a random number using the "Math.random()" method
												 //also, specified that it must be an integer between 1 and 49
		
		
		return numbers; //finish by returning the numbers value
	}

   
	
	public static ArrayList<Integer> generatepick(){ //creating the third/last function of our program named "generatepick()"
											   //this time, the function will return a list of integers as specified by "ArrayList<Integer>"
        
		 ArrayList<Integer> pick = new  ArrayList<Integer>(); //beginning by creating our new list of strings and named it "pick"
    	
    	int new_number = 0; //we then create a new integer value named "new_number"
    						//its value is later going to be generated randomly through the "generaterandomnumber()" function
    	
    	int i = 0; //creating the value i which we are going to use in our following While loop
    			   //set its initial value at 0
    	
		while (i < 6) { //since our pick have to contain 6 numbers, we make the loop repeat until i = 6
						//in other words, the loop will stop as soon as i's value gets larger than 6
    		
    		new_number = generaterandomnumber(); //generating our new_number's value through the generaterandomnumber() function
    		
    		if (pick.contains(new_number) == true) { //when then check if our array already contains this integer
    												 //if it does:
    			
    			new_number = generaterandomnumber(); //make the function generate a new value for it through the generaterandomnumber() function
    												//then, since the value of i didn't change, this loop will repeat until our new_number's value becomes an integer that our array doesn't contain
    			
    		}
    		
    		else { //if it doesn't :
    			pick.add(new_number); //we can then add that value to our array
    			i = i + 1; //and change i's value 
    		}
    		
    			    			
    		}
	    Collections.sort(pick); //using the Collections method to sort the number of the set in numerical order
    	
    	
        return pick; //once the While loop is done and that our array contains 6 different integers,
        			//we end the function by returning pick
    }
    
	
	public static void main(String[] args) { //creating the main function of the program
											 //"void" indicates that the function won't return anything
		

		int picknumber = 1; //starting by creating an integer value named picknumber with initial value 1
							//which value will represent the pick's number 
				  
		int numberofpickswanted = getNumLottos(); //creating another integer value named numberofpickswanted which value will be generated by the user through the "generatenumberofpicks" function
													  //represents the number of picks that the user wants our program to generate
		
		
		 for(int i = 1; i != numberofpickswanted + 1; i++){ //creating a For loop which is going to repeat until i = numberofpickswanted
			 
			 
			 System.out.println("Pick " + picknumber + ":" + generatepick()); //printing the generated pick to the user 
			 
			 
			 picknumber = picknumber + 1; //add 1 to the value "picknumber" each time the loop repeats	 
		 }	
		
	}
}
