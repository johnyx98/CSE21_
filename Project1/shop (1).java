import java.util.Scanner;
public class shop {
static int fill = 2;
static Scanner input = new Scanner(System.in);
static int [] arritems = new int[fill];
static double[] price = new double [fill];
static String [] name = new String [fill];
static int shopcount = 0;
static int[] amounts = new int[fill];
static int buycount;
static int discount;
static double discountrate;

	public static void setupshop () {
		System.out.println("Please enter the number of items:");
		int itemnumber = input.nextInt(); 
		arritems = new int[itemnumber];
		price = new double [itemnumber];
		name = new String [itemnumber];
		amounts = new int [itemnumber];
		int shopcount = 0;
		
		for (int i=0; i<arritems.length; i++ ) {
			arritems[i] = i;
			System.out.println("Please enter the name of product " + arritems[i]);
			name[i]=input.next();
			input.nextLine();
			
			
			System.out.println("Please enter the price of the product " + arritems[i]);
			price[i] = input.nextDouble(); 
			
		}
			System.out.println("Please enter the amount to qualify for discount: ");
			discount = input.nextInt();
			System.out.println("Please enter the discount rate(0.1 for 10%)");
			discountrate = input.nextDouble();
		
		
	}
	
	public static void buy(){
		
		for(int i=0; i<amounts.length; i++){
			System.out.println("Enter amount of " + name[i]);
			amounts[i] = input.nextInt();
			
		}
	}
	
	
	public static void list() {
		if (shopcount == 0 || buycount == 0) {
			System.out.println("Please setup shop and buy first");
			return;
		}
		
		if(shopcount > 0 && buycount > 0) {
			for(int i = 0; i<arritems.length; i++){
				System.out.println("Item: \t" + name[i] + "\t Amount: " + amounts[i] + "\t Price: " + price[i]);
			}
			
		}
		}
	
	public static void checkout() {
		double subtotal1, subtotal = 0, total, discount1;
		if (shopcount == 0 || buycount == 0) {
			System.out.println("Please setup shop and buy first");
			return;
		}
		if(shopcount > 0 && buycount > 0){
			for (int i = 0; i < amounts.length; i++) {
				subtotal1 = amounts[i] * price[i];
				subtotal = subtotal1 + subtotal;
				}
				System.out.println("Subtotal: " + subtotal);
		}
		if (subtotal < discount) {
			discountrate = 0;
		}
			System.out.println("Discount: " + (subtotal*discountrate));
			discount1 = subtotal*discountrate;
			total = subtotal -discount1;
			System.out.println("Total: " + total);
			System.out.println("Thank you for shopping with us!");
			
			System.exit(0);
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		
		
		
		while(true) {
		System.out.println("This program supports 4 functions:");
		System.out.println("	1. Setup Shop");
		System.out.println("	2. Buy");
		System.out.println(" 	3. List Items");
		System.out.println(" 	4. Checkout");
		System.out.println("Please Choose the function you want");
		int function = input.nextInt();
		
		
		if (function == 1) {
			
			
			setupshop(); 
			shopcount++;
		
			
		} else
		if (function == 2) {
			if(shopcount<=0){
				input.nextLine();
				System.out.println("Shop is not set up yet!");
				System.out.println("");
				}
				if(shopcount>0){
			buy();
			buycount++;
				}	
		} else
		if (function == 3) {
			list();
			
		} else
		if (function == 4) {
			checkout();
		}
		if (function > 4){
			System.out.println("Error: Do not know " + function);
		
		}
		
		}
		

	}

}
