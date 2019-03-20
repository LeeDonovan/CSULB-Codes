
public class Cookie extends DessertItem 
{
	int num;
	double pricePerDozen;
	int calories;
	double cost;
	public double getCost()
	{
		cost = (pricePerDozen / 12) * num;
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
