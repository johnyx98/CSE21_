import java.util.Scanner;
public class RemainderFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		
		
		System.out.println("Please enter the max number ");
		int max = input.nextInt();
		
		System.out.println("Please enter the divisor "); 
		int div = input.nextInt();
		
		
		for (int count = 1; count <= max; count++) {
			System.out.println("Num:" + count + "%" + div + "=" + (count%div));
			
			
		}
		
		
		
		

	}

}
