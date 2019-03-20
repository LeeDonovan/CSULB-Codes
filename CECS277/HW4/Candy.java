
public class Candy extends DessertItem 
{
	double weight;
	double pricePerPound;
	int calories;
	double cost;
	public double getCost()
	{
		cost = weight * pricePerPound;
		return cost;
	}
	
	public int getCalories()
	{
		return calories;
	}
	public void setCalories(int n)
	{
		calories = n;
	}
}


