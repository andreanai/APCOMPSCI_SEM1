import java.util.*;
public class GameGun
{
	static int bulletCount;
	static int ClipSize = 16;
	static int shotCount;
	static String[]clip;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[ClipSize];
		resetClip();
		while(bulletCount>0 || shotCount>0)
		{
			System.out.println("Action: ");
			String action = kb.next();
			if (action.equals("R"))
			{
				reload();
			}
			else if (action.equals("S"))
			{
				shotCount++;
				System.out.println(shoot());
			}
			System.out.println(printClip());
		}
		if(bulletCount == 0)
		{
			System.out.println("Out of Bullets!!!");
		}
	}
	public static void resetClip()
	{
		for(int i = 0; i<clip.length; i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount - 1] = "[]";
			shotCount-=1;
			return "Boom!!!";
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= ClipSize)
		{
			bulletCount-=ClipSize;
			shotCount = ClipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static String printClip()
	{
		String output = " ";
		output+= "Bullets:	" + bulletCount + "\nClip:		";
		for (int i = 0; i < ClipSize; i++)
		{
			output+= clip[i];
		}
		return output;
	}
}