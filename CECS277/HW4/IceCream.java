
public class IceCream extends DessertItem
{
	protected double cost;
	int calories;
	public IceCream()
	{
		this("");
	}
	public IceCream(String s)
	{
		this.name = s; 
	}
	public double getCost()
	{
		double rounded = (double)Math.round(cost * 100d) / 100d;
		cost = rounded;
		return cost;
	}
	
	public void setCost(double c)
	{
		cost = c;
	}
	public int getCalorie()
	{
		return calories;
	}
	public void setCalorie(int n)
	{
		calories = n;
	}
	public String toString()
	{
		return name;
	}
	/*
	public int compareTo(DessertItem other)
	{
		int result = 0;
		
		if (other instanceof IceCream)
		{
			IceCream i = (IceCream)other;

			if (this.calories > i.calories)
				return 1;
			else if (this.calories < i.calories)
				return -1;
			else 
				return 0;
		}
		return result;
	}
	*/
}
