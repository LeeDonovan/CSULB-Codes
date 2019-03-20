
public class Sundae extends IceCream
{
	int calories;
	double toppingCost;
	double sCost;
	public double getCost()
	{
		sCost =  cost + toppingCost;
		return sCost;
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
