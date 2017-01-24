import java.util.*;

public class CarDriver
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter color of paint:");
		String paint = kb.nextLine();
		
		System.out.println("Enter the interior material:");
		String interior = kb.nextLine();
		
		System.out.println("Enter the engine type:");
		String engine = kb.nextLine();
		
		System.out.println("Enter the tire type:");
		String tires = kb.nextLine();
		
		Car object = new Car(paint, interior, engine, tires);
		
		System.out.println("*************************\nYour vehicle is ready......\nPaint:\t" + object.getPaint() + "\nInterior:\t" + object.getInterior() + "\nEngine:\t" + object.getEngine() + "\nTires:\t" + object.getTires());
		
	}
}