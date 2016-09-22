import java.util.Scanner;

public class Subwoofer_Boxes
{
	public static void main(String[]args)
	{
		Subwoofer_Boxes volume = new Subwoofer_Boxes();
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter height in inches:");
		double height = kb.nextDouble();
		System.out.println("Enter width in inches:");
		double width = kb.nextDouble();
		System.out.println("Enter length in inches:");
		double length = kb.nextDouble();
		double volume_feet = volume.calcVol( height, width, length);
		System.out.printf("The volume of the Subwoofer Box in feet is\n%10.2f",volume_feet);
	}
	public double calcVol(double height, double width, double length)
	{
		double volume_inches = height*length*width;
		return (volume_inches/1728);
	}
}