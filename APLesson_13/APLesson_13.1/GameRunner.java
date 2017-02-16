public class GameRunner
{
	public static void main(String[]args)
	{
		Xbox xbox = new Xbox("XBox");
		System.out.println(xbox);
		
		Playstation ps = new Playstation("PlayStation");
		System.out.println(ps);
		
		PC pc = new PC("PC");
		System.out.println(pc);
	}
}