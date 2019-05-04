
public class Cookie extends DessertItem 
{
	int num;
	double pricePerDozen;
	int calories;
	double cost;
	public Cookie()
	{
		this("");
	}
	public Cookie(String s)
	{
		this.name = s; 
	}
	public void setpricePerDozen(double d)
	{
		pricePerDozen = d;
	}
	public double getpricePerDozen()
	{
		return pricePerDozen;
	}
	public void setNum(int n)
	{
		num = n;
	}
	public int getNum()
	{
		return num;
	}
	public double getCost()
	{
		cost = (pricePerDozen / 12) * num;
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
		
		if (other instanceof Cookie)
		{
			Cookie a = (Cookie)other;
			
			if (this.name == a.name)
			{
				if (this.num == a.num)
					return 0;
				else if (this.num < a.num)
					return -1;
				else
					return 1;
			}
			else if (this.name != a.name)
			{
				if (this.calories < a.calories)
					return -1;
				else if (this.calories > a.calories)
					return 1;
				else if (this.calories == a.calories)
				{
					// check by weight
					if (this.num < a.num)
						return -1;
					else if (this.num > a.num)
						return 1;
					else if (this.num == a.num)
						return this.name.compareToIgnoreCase(a.name);
				}
			}	
		}
		return result;
	}
	*/
}
