import java.util.*;
public class ReverseNumber
{
	static int number;
	static int reverse = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		reverse();
		System.out.println("Your number reversed is " + reverse);
	}
	public static void reverse()
	{
		int num = number;
		while ( num > 0)
		{
			int a = num % 10;
			reverse *= 10;
			reverse += a;
			num /= 10;
		}
	}
}