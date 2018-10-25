import java.util.Scanner;
public class Cheese_Shop {

	/**
	 * @param args
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("We sell 3 kinds of Cheese.");
	System.out.println("Dalaran Sharp:   $1.25 per pound");
	System.out.println("Stormwind Brie:   $10.00 per pound"); 
	System.out.println("Altera Swiss:   $40.00 per pound"); 
	
	double total = 0;
	double costsharp = 0;
	double costbrie = 0;
	double costswiss = 0; 
	double discount = 0;
	
	System.out.println("Enter in the amount of sharp");
	double sharp = input.nextInt();
	
		if (sharp>0) {
			costsharp =  sharp*1.25; 
		}
		
		
	System.out.println("Enter in the amount of Brie"); 	
		
		int brie = input.nextInt(); 
		
		if (brie>0) {
			costbrie = brie*10; 
		}
		
		
	System.out.println("Enter in the amount of Swiss");
	
	int swiss = input.nextInt(); 
		
		if (swiss>0) { 
			costswiss = swiss*40; 
		}
	
	System.out.println("Display the itemized list? (1 for yes ");
	
		int display = input.nextInt();
		
		if (display == 1) { 
			
			System.out.println(sharp + "lbs of sharp @ $" + costsharp);
			System.out.println(brie + "lbs of brie @ $" + costbrie);
			System.out.println(swiss + "lbs of swiss @ $" + costswiss); 
			
			
		 	
		}  
			total = costswiss + costbrie + costsharp; 
			System.out.println("Sub total:  " + total); 
			if (total > 50) {
				total = total - 10; 
				discount = 10; 
				if(total > 100) {
					total = total -15; 
					discount = 25;
				}
 
				
			}
			 
			System.out.println("-Discount:  $"  + discount);
			System.out.println("Total    :$" + total);
			
		}
		
}




