public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	
	public Console(String p)
	{
		super(p);
	}
	
	public abstract String getcontroller();
	
	public String toString()
	{
		return "\n Platform: " + super.getplatform() + "\n Serial #: " + super.getserialNo() + "\n Controller: " + getcontroller();
	}
}