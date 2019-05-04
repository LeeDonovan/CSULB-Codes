
public abstract class DessertItem implements Comparable<DessertItem>{

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
  public abstract int getCalorie();

	@Override
	public String toString()
	{
		return name;
	}
	public interface Comparable {
		public int compareTo(DessertItem other);
	}
	public static DessertItem max(DessertItem o1, DessertItem o2)
	{
		if (((Comparable)o1).compareTo(o2) > 0)
			return o1;
		else 
			return o2;
	}
	public int compareTo(DessertItem o)
	{
		if (this.getCalorie() > o.getCalorie())
			return 1;
		else if (this.getCalorie() < o.getCalorie())
			return -1;
		else
			return 0;
	}
	public boolean equals(DessertItem other)
	{
		if (this.name.equals(other.name))
			return true;
		else
			return false;
	}
	
}


