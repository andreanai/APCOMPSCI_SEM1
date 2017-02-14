import java.util.*;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a list of toys: ");
		String list = kb.nextLine();
		ToyStore store = new ToyStore(list);
		System.out.println(store);
		System.out.println(store.getmostfrequentToy());
		System.out.println(store.getmostfrequentType());
	}
}
