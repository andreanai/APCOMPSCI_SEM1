public abstract class Ticket
{
	private int serialNo;
	private double price;
	
	public Ticket()
	{
		serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public int getserialNo()
	{
		return serialNo;
	}
	
	public abstract double getprice();
	
	public String toString()
	{
		return "\n Serial #: " + this.serialNo + "\n price: " + this.getprice();
	}
}