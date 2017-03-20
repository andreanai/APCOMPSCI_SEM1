import java.util.*;
public class Car implements Location
{
	private double[] location = new double[2];
	private final int id;
	
	public Car()
	{
		id = (int)(Math.random()*1000000) + 1;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void move(double x, double y)
	{
		location[0] += x;
		location[1] += y;
	}
	
	public double[] getLoc()
	{
		return location;
	}
	
	
}