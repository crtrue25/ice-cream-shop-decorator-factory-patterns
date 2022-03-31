import java.util.ArrayList;
import java.util.Scanner;

public class Truelick_shop 
{
	public static void main(String[]args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Welcome to Decorator Ice Cream Shop!");
		
		System.out.println("\nPlease begin your order:");
		
		System.out.println("\n[1] Bowl");
		System.out.println("[2] Cake Cone");
		System.out.println("[3] Waffle Cone");
		System.out.println("[0] Continue to Ice Cream Flavors");
		int type = -1;
		while(type != 0)
		{
			int num = console.nextInt();
			if(num != 0)
			{
				type = num;
			}
			else break;
		}
		
		System.out.println("\nChoose your Ice Cream Flavors");
		System.out.println("[1] Chocolate");
		System.out.println("[2] Vanilla");
		System.out.println("[3] Strawberry");
		System.out.println("[4] Neapolitan");
		System.out.println("[5] Butter Pecan");
		System.out.println("[6] Chocolate Chip Cookie Dough");
		System.out.println("[7] Black Raspberry Chocolate Chip");
		System.out.println("[8] Cookies 'n Cream");
		System.out.println("[9] Mint Chocolate Chip");
		System.out.println("[10] Butterscotch");
		System.out.println("[11] Rocky Road");
		System.out.println("[12] Salted Caramel");
		System.out.println("[0] Complete Order and Display Invoice");
		ArrayList<Integer> flavors = new ArrayList<Integer>();
		int flavor = -1;
		while(flavor != 0)
		{
			flavor = console.nextInt();
			if(flavor != 0) 
			{
				flavors.add(flavor);	
			}
			else break;
		}
		
		IceCreamFactory factory = new IceCreamFactory();
		MenuItem order = factory.getOrder(type, flavors);
		
		float[] individualPrices = new float[order.countLayers()];
		order.buildCostArray(individualPrices, 0);
		
		printInvoice(order.getDescription(), individualPrices);
		float subTotal = order.getCost();
		float tax = (float)(subTotal * .056);
		System.out.printf("%-12s %20s%.2f\n", "Sub-total: ", "$", subTotal);
		System.out.printf("%-12s %20s%.2f\n", "Tax: " , "$", tax);
		System.out.printf("%-12s %20s%.2f\n", "Total: " , "$", (subTotal + tax));
		
		
		console.close();
	}
	
	public static void printInvoice(String order, float[] prices)
	{
		String[] tokens = order.split(" ");
		
		System.out.println("Your Order");
		System.out.println("---------------------------------");
		System.out.println(tokens[tokens.length-1]);
		for(int item = tokens.length - 2; item >= 0; item--)
		{
			System.out.println("\t-- " + tokens[item]);
		}
	}
}
