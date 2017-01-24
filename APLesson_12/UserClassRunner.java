import java.util.*;

public class UserClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name:");
		String first = kb.next();
		System.out.println("Please enter your last name:");
		String last = kb.next();
		
		System.out.println("Would you like to use a public avatar?");
		String choice = kb.next();
		if(choice.equals("no"))
		{
			UserClass pH1 = new UserClass(first, last);
			System.out.println(pH1);
		}
		if(choice.equals("yes"))
		{
			System.out.println("Enter your avatar name:");
			String avatar = kb.next();
			UserClass pH2 = new UserClass(first, last, avatar);
			System.out.println(pH2);
		}
	}
}