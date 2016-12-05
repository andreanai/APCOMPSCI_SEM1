import java.util.*;
public class GetOdds
{
	static Scanner kb = new Scanner(System.in);
	public static void main(String[]args)
	{
		int [] array = new int[10];
		fillArray(array);
		System.out.println("For the following numbers...");
		getOdds(array);
		System.out.println(printArray(array));
		System.out.println("These are all the odd numbers: \n" + getOdds(array));
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
	public static String getOdds(int[]array)
	{
		String odds = " "; 
		for(int number : array)
		{
			if (number%2 ==1)
			{
				odds+=number + " ";
			}
		}
		return odds;
	}
}