import java.util.*;
public class Toyota implements Location
{
	private String location;
	
	public Toyota()
	{
		location = " ";
	}
	
	public Toyota(String l)
	{
		location = l;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(String l)
	{
		location = l;
	}
	
	public double[] getLoc()
	{
		double[] Location = new double[2];
		String[] L = location.split(", ");
		Location[0] = Double.parseDouble(L[0]);
		Location[1] = Double.parseDouble(L[1]);
		return Location;
	}
	
}