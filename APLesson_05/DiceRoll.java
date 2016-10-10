import java.util.Random;
public class DiceRoll
{
	static int your_roll;
	static int computer_roll;
	public static void main(String[]args)
	{
		Random rand = new Random();
		your_roll = rand.nextInt(6)+1;
		System.out.println("You rolled a " + your_roll);
		computer_roll = rand.nextInt(6)+1;
		System.out.println("The computer rolled a " + computer_roll);
		winner();
	}
	public static void winner()
	{
		if (your_roll==computer_roll)
			System.out.println("You and the computer are tied!");
		if (your_roll<computer_roll)
			System.out.println("The winner is the computer!");
		if (your_roll>computer_roll)
			System.out.println("The winner is you!");
	}
}
