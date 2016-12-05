import java.util.*;
public class FindtheZs
{
	static Scanner kb = new Scanner(System.in);
	static String[]words = new String[5];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words...");
		System.out.println(printArray());
		System.out.println("Only " + hasZs() + "contain(s) the letter Z");
	}
	public static void fillArray()
	{
		System.out.println("Please enter five words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static String printArray()
	{
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		return " ";
	}
	public static String hasZs()
	{
		String Zs = " ";
		for (String word : words)
		{
			if(word.indexOf("z")>=0)
			{
				Zs += word + ", ";
			}
		}
		return Zs;
	}
}