import java.util.*;
public class Box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String word = kb.nextLine();
		for(int a = 0; a<word.length(); a++)
		{
			System.out.println(word);
		}	
	}
}