import java.util.Scanner;
public class Average
{
	static int num1;
	static int num2;
	static int num3;
	static double avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1:");
		num1 = kb.nextInt();
		System.out.println("Enter number 2:");
		num2 = kb.nextInt();
		System.out.println("Enter number 3:");
		num3 = kb.nextInt();
		
		average();
		print();
	}
	public static void average()
	{
		avg = (num1+num2+num3)/3;
	}
	public static void print()
	{
		System.out.printf("The average of "+num1+", "+num2+", and "+num3+" is %.5f .", avg);
	}
}