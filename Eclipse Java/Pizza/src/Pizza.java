
public class Pizza {
	private String sizeOfPizza;
	private String thicknessOfPizza;
	private String toppingOnPizza;
	private int numberOfPizza;
	
	public Pizza() {
		sizeOfPizza="Medium";
		thicknessOfPizza="Pan";
		toppingOnPizza= "Bacon";
		numberOfPizza=1;
	}
	public Pizza(int nop, String thic, String top, String size) {
		numberOfPizza = nop;
		thicknessOfPizza=thic;
		toppingOnPizza = top;
		sizeOfPizza = size;
	}
	public int getnumberOfPizza() {
		return numberOfPizza;
	}
	public String getsizeOfPizza() {
		return sizeOfPizza;
	}
	public String getthicknessOfPizza() {
		return thicknessOfPizza;
	}
	public String gettoppingOnPizza() {
		return toppingOnPizza;
	}
	public void addPizza() {
		numberOfPizza = numberOfPizza+1;
	}
	public boolean addTopping(String top) {
		toppingOnPizza = top;
		return true;
	}
	public void setThickPizza(String thic) {
		thicknessOfPizza = thic;
	}
	public String toString() {
		return("You have ordered " + numberOfPizza +" pizza. The thickness of choice you chose is "
				+ thicknessOfPizza + " with a size " + sizeOfPizza + ". The topping you also chose"
					+	" was "+ toppingOnPizza +".");
	}
	public static void main(String [] args) {
		Pizza BYOP = new Pizza();
		System.out.println("The new thickness is: " + BYOP);
		Pizza BYOP2 = new Pizza(2, "Medium", "Deep Dish","Chicken");
		System.out.println("Pizza 2 is: " + BYOP2);
		BYOP.setThickPizza("thin crust");
		System.out.println("The thickness of the pizza one is now " + BYOP.getthicknessOfPizza());
		BYOP.set
	}
}
