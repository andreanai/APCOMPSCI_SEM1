public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	
	public StudentAdvance(int d)
	{
		super(d);
	}
	
	public double getprice()
	{
		return super.getprice()/2;
	}
	
	public String toString()
	{
		return "\n Serial #: " + getserialNo() + "\n Price: " + getprice() + "\n*STUDENT ID REQUIRED*";
	}
}