import java.util.*;
public class MPH
{
	private int distance, hours, minutes;
	private double mph;
	
	public MPH()
	{
		distance = 0;
		hours = 0;
		minutes = 0;
		mph = 0;
	}
	
	public MPH(int d, int hr, int min)
	{
		distance = d;
		hours = hr;
		minutes = min;
		mph = 0;
	}
	
	public void setvalues(int d, int hr, int min)
	{
		distance = d;
		hours = hr;
		minutes = min;
	}

	public int getdistance()
	{
		return distance;
	}
	
	public int gethours()
	{
		return hours;
	}
	
	public int getminutes()
	{
		return minutes;
	}
	
	public double getMPH()
	{
		mph = Math.round(distance / (hours+minutes / 60.0));
		return mph;
	}
}