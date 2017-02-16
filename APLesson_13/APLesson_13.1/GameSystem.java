import java.util.*;

public class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = " ";
		this.serialNo = 0;
	}
	
	public GameSystem(String p)
	{
		this.platform = p;
		this.serialNo = (int)(Math.random()*10000000)+1;
	}
	
	public String getplatform()
	{
		return this.platform;
	}
	
	public int getserialNo()
	{
		return this.serialNo;
	}
}
