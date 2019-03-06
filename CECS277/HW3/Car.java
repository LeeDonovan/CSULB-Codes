public class Car extends Vehicle
{
    private String name;
    private int costPerGall;
    private Engine engine;
    private String fuel;
    private Radio radio;
    private int mpg = 3;

    public Car()
	{
		this("No name ", 20, new Engine(), new Radio());
	}
	public Car(String carName)
	{
		this(carName, 20, new Engine(), new Radio());
    }
    public Car(String CarName, int CarcostperHour)
	{
		this(CarName, CarcostperHour, new Engine(), new Radio());
	}
	public Car(String CarName, int CarcostperHour, Engine CarEngine, Radio CarRadio)
	{
		name = CarName;
		costPerGall = CarcostperHour;
        engine = CarEngine;
        radio = CarRadio;
	}
	public Car(Car x)
	{
		name = x.name;
		costPerGall = x.costPerGall;
		engine = x.engine;
        fuel = x.fuel;
        radio = x.radio;
    }

    public int getTripCost(int numofMiles)
	{
		int cost = 0;
		cost = (numofMiles/costPerGall)* mpg;
		return cost;
    }
    
    public boolean equals(Object other)
	{
		if(!(other instanceof Car)) return false;
		else
		{
			Car a = (Car)other;
			if (engine == a.engine && costPerGall == a.costPerGall)
				return true;
			else
				return false;
		}
	}
	public String getName()
	{
		return name;
    }
    
    public Radio setRadio(Radio uRadio)
    {
		this.radio = uRadio;
		return radio;
    }

    public String toString()
	{
        return "Car: Name = " + name + ", " + engine + ", Cost per Gallon = " + 
        costPerGall + ", Radio: " + radio;
	}
}