import java.util.*;
public class ToyRunner
{
	public static void main(String[]args)
	{
		AFigure hero = new AFigure("batman");
		Car fast = new Car("ferrari");
		
		System.out.println(hero);
		System.out.println(fast);
	}
}