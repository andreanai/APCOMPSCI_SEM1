public class Song
{
	public static void main(String[]args)
	{
		String line1 = "na na na na";
		String line2 = "hey hey hey";
		String line3 = "goodbye!";
		sing(line1, 2);
		sing(line2, 1);
		sing(line3, 1);
	
	}
	public static void sing(String line, int repetition)
	{
		for(int i = 1; i<= repetition; i++)
		{
			System.out.println(line);
		}
	}
}