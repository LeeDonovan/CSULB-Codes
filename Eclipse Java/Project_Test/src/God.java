
public class God 
{
	private String name;
	private int health;
	private int mana;
	private int level;
	private int power;
	private int defense;
	
	
	public God(String n, int h, int m, int l, int p, int d) 
	{ 
		name = n;
		health = h;
		mana = m;
		level = l;
		power = p;
		defense = d;
	}
	public String getName()
	{
		return name;
	}
	public int attack() 
	{
		return power; 
	}
	
	public boolean isDead()
	{
		if (health == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void deductMana(int m)
	{
		mana = mana - m;
	}
	public void godHit(int p)
	{
		health = health - p;
	}
	
}
