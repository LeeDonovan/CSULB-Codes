
public abstract class Vehicle 
{
	public Vehicle()
	{
		this("No Name Vehicle");
	}
	
	public Vehicle(String name)
	{
		this(name, new Engine("GE", "Gas"));
	}
	
	public Vehicle(String name, Engine engine)
	{
		mName = name;
		mEngine = engine;
	}
	
	public String getName()
	{
		return mName;
	}
	
	public Engine getEngine()
	{
		return mEngine;
	}
	
	@Override
	public String toString()
	{
		return "Name = " + mName + ", " + mEngine;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(!(other instanceof Vehicle)) return false;
		else
		{
			Vehicle v = (Vehicle)other;
			return mEngine == v.mEngine;
		}
	}
	public abstract int getTripCost(int miles);
	
	private String mName;
	private Engine mEngine;
}



//public class Airplane extends Vehicle
/*{
    
	public Airplane()
	{
		
	}

	public Airplane(String x)
	{
		this.name = x;
	}

	public Airplane(String x, int c)
	{
		this.name = x;
		this.costPhr = c;
	}

	public Airplane(String x, int c, Engine e)
	{
		this.name = x;
		this.costPhr = c;
		this.engine = e;
    }
    public abstract int getTripCost(int miles);
	//public NameCostEngineAirplane(String x, int c, Engine e,) 
\*}



// class Car extends Engine
// {
	
// }


