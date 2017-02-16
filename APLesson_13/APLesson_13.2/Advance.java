public class Advance extends Ticket
{
	private int daysleft;
	
	public Advance()
	{
		super();
	}
	
	public Advance(int d)
	{
		super();
		daysleft = d;
	}
	
	public double getprice()
	{
		if(daysleft >= 10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
}