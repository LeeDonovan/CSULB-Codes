
public class Sundae extends IceCream
{
	int calories;
	double toppingCost;
	double sCost;
	public Sundae()
	{
		this("");
	}
	public Sundae(String s)
	{
		this.name = s; 
	}
	public void setCost(double c)
	{
		sCost = c;
	}
	public void setToppingCost(double t)
	{
		toppingCost = t;
	}
	public double getToppingCost()
	{
		return toppingCost;
	}
	public double getCost()
	{
		double cost;
		cost = sCost + toppingCost;
		double rounded = (double)Math.round(cost * 100d) / 100d;
		cost = rounded;	
		return cost;
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
		
		if (other instanceof Candy)
		{
			Sundae s = (Sundae)other;
			
			if (this.name == s.name)
			{
				if (this.calories == s.calories)
					return 0;
				else if (this.calories < s.calories)
					return -1;
				else
					return 1;
			}
			else if (this.name != s.name)
			{
				if (this.calories < s.calories)
					return -1;
				else if (this.calories > s.calories)
					return 1;
				else if (this.calories == s.calories)
				{
					// check by weight
					if (this.calories < s.calories)
						return -1;
					else if (this.calories > s.calories)
						return 1;
					else if (this.calories == s.calories)
						return this.name.compareToIgnoreCase(s.name);
				}
			}	
		}
		return result;
	}
	*/
}
