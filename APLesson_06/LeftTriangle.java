import java.util.*;
public class LeftTriangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String word = kb.nextLine();
		for (int i = 0; i<=word.length(); i++)
			System.out.println(word.substring(i));
	}
}