import java.util.*;

public class HumanDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter hair color:");
		String hair = kb.nextLine();
		
		System.out.println("Please enter eye color:");
		String eyes = kb.nextLine();
		
		System.out.println("Please enter skin color:");
		String skin = kb.nextLine();
		
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());
		
		object.setvalues("blonde", "baby blue", "medium tan");
		System.out.println("\nFriend's info...\nHair:\t" + object.getHair() + "\nEyes:\t" + object.getEyes() + "\nSkin:\t" + object.getSkin());

	}
}
