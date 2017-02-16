public class PC extends GameSystem
{
	public PC()
	{
		super();
	}
	
	public PC(String a)
	{
		super(a);
	}
	
	public String systeminput()
	{
		return "Keyboard and Mouse";
	}
	
	public String toString()
	{
		return "\n Platform: " + super.getplatform() + "\n Serial #: " + super.getserialNo() + "\n System Input: " + systeminput();
	}
}