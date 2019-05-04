
public class Candy extends DessertItem 
{
	double weight;
	double pricePerPound;
	int calories;
	double cost;
	public Candy()
	{
		
		
		this("");
	}
	public Candy(String s)
	{
		this.name = s; 
	}
	public double getCost()
	{
		cost = weight * pricePerPound;
		double rounded = (double)Math.round(cost * 100d) / 100d;
		cost = rounded;
		
		return cost;
	}
	public void setPricePerPound(double p)
	{
		pricePerPound = p;
	}
	public double getPricePerPound()
	{
		return pricePerPound;
	}
	public void setWeight(double w)
	{
		weight = w;
	}
	public double getWeight()
	{
		return weight;
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
			Candy c = (Candy)other;
			
			if (this.name == c.name)
			{
				if (this.weight == c.weight)
					return 0;
				else if (this.weight < c.weight)
					return -1;
				else
					return 1;
			}
			else if (this.name != c.name)
			{
				if (this.calories < c.calories)
					return -1;
				else if (this.calories > c.calories)
					return 1;
				else if (this.calories == c.calories)
				{
					// check by weight
					if (this.weight < c.weight)
						return -1;
					else if (this.weight > c.weight)
						return 1;
					else if (this.weight == c.weight)
						return this.name.compareToIgnoreCase(c.name);
				}
			}	
		}
		return result;
	}
	*/
}


