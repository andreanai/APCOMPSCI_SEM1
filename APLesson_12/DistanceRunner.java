import java.util.*;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a value for x1:");
		int xOne = kb.nextInt();
		System.out.println("Please enter a value for y1:");
		int yOne = kb.nextInt();
		System.out.println("Please enter a value for x2: ");
		int xTwo = kb.nextInt();
		System.out.println("Please enter a value for y2:");
		int yTwo = kb.nextInt();
		
		Distance object = new Distance(xOne, yOne, xTwo, yTwo);
		System.out.println("The distance between (" + object.getxOne() + ", " + object.getyOne() + ") and (" + object.getxTwo() + ", " + object.getyTwo() + ") is " + object.getdistance());
		object.setvalues(2,5,6,1);
		System.out.println("The distance between (" + object.getxOne() + ", " + object.getyOne() + ") and (" + object.getxTwo() + ", " + object.getyTwo() + ") is " + object.getdistance());
	}
}