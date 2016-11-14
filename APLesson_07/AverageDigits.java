import java.util.*;
public class AverageDigits
{
	static int number;
	static int digits = 0;
	static int avg = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		avgDigits();
		System.out.println("The average of the digits in " + number + " is " + avg);
	}
	public static void avgDigits()
	{
		int num = number;
		while ( num > 0)
		{
			digits += 1;
			avg += num % 10;
			num /= 10;
		}	
		avg = avg/digits;
	}
}