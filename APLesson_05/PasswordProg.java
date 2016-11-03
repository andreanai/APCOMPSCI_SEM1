import java.util.*;
public class PasswordProg
{
	static String username;
	static String password;
	public static void main(String[]args)
	{
		passCheck();
	}
	public static void passCheck()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your username:");
		username = kb.nextLine();
		System.out.println("Please enter your password:");
		password = kb.nextLine();
		if (username.equals("CompSci2016")&&password.equals("computers"))
		{
			System.out.println("Access Granted");
		}
		else if (!username.equals("CompSci2016")&&password.equals("computers"))
		{
			System.out.println("Username is incorrect\n");
			passCheck();
		}	
		else if (username.equals("CompSci2016")&&!password.equals("computers"))
		{
			System.out.println("Password is incorrect\n");
			passCheck();
		}	
		else if (!username.equals("CompSci2016")&&!password.equals("computers"))
		{
			System.out.println("Both username and password are incorrect\n");
			passCheck();
		}
	}
}
