import java.util.ArrayList;


public class AssignmentOne 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Airplane a1 = new Airplane();
		Airplane a2 = new Airplane("a2");
		Airplane a3 = new Airplane("a3", 1000);
		Airplane a4 = new Airplane("a4", 200, new Engine("GE", "kerosine"));
		Airplane a5 = new Airplane(a1);
		
		Car c1 = new Car();
		Car c2 = new Car("c2");
		Car c3 = new Car("c3", 100);
		Car c4 = new Car("c4", 200, new Engine("Ford", "Gas"));
		Car c5 = new Car(c1);
		Radio r1 = new Radio("Upgraded Radio");
		c1.setRadio(r1);
		
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(a1);
		vehicles.add(a2);
		vehicles.add(a3);
		vehicles.add(a4);
		vehicles.add(a5);
		vehicles.add(c1);
		vehicles.add(c2);
		vehicles.add(c3);
		vehicles.add(c4);
		vehicles.add(c5);
				
		for(Vehicle v : vehicles)
		{
			sop("\n" + v);
			sop("Name: " + v.getName());
			sop("3000 Mile Trip Cost: " + v.getTripCost(3000));
		}
		
		sop("");
		Engine e1 = new Engine();
		Engine e2 = new Engine("Honda");
		Engine e3 = new Engine("GMC", "Water");
		
		sop("Engine e1: " + e1);
		sop("Engine e2: " + e2);
		sop("Engine e3: " + e3);
		
		sop("");
		sop("a1 == a1? " + a1.equals(a1));
		sop("a1 == a2? " + a1.equals(a2));
		sop("a1 == a5? " + a1.equals(a5));
		sop("c1 == c1? " + c1.equals(c1));
		sop("c1 == c5? " + c1.equals(c2));
		sop("a1 == c1? " + a1.equals(c1));
	}

	static private void sop(String s)
	{
		System.out.println(s);
	}
}
