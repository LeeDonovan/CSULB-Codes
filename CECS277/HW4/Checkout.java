import java.util.ArrayList;
import java.util.Collections;

public class Checkout 
{
	double taxRate;
	ArrayList<DessertItem> dessertItems = new ArrayList<DessertItem>();

	public Checkout()
	{
		taxRate = 0.07; // 7%
	}
	public void enterItem(DessertItem item)
	{
		dessertItems.add(item);
	}
	public void clear()
	{
		dessertItems.clear();
	}
	
	public int numberOfItems()
	{
		return dessertItems.size();
	}
	
	public int totalCost() // in cents
	{
		int total = 0;
		double itemCost;
		
		for(DessertItem d : dessertItems)
		{
			itemCost = d.getCost();
			total = total + (int)(itemCost * 100.0); // convert to cents before adding to total
		}
		
		return total;
	}
	
	public int totalTax() // in cents
	{
		int totalTax = 0;
		double totalCost = 0;
		double totalTaxDollars;
		
		for(DessertItem d : dessertItems)
		{
			totalCost = totalCost + d.getCost();
		}
		totalCost = (double)Math.round(totalCost * 100d) / 100d;
		totalTaxDollars = (totalCost * taxRate);
		totalTaxDollars = (double)Math.round(totalTaxDollars * 100d) / 100d;
		totalTax = (int)(totalTaxDollars * 100d);

		return totalTax;
	}
	
	//public double getTaxRate()
	//{
		//return 0.0;
	//}
	//public void setTaxRate(double taxRate)
	//{
		
	//}
	public java.lang.String toString()
	{
		String receipt;
		String temp;
		String s;
		
		receipt = "\t\tM & M Dessert Shoppe\n";
		receipt = receipt + "\t\t--------------------\n\n";
		
		for(DessertItem d : dessertItems)
		{
			if (d instanceof Candy)
			{
				receipt = receipt + ((Candy) d).weight + " lbs. @ " + ((Candy) d).pricePerPound + " /lb.\n";
				s = String.format("%-50s", d.getName());
				receipt = receipt + s;
				//receipt = receipt + d.getName() + "\t\t";
				temp = String.format("%.2f", d.getCost());
				receipt = receipt + temp + "\n";
				// + d.getCost() + "\n";
			}
			else if (d instanceof Cookie)
			{
				receipt = receipt + ((Cookie) d).num + " @" + ((Cookie) d).pricePerDozen + "/dz.\n";
				s = String.format("%-50s", d.getName());
				receipt = receipt + s;
				temp = String.format("%.2f", d.getCost());
				receipt = receipt + temp + "\n";
				//receipt = receipt + d.getName() + "\t\t" + d.getCost() + "\n";
			}
			else // ice cream or Sundae
			{
				s = String.format("%-50s", d.getName());
				receipt = receipt + s;
				//receipt = receipt + d.getName() + "\t\t";
				temp = String.format("%.2f",d.getCost()) + "\n";
				receipt = receipt + temp + "\n";
			}
		}
		return receipt;
	}
	public void SortList()
	{
		String s;
		
		Collections.sort(dessertItems);
		for (DessertItem d : dessertItems)
		{
			s = String.format("Name: %-50s Calories: %d", d.name, d.getCalorie());
			//System.out.println("Name: " + d.name + "\tCalories: " + d.getCalorie());
			System.out.println(s);
		}
	}
}

