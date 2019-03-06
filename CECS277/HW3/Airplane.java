public class Airplane extends Vehicle
{
	private String name;
	private int costperHour;
	private Engine engine;
	private String fuel;
	final int Speed = 500; // milesperHour
	public Airplane()
	{
		this("No name Airplane", 500, new Engine());
	}
	public Airplane(String airplaneName)
	{
		this(airplaneName, 500, new Engine());
	}
	public Airplane(String airplaneName, int airplanecostperHour)
	{
		this(airplaneName, airplanecostperHour, new Engine());
	}
	public Airplane(String airplaneName, int airplanecostperHour, Engine airplaneEngine)
	{
		name = airplaneName;
		costperHour = airplanecostperHour;
		engine = airplaneEngine;
	}
	public Airplane(Airplane y)
	{
		name = y.name;
		costperHour = y.costperHour;
		engine = y.engine;
		fuel = y.fuel;
	}
	public int getTripCost(int numofMiles)
	{
		int cost = 0;
		cost = (costperHour * (numofMiles/Speed));
		return cost;
	}
	public boolean equals(Object other)
	{
		if(!(other instanceof Airplane)) return false;
		else
		{
			Airplane a = (Airplane)other;
			if (engine == a.engine && costperHour == a.costperHour)
				return true;
			else
				return false;
		}
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "Airplane: Name = " + name + ", " + engine + ", Cost per hour = " + costperHour;
	}
}
