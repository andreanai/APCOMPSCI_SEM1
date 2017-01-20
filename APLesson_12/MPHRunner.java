import java.util.*;
public class MPHRunner	
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter distance traveled: ");
		int distance = kb.nextInt();
		System.out.println("Please enter hours elapsed: ");
		int hours = kb.nextInt();
		System.out.println("Please enter minutes elapsed: ");
		int minutes = kb.nextInt();
		
		MPH object = new MPH(distance, hours, minutes);
		System.out.println(object.getdistance() + " miles in " + object.gethours() + " hours and " + object.getminutes() + "minutes = " + object.getMPH() + "miles per hour");
		
		object.setvalues(500, 6, 40);
		System.out.println(object.getdistance() + " miles in " + object.gethours() + " hours and " + object.getminutes() + "minutes = " + object.getMPH() + "miles per hour");
	}
}