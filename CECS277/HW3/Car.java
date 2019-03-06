
public class Car extends Vehicle
{
	private String name;
	private int milesperGallon;
	private Engine engine;
	private Radio radio;
	private String fuel;
	final int fuelcostperGallon = 3;
	public Car()
	{
		this("No name Car", 20, new Engine("Chevy", "Gas"));
	}
	public Car(String carName)
	{
		this(carName, 20, new Engine("Chevy", "Gas"));
	}
	public Car(String carName, int carmilesperGallon)
	{
		this(carName, carmilesperGallon, new Engine("Chevy", "Gas"));
		
	}
	public Car(String carName, int carmilesperGallon, Engine carEngine)
	{
		name = carName;
		milesperGallon= carmilesperGallon;
		engine = carEngine;
		radio = new Radio();
	}
	public Car(Car c)
	{
		name = c.name;
		milesperGallon = c.milesperGallon;
		engine = c.engine;
		fuel = c.fuel;
		radio = c.radio;
	}
	public void setRadio(Radio carRadio)
	{
		radio = carRadio;
	}
	public int getTripCost(int numofMiles)
	{
		int cost = 0;
		cost = ((numofMiles / milesperGallon) * fuelcostperGallon);
		return cost;
	}
	public boolean equals(Object other)
	{
		if(!(other instanceof Car)) return false;
		else
		{
			Car c = (Car)other;
			if (engine == c.engine && milesperGallon == c.milesperGallon)
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
		return "Car: Name = " + name + ", " + engine + ", MPG = " + milesperGallon + ", " + radio;
	}
}
