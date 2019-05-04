
import java.util.*;
public class Main {

	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in);
		boolean keep_going = true;
		int choice;
		String top;
		String flavor;
		String topping;
		String candy;
		String cookie;
		Checkout chk = new Checkout();
		while(keep_going)
		{
			System.out.println("Dessert Menu");
			System.out.println("1: Ice Cream");
			System.out.println("2: Candy");
			System.out.println("3: Cookie");
			System.out.println("4: Checkout");
			choice = in.nextInt();
			in.nextLine();
			if(choice == 1)
			{
				System.out.println("What Ice Cream flavor would you like?");
				flavor = in.nextLine();
				System.out.println("Would you like toppings with that? (Y/N)");
				top = in.nextLine();
				if(top.equalsIgnoreCase("Y"))
				{
					System.out.println("What topping would you like?");
					topping = in.nextLine();
					System.out.println("Enter your toppings");
					Sundae b1 = new Sundae(flavor + " "+ topping + " Ice Cream Sundae");
					b1.setCost(1.05);
					b1.setToppingCost(0.90);
					b1.setCalorie(284);
					System.out.println("You ordered " + b1);
					chk.enterItem(b1);
				}
				else
				{
					IceCream i1 = new IceCream(flavor + " Ice Cream");
					i1.setCost(1.05);
					i1.setCalorie(55);
					System.out.println("You ordered " + i1);
					chk.enterItem(i1);
				}
				
				
			}
			if (choice == 2)
			{
				System.out.println("What candy would you like?");
				candy = in.nextLine();
				Candy c1 = new Candy(candy);
				System.out.println("How many pounds of " + candy + " would you like?");
				double lbs = in.nextDouble();
				c1.setCalorie(96);
				c1.setWeight(lbs);
				c1.setPricePerPound(3.99);
				System.out.println("You ordered " + c1);
				chk.enterItem(c1);
			}
			if (choice == 3)
			{
				System.out.println("What cookie would you like?");
				cookie = in.nextLine();
				Cookie a1 = new Cookie(cookie);
				System.out.println("How many cookies would you like?");
				int alot = in.nextInt();
				a1.setNum(alot);
				a1.setpricePerDozen(3.99);
				a1.setCalorie(128);
				System.out.println("You ordered " + a1);
				chk.enterItem(a1);
			}
			if(choice == 4)
			{
				System.out.println("Checkout");
				System.out.println("Number of items: " + chk.numberOfItems() + "\n");
				System.out.println("Total cost: "+ chk.totalCost()+  " cents \n");
				System.out.println("Total tax: " + chk.totalTax() + " cents\n");
				System.out.println("Cost + Tax : " +(chk.totalCost() + chk.totalTax()) + " cents\n\n");
				System.out.println(chk);
				System.out.println("Tax" + "\t\t\t\t" + String.format("%22s", (chk.totalTax() / 100.0)));
				System.out.println("Total Cost" + "\t\t\t" + String.format("%24s", (chk.totalCost() + chk.totalTax()) / 100.0 + "\n\n"));
				for(int i = 0; i < chk.dessertItems.size(); i++)
				{
					for(int j = i + 1; j < chk.dessertItems.size(); j++)
					{
						String s;
						String t;
						s = String.format("Name: %-50s Calories: %d", chk.dessertItems.get(i), chk.dessertItems.get(i).getCalorie());
						System.out.println(s);
						t = String.format("Name: %-50s Calories: %d", chk.dessertItems.get(j), chk.dessertItems.get(j).getCalorie());
						System.out.println(t + "\n");
						//System.out.println(chk.dessertItems.get(i) + String.format("Name: %-50s Calories: %d", chk.dessertItems.get(i).getCalorie()));
						//System.out.println(chk.dessertItems.get(i).getCalorie() + " calories");
						//System.out.println(chk.dessertItems.get(j) + String.format("Name: %-50s Calories: %d", chk.dessertItems.get(j).getCalorie()));
						//System.out.println(chk.dessertItems.get(j).getCalorie() + " calories" + "\n");
						System.out.println("Comparing Dessert Items... " + "\n");
						if(chk.dessertItems.get(i).compareTo(chk.dessertItems.get(j)) == 0)
							System.out.println(chk.dessertItems.get(i) + " is the same as " + chk.dessertItems.get(j) + "\n");
						else if (chk.dessertItems.get(i).compareTo(chk.dessertItems.get(j)) < 0)
							System.out.println(chk.dessertItems.get(i) + " is less than " + chk.dessertItems.get(j) + "\n" );
								
						else
							System.out.println(chk.dessertItems.get(i) + " is greater than " + chk.dessertItems.get(j) + "\n");
					}
					keep_going = false;
				}
				System.out.println("Sorting list..." + "\n");
				chk.SortList();
			}	
			
		}
		
		/*IceCream i1 = new IceCream("Vanilla Ice Cream");
		i1.setCost(1.05);
		i1.setCalorie(55);
		Candy c1 = new Candy("Peanut Butter Fudge");
		c1.setWeight(2.25);
		c1.setPricePerPound(3.99);
		c1.setCalorie(96);

		Candy c2 = new Candy("Gummy Bear");
		c2.setWeight(2.25);
		c2.setPricePerPound(4.99);
		c2.setCalorie(100);

		Cookie a1 = new Cookie("Oatmeal Raisin Cookies");
		a1.setNum(5);
		a1.setpricePerDozen(3.99);
		a1.setCalorie(128);
		
		Cookie a2 = new Cookie("Chocolate Chip Cookies");
		a2.setNum(5);
		a2.setpricePerDozen(3.99);
		a2.setCalorie(160);
		
		Sundae b1 = new Sundae("Hot Fudge Sundae with Choc. Chip Ice Cream");
		b1.setCost(1.05);
		b1.setToppingCost(0.90);
		b1.setCalorie(284);
		
		//System.out.println(b1);
		//System.out.println(i1);
		//System.out.println(c1);
		//System.out.println(a1);

		Checkout chk = new Checkout();
		chk.enterItem(c1);
		chk.enterItem(c2);
		chk.enterItem(i1);
		chk.enterItem(b1);
		chk.enterItem(a1);
		chk.enterItem(a2);
		System.out.println("Number of items: " + chk.numberOfItems() + "\n");
		System.out.println("Total cost: "+ chk.totalCost()+  " cents \n");
		System.out.println("Total tax: " + chk.totalTax() + " cents\n");
		System.out.println("Cost + Tax : " +(chk.totalCost() + chk.totalTax()) + " cents\n\n");
		System.out.println(chk);
		System.out.println("Tax" + "\t\t\t\t" + String.format("%22s", (chk.totalTax() / 100.0)));
		System.out.println("Total Cost" + "\t\t\t" + String.format("%24s", (chk.totalCost() + chk.totalTax()) / 100.0 + "\n\n"));
		*/
		/*
		System.out.println("Comparing Dessert Items... " + "\n");
		System.out.println("Comparing Candy 1 vs Candy 2: ");
		if (c1.compareTo(c2) == 0)
			System.out.println("Candy 1 is the same as Candy 2");
		else if (c1.compareTo(c2) < 0)
			System.out.println("Candy 1 is less than Candy 2" );
		else
			System.out.println("Candy 1 is greater than Candy 2");
		
		System.out.println("Comparing Cookie 1 vs Cookie 2: ");
		if (a1.compareTo(a2) == 0)
			System.out.println("Cookie 1 is the same as Cookie 2");
		else if (a1.compareTo(a2) < 0)
			System.out.println("Cookie 1 is less than Cookie 2");
		else
			System.out.println("Cookie 1 is greater than Cookie 2");
		
		System.out.println("Comparing Cookie 1 vs Candy 1: ");
		if (a1.compareTo(c1) == 0)
			System.out.println("Cookie 1 is the same as Candy 1");
		else if (a1.compareTo(c1) < 0)
			System.out.println("Cookie 1 is less than Candy 1");
		else
			System.out.println("Cookie 1 is greater than Candy 1" + "\n");
		
		System.out.println("Sorting list..." + "\n");
		chk.SortList();
		*/
	}
	
}
