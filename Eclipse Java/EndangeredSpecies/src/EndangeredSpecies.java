import java.util.*;

public class EndangeredSpecies {

	static Scanner scan = new Scanner(System.in);
	private String name;
	private int currentpopulation;
	private double growthrate;
	private int numberofyears;
	private double projectedpopulation;

	public EndangeredSpecies(String sname, int scurrentpopulation, double sgrowthrate, int snumYears, double sproPop) {
		name = sname;
		currentpopulation = scurrentpopulation;
		growthrate = sgrowthrate;
		numberofyears = snumYears;
		projectedpopulation = sproPop;	
		

	}
	
	public String toString()
	{
		return ("The endagered specie is: "+ name + ". The current population is: "+ currentpopulation + ". Growth rate is: "+ 
	growthrate + ". Number of years is: " + numberofyears + ". Projected population is: " + projectedpopulation +".");
	}
	
	public String getName() {
		return name;
	}
	

	public int getCurrentPopulation() {
		return currentpopulation;
	}
	

	public double getGrowthRate() {
		return growthrate;
	}
	

	public int getNumberofyears(){
		
		return numberofyears;
	}
	

				

	

	public double getProjectedPopulation() {
				

		double projectedpopulation = getCurrentPopulation() * Math.exp(getGrowthRate()*getNumberofyears());
		
		projectedpopulation = Math.round(projectedpopulation);

		return projectedpopulation;
		

	}
}
