import java.util.Scanner;
public class Circle_pt2
{
	static double r; 
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the radius of your circle:");
		r = kb.nextDouble();
		
		print(calcArea(r));
	}
	public static double calcArea(double r)
	{
		return r*r*3.14159;
	}
	public static void print(double area)
	{
		System.out.printf("The area of a circle with a radius of "+r+" is %.5f.", area);
	}
}