import java.util.Scanner;

public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		Receipt form = new Receipt();
		
		System.out.println("Please enter item 1:");
		String item1 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price1 = kb.nextDouble();
		System.out.println("Please enter item 2:");
		kb.nextLine();
		String item2 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price2 = kb.nextDouble();
		System.out.println("Please enter item 3:");
		kb.nextLine();
		String item3 = kb.nextLine();
		System.out.println("Please enter the price:");
		double price3 = kb.nextDouble();
		double subtotal = price1+price2+price3;
		double tax = subtotal*.075;
		double total = subtotal+tax;
		
		form.receipt(item1, price1, item2, price2, item3, price3, subtotal, tax, total);
		
	}
	
	public void receipt(String item1, double price1, String item2, double price2, String item3, double price3, double subtotal, double tax, double total)
	{
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>");
		System.out.printf("*  %15s ........ %10.2f", item1, price1);
		System.out.printf("\n*  %15s ........ %10.2f", item2, price2);
		System.out.printf("\n*  %15s ........ %10.2f", item3, price3);
		System.out.printf("\n\n*  %15s ........ %10.2f", "Subtotal:", subtotal);
		System.out.printf("\n*  %15s ........ %10.2f", "Tax:", tax);
		System.out.printf("\n*  %15s ........ %10.2f", "Total:", total);
		System.out.println("\n_______________________________________________\n\t* Thank you for your order *");
	}
	
}