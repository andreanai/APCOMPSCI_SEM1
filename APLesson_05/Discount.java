import java.util.Scanner;
public class Discount
{
	static double discount; 
	static String item1;
	static String item2;
	static String item3;
	static String item4;
	static double price1;
	static double price2;
	static double price3;
	static double price4;
	static double Subtotal;
	static double tax;
	static double Total;
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	
	System.out.println("Please enter item 1: ");
	item1 = kb.nextLine();
	
	System.out.println("Please enter price of item 1: ");
	price1 = kb.nextDouble();
	
	System.out.println("Please enter item 2: ");
	kb.nextLine();
	item2 = kb.nextLine();
	
	System.out.println("Please enter price of item 2: ");
	price2 = kb.nextDouble();
	
	System.out.println("Please enter item 3: ");
	kb.nextLine();
	item3 = kb.nextLine();
	
	System.out.println("Please enter price of item 3: ");
	price3 = kb.nextDouble();
	
	System.out.println("Please enter item 4: ");
	kb.nextLine();
	item4 = kb.nextLine();
	
	System.out.println("Please enter price of item 4: ");
	price4 = kb.nextDouble();
	
	Subtotal = price1+price2+price3+price4;
	
	discount(Subtotal);
	
	tax = .075*(Subtotal-discount);
	Total = Subtotal-discount+tax;
	
	print();
	}
	public static void discount(double Subtotal)
	{
		if (Subtotal>= 2000)
			discount = .15*Subtotal;
		if (Subtotal< 2000)
			discount = 0;
	}
	public static void print()
	{
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		System.out.printf("*  %15s ........ %10.2f", item1, price1);
		System.out.printf("\n*  %15s ........ %10.2f", item2, price2);
		System.out.printf("\n*  %15s ........ %10.2f", item3, price3);
		System.out.printf("\n*  %15s ........ %10.2f", item4, price4);
		System.out.printf("\n\n*  %15s ........ %10.2f", "Subtotal:", Subtotal);
		System.out.printf("\n*  %15s ........ %10.2f", "Discount:", discount);
		System.out.printf("\n*  %15s ........ %10.2f", "Tax:", tax);
		System.out.printf("\n*  %15s ........ %10.2f", "Total:", Total);
		System.out.println("\n_______________________________________________\n\t* Thank you for your order *");
	}
}