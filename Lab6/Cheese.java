
public class Cheese {

	protected String name;
	protected double price;
	protected int amount;

	public static int numCheese = 0;
	
	public Cheese() { // initialization 
		name = "";
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name) { // Constructor with name input
		this.name = name;
		price = 0;
		amount = 0;
		numCheese++;
	}

	public Cheese(String name, double price) { // Constructor with 2 inputs
		// Fill-in Code
		this.name = name;
		this.price = price;
		amount = 0; 
		numCheese++;
		
	}

	public String getName() { // Accessor
		return name;
		
	}

	public void setName(String newName) { // Mutator 
		name = newName;
	}

	public double getPrice() {
		
		return price;
	}

	public void setPrice(double newPrice) {
		// Fill-in Code
		price = newPrice;
	}

	public int getAmount() {
		// Fix Code
		return amount;
	}

	public void setAmount(int newAmount) {
		// Fill-in Code
		amount = newAmount;
	}
}
