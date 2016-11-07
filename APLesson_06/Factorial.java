import java.util.*;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = kb.nextInt();
		int factorial = 1;
		for (int i = 1; i<= number; i++)
		{
			factorial = i*factorial;
		}	
		System.out.println("The factorial of "+ number +" is " + factorial);
	}
}