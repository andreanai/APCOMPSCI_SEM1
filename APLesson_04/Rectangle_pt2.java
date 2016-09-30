import java.util.Scanner;
public class Rectangle_pt2
{
	static double length;
	static double width;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		length = kb.nextDouble();
		System.out.println("Enter the width of the rectangle:");
		width = kb.nextDouble();
		
		print(calcPerim(length, width));
	}
	public static double calcPerim(double length, double width)
	{
		return 2*(length+width);
	}
	
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f sq ft around.", perimeter);
	}
}