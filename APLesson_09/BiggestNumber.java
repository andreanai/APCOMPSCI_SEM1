import java.util.*;
public class BiggestNumber
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		int [] array = new int[10];
		fillArray(array);
		System.out.println("For the following numbers...");
		getBiggest(array);
		System.out.println(printArray(array));
		System.out.println("The biggest number is: " + getBiggest(array));
	}
	public static void fillArray(int[] array)
	{
		for(int i=0; i<array.length; i++)
		{
			array[i] = (int)(Math.random()*100+1);
		}
	}
	public static String printArray(int[]array)
	{
		for(int number : array)
		{
			System.out.print(number + " ");
		}
		return " ";
	}
	public static int getBiggest(int[]array)
	{
		int max = 0;
		for(int number : array)
		{
			if(number>max)
			{
				max = number;
			}
		}
		return max;
	}
}	