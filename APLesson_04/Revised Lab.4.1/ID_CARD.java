import java.util.Scanner;
public class ID_CARD
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		ID_CARD form = new ID_CARD();
	
		System.out.println("Enter your first name:");
		String first_name = kb.next();
		System.out.println("Enter your last name:");
		String last_name = kb.next();
		System.out.println("Enter your school:");
		kb.nextLine();
		String school = kb.nextLine();
		System.out.println("Enter your grade:");
		String grade = kb.next();
		System.out.println("Enter the school year:");
		kb.nextLine();
		String school_year= kb.nextLine();
		System.out.println("Enter your age:");
		String age = kb.nextLine();
		System.out.println("\n  ********************************************");
		form.id(school, school_year);
		form.id(first_name, last_name);
		form.id(grade, age);
		System.out.println("  ********************************************");
	}
	
	public void id(String a, String b)
	{
		
		System.out.printf("* %25s        %10s *\n", a, b);
	}
	
}