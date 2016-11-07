import java.util.*;
public class CountbyX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int number = kb.nextInt();
		System.out.println("Please enter the number you wish to count by: ");
		int counter = kb.nextInt();
		for(int i = 0; i <= number; i+=counter)
		{
			System.out.print(i + " ");
		}
	}
}