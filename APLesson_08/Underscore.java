import java.util.*;
public class Underscore
{
	static String sentence;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		System.out.println(replace(sentence));
	}
	public static String replace(String sentence)
	{
		if(sentence.indexOf(" ") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf(" "))+ "_" + sentence.substring(sentence.indexOf(" ") + 1);
			return replace(sentence);
		}
		else
		{
			return sentence;
		}
	}
}