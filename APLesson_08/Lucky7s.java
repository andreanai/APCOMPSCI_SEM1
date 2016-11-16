import java.util.*;
public class Lucky7s
{
	static int number;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		number = kb.nextInt();
		System.out.println("There are " + luck(number) + " sevens in your number");
	}
	public static int luck(int number)
	{
		if (number>0)
		{
			if (number%10 ==7)
			{
				return 1+luck(number/10);
			}
			else 
			{
				return 0 + luck(number/10);
			}
		}	
		else
		{
			return 0;
		}
	}
}	