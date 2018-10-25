import java.util.Random;
import java.util.Scanner;
public class GenCheeseShop {

	public static void main(String[] args) {

		final int MAXCHEESE = 10;
		Scanner input = new Scanner(System.in);
		
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];
		double[] costs = new double[MAXCHEESE];
		double total = 0;
		double discount = 0;

		// Special 3 Cheeses
		
		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
		
		
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		
		
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		
		
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
		
 		

	
 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
			
		}
		
		for(int j = 0; j<MAXCHEESE; j++){ 

		System.out.println("Enter the amount of " + names[j]);
		amounts[j]=input.nextInt();
		
		costs[j] = amounts[j]*prices[j];
		
		}
		
		System.out.println("Display itemized list? (1 for yes)");
		
		int display = input.nextInt();
		
		
		
		if (display == 1) {
			
			for (int k = 1; k < MAXCHEESE; k++)
			System.out.println(amounts[k] + "lbs of " + names[k] + "@" + prices[k] + " = $" + prices[k]);
			
		}
		
		for(int p = 0; p < MAXCHEESE; p++) {
			total = total + costs[p];
	}
		
		System.out.println("Sub total :  $" + total );
		if(total > 50){
			total = total -10;
			discount = 10; 
			if(total >100) {
				total = total - 15;
				discount = 25;
			}
			
		}
		System.out.println("-Discount:  $"  + discount);
		System.out.println("Total    :$" + total);	
			
		}
		
		
		
		
		

	}