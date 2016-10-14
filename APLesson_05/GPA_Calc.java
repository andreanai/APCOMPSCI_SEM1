import java.util.*;
public class GPA_Calc
{
	static String class1;
	static String class2;
	static String class3;
	static String class4;
	static String class5;
	static String class6;
	static String class7;
	static String grade1;
	static String grade2;
	static String grade3;
	static String grade4;
	static String grade5;
	static String grade6;
	static String grade7;
	static double GPA;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first class: ");
		class1 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade1 = kb.nextLine();
		System.out.println("Please enter your second class: ");
		class2 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade2 = kb.nextLine();
		System.out.println("Please enter your third class: ");
		class3 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade3 = kb.nextLine();
		System.out.println("Please enter your fourth class: ");
		class4 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade4 = kb.nextLine();
		System.out.println("Please enter your fifth class: ");
		class5 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade5 = kb.nextLine();
		System.out.println("Please enter your sixth class: ");
		class6 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade6 = kb.nextLine();
		System.out.println("Please enter your seventh class: ");
		class7 = kb.nextLine();
		System.out.println("Please enter your letter grade for that class: ");
		grade7 = kb.nextLine();
		
		double GradePoints = ((calcPoints(grade1)) + (calcPoints(grade2)) + (calcPoints(grade3)) + (calcPoints(grade4)) + (calcPoints(grade5)) + (calcPoints(grade6)) + (calcPoints(grade7)));
		GPA(GradePoints);
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		if (grade.equals("B"))
			return 3.0;
		if (grade.equals("C"))
			return 2.0;
		if (grade.equals("D"))
			return 1.0;
		return 0.0;
	}
	public static void GPA(double GradePoints)
	{
		GPA = GradePoints/7;
		System.out.println("Your GPA is " + GPA);
	}
}