import java.util.Scanner;

public class RudeAI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Hi, my name is RudeAI." +"\n" +"I'd like to ask you a few questions." +"\n"+ "What is your name?");
		
		String name = keyboard.next();
		
		System.out.println("Hmm... " + name + " is a stupid name");
		
		System.out.println("How old are you?");
		
		int age = keyboard.nextInt();
		
		System.out.println("Really? You're " + age + "? " + "I would have guessed closer to 10");
		
		System.out.println("What do you do for fun?");
		
		String fun = keyboard.next();
		
		System.out.println("Only people with no friends " + fun + "...loser");
		
		System.out.println("What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println("Yikes! Anyone who listens to " + music + " is an idiot");
		
		System.out.println("How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + "? I feel bad for the people who have to be related to you.");
		
		System.out.println("What do you want to be when you grow up?");
		
		String job = keyboard.next();
		
		System.out.println("A " + job + "? That's a sad sad life if you ask me." + "\n" + "I'm only messing around, you're not so bad.");
	}
}