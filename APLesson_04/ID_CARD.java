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
		int age = kb.nextInt();
		
		form.id(school, school_year, first_name, last_name, grade, age);
	}
	
	public void id(String school, String school_year, String first_name, String last_name, String grade, int age)
	{
		System.out.println("  ********************************************");
		System.out.printf("* %25s        %10s", school, school_year);
		System.out.printf("\n* %25s        %10s", first_name, last_name);
		System.out.printf("\n* %25s        %10d", grade, age);
		System.out.println("\n  ********************************************");
	}
	
}