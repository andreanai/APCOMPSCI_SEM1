import java.util.Scanner;
public class Average_pt2
{
	static double num1;
	static double num2;
	static double num3;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1:");
		num1 = kb.nextDouble();
		System.out.println("Enter number 2:");
		num2 = kb.nextDouble();
		System.out.println("Enter number 3:");
		num3 = kb.nextDouble();
		
		print(average(num1, num2, num3));
	}
	public static double average(double num1, double num2, double num3)
	{
		return (num1+num2+num3)/3;
	}
	public static void print(double avg)
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %.5f .", avg);
	}
}