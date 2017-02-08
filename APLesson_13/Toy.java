import java.util.*;
public abstract class Toy
{
	private String name;
	private int count;
	
	public Toy()
	{
		this.name = " ";
		this.count = 1;
	}
	
	public Toy(String n)
	{
		this.name = n;
		this.count = 1;
		
	}
	
	public void setname(String n)
	{
		this.name = n;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setcount(int c)
	{
		this.count = c;
	}
	
	public int getcount()
	{
		return count;
	}
	
	public abstract String getType();
	
	public String toString()
	{
			return name + ": " + count;
	}
	
}