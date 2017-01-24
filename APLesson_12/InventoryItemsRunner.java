import java.util.*;

public class InventoryItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the item manufacturer:");
		String manufacturer = kb.next();
		
		System.out.println("Please enter the item name:");
		String name = kb.next();
		
		System.out.println("Will you be entering category and price information?");
		String choice = kb.next();
		if(choice.equals("no"))
		{
			InventoryItems object = new InventoryItems(manufacturer, name);
			System.out.println(object);
		}
		if(choice.equals("yes"))
		{
			System.out.println("Please enter a category:");
			String category = kb.next();
			System.out.println("Please enter a price:");
			int price = kb.nextInt();
			InventoryItems object1 = new InventoryItems(manufacturer, name, category, price);
			System.out.println(object1);
		}
	}
}