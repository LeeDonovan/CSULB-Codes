
public class Engine 
{
	private String maker;
	private String fuel;
	public Engine()
	{
		this("PrattAndWhitney", "Gas");
	}
	public Engine(String engineMaker)
	{
		this(engineMaker, "Gas");
	}
	public Engine(String engineMaker, String engineFuel)
	{
		maker = engineMaker;
		fuel = engineFuel;
	}
	public Engine(Engine e)
	{
		maker = e.maker;
		fuel = e.fuel;
	}

	public boolean equals(Object other)
	{
		if(!(other instanceof Engine)) return false;
		else
		{
			Engine e= (Engine)other;
			if (maker == e.maker && fuel == e.fuel)
				return true;
			else
				return false;
		}
	}
	public String toString()
	{
		return "Engine: Maker = " + maker + ", Fuel = " + fuel;
	}
}
