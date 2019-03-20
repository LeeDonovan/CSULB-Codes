import java.util.*;

public abstract class DessertItem implements Comparable<DessertItem> {

    protected String name;
  
  /**
   * Null constructor for DessertItem class
   */
    public DessertItem() {
      this("");
    }
  /**
   * Initializes DessertItem data
   */
    public DessertItem(String name) {
        this.name = name;
        }
  /**
   * Returns name of DessertItem
   * @return name of DessertItem
   */
    public final String getName() {
      return name;
    }
  /**
   * Returns cost of DessertItem
   * @return cost of DessertItem
   */
    public abstract double getCost();

    public int compareTo(DessertItem other)
    {
      if(this.name.equals(other.name))
      return(this.name.compareTo(other.name));
      else
      return(this.name.compareTo(other.name));
    }

    public boolean equals(DessertItem other)
    {
      if (this.name.equals(other.name))
      return true;
      else
      return false;
    }

    public String toString()
    {
      return name;
    }

    public static void main (String [] args){
      DessertItem d1 = new DessertItem("IceCream");
      DessertItem d2 = new DessertItem("Cookie");
      System.out.println("Compare d1 to d2: "+ d1.compareTo(d2));
    }
  
  }

