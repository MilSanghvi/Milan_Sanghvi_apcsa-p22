public class Zombie implements Monster
{
	private String name;
	private int size;
	
	public Zombie()
	{
		name = "no name";
		size = 0;
	}
	
	public Zombie(String s, int n)
	{
		name = s;
		size = n;
	}
	
	public int getHowBig()
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		return size > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return size < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}
	
	public String toString()
	{
		return this.getName() + " " + this.getHowBig();
	}
}
