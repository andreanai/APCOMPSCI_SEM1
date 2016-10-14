import java.util.*;
public class BMI_Pt2
{
	static double height;
	static double weight;
	static double BMI;
	static String condition;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your height in inches: ");
		height = kb.nextDouble();
		System.out.println("Please enter your weight in lbs: ");
		weight = kb.nextDouble();
		calcBMI();
		calcCondition();
	}
	public static void calcBMI()
	{
		BMI = (703*weight)/(height*height);
	}
	public static void calcCondition()
	{
		if (BMI>39.9)
			condition = "Morbidly_Obese";
		else if (BMI>=35)
			condition = "Very_Obese";
		else if (BMI>=29.9)
			condition = "Obese";
		else if (BMI>=25)
			condition = "Overweight";
		else if (BMI>=18.5)
			condition = "Normal";
		else
			condition = "Underweight";
		System.out.println("You are " + condition);
	}
}