import java.util.*;
public class AvgNumbers
{
	static int avg;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[]numbers = new int[10];
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100+1);
		}
		System.out.println("Numbers...");
		for( int number : numbers)
		{
			System.out.print(number + " ");
		}
		System.out.println(" ");
		System.out.println("The average of the numbers above is " + average(numbers));
	}
	public static double average(int[]numbers)
	{
		double avg = 0;
		for(int number : numbers)
		{
			avg += number;
		}
		return avg/10;
	}
}