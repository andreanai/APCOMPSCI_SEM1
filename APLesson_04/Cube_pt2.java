import java.util.Scanner;
public class Cube_pt2
{
	static double side;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the side length of your cube:");
		side = kb.nextDouble();
		
		print(calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return 6*side*side;
	}
	public static void print(double sa)
	{
		System.out.printf("The surface area of a cube with a side length of "+ side+" is %.5f.", sa);
	}
}