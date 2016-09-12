import java.util.Scanner;

public class Circle_Circumference
{
	public static void main(String[]args)
	
	{
		Scanner keyboard = new Scanner(System.in);
	
		System.out.println("What is the radius of your circle?");
	
		int radius = keyboard.nextInt();
		
		double circumference = (2*3.14159*radius);
	
		System.out.println("The circumference of your circle is " + circumference);
	}
}