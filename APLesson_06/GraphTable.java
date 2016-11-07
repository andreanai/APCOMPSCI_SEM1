import java.util.*;
public class GraphTable
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int integer = kb.nextInt();
		System.out.println("Please enter table length: ");
		int table = kb.nextInt();
		for (int i = 1; i<=table; i++)
			System.out.printf("%3d  | %5d\n", i, i*table);
	}
}