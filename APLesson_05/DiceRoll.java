import java.util.Random;
public class DiceRoll
{
	public static void main(String[]args)
	{
		Random rand = new Random();
		int your_roll = rand.nextInt(6)+1;
		System.out.println("You rolled a " + your_roll);
		int computer_roll = rand.nextInt(6)+1;
		System.out.println("The computer rolled a " + computer_roll);
		
		rollDice(your_roll, computer_roll);
	}
	public static void rollDice(int your_roll, int computer_roll)
	{
		if (your_roll>computer_roll)
			System.out.println("The winner is you!");
		if (your_roll<computer_roll)
			System.out.println("The winner is the computer!");
	}
}
