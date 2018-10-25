import java.util.Random;
import java.util.Scanner;

public class GenCheeseShopv2 {

	public static void intro(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		
		
		
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		
		
		
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
		
		
		Random ranGen = new Random(100);

		for (int i = 3; i < names.length; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
			
		}
		
	}

	public static void getAmount(Scanner input, String[] names, int[] amounts) {
		// Fill-in
		for(int j = 0; j<names.length; j++){ 

			System.out.println("Enter the amount of " + names[j]);
			amounts[j]=input.nextInt();
			
			
			
			}
		
		
	}

	public static void itemizedList(String[] names, double[]prices, int[] amounts) {
		// Fill-in
		for (int k = 0; k < names.length; k++) 
			if (amounts[k] > 0)
			System.out.println(amounts[k] + "lbs of " + names[k] + "@" + prices[k] + " = $" + amounts[k]*prices[k]);
		
		
	}

	public static double calcSubTotal(double[] prices, int[] amounts) {
		// Fix
		double subtotal = 0; 
			for (int i = 0; i < amounts.length; i++) {
				subtotal += prices[i]*amounts[i];
			}

		
		return subtotal;
	}

	public static int discount(double subTotal){
		// Fix
		int discount = 0; 
		if (subTotal > 50){
			discount = 10;
			
		}
		if (subTotal >100) {
			discount = 25;
		}
		
		
		
		return discount;
	}

	public static void printTotal(double subTotal, int discount) {
		// Fill-in
		System.out.println("Sub total :  $" + subTotal );
		System.out.println("-Discount:  $"  + discount);
		System.out.println("Total    :$" + (subTotal - discount));	
		
		

	}

	public static void main(String[] args) {

		final int MAXCHEESE = 10;

		// DO NOT CHANGE ANYTHING BELOW
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		Scanner input = new Scanner(System.in);

		intro(names, prices, amounts);

		getAmount(input, names, amounts);

		double total = calcSubTotal(prices, amounts);
		
		if (MAXCHEESE > 0) {
			System.out.print("Display the itemized list? (1 for yes) ");
			int itemized = input.nextInt();

			if (itemized == 1) {
				itemizedList(names, prices, amounts);
			}
		}

		System.out.println();

		printTotal(total,discount(total));
	}
}