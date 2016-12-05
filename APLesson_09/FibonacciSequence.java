import java.util.*;
public class FibonacciSequence
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		int [] sequence = new int[size];
		for(int i = 0; i<= sequence.length; i++)
		{
			if(i<=1)
			{
				sequence[i] = start;
			}
			else
			{
				sequence[i] = (sequence[i-1] + sequence[i-2]);
			}
			System.out.println(sequence[i] + " ");
		}
	}
}