import java.util.*;
public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Candy Land Adventure Game!\nLet's begin!");
		System.out.println("Would you like to take the chocolate river or gumball road?");
		String choice1 = kb.nextLine();
		if (choice1.equals("chocolate river"))
			System.out.println("Oh no! You ran into the Marshmallow Monster! Stay and fight or run away?");
			String choice2a = kb.nextLine();
			if (choice2a.equals("stay and fight"))
				System.out.println("You defeated the monster! However you lost your way down the river! Ask the licorice fairy for help or try to find your own way?");
				String choice3aa = kb.nextLine();
				if (choice3aa.equals("ask the licorice fairy for help"))
					System.out.println("Yay! The licorice fairy showed you the way and you made it to the top of Candy Mountain!\nYou win!!!");
				else if (choice3aa.equals("find my own way"))
					System.out.println("Oh no! You couldn't find your way to the top of Candy Mountain!\nYou lose!");
			else if (choice2a.equals("run away"))
				System.out.println("The monster is starting to gain speed! Do you try to hide in the candy cane forest or keep running?");
				String choice3ab = kb.nextLine();
				if (choice3ab.equals("hide in the candy cane forest"))
					System.out.println("Oh no! The Marshmallow Monster found you and ate you!\nYou lost!");
				else if (choice3ab.equals("keep running"))
					System.out.println("Yay! You were faster than the monster and made it to the top of Candy Mountain!\nYou win!!!");
		else if (choice1.equals("gumball road"))
			System.out.println("Oh no! You came across the peppermint bark valley! Try to jump over or find another way around?");
			String choice2b = kb.nextLine();
			if (choice2b.equals("try to jump over"))
				System.out.println("You made it across! Now do you take the jolly rancher trolley or climb up the rocky road cliffs?");
				String choice3ba = kb.nextLine();
				if (choice3ba.equals("take the jolly rancher trolley"))
					System.out.println("Yikes! The trolley got derailed and you got stuck in the maple syrup lake!\nYou lose!");
				else if (choice3ba.equals("climb up the rocky road cliffs"))
					System.out.println("Congrats! You safely climbed the cliffs and made it to the top of Candy Mountain!\nYou win!!!");
			else if (choice2b.equals("find another way around"))
				System.out.println("You come across tongue twister twizzler. Try to answer his riddle or run through the cocoa powder clouds?");
				String choice3bb = kb.nextLine();
				if (choice3bb.equals("try to answer his riddle"))
					System.out.println("Congrats! You answered correctly and were granted passage to the top of Candy Mountain!\nYou win!!!");
				else if (choice3bb.equals("run through the cocoa powder clouds"))
					System.out.println("Sorry! You entered a food coma and can't make it to the top.\nYou lose!");
	}
}