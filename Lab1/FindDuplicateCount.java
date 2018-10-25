
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
		// Fill-in
		int i = 0; 
		int count = 0;
		
		for (i=0; i<arr.length; i++) {
			count = 0;
			
			for (int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {     //compare array numbers
					count++;
				}
			
			
			}
			
			if (count == 0) {
			System.out.println("No duplicates with value " + arr[i] + " beyond Index " + i);
			
			} else if (count == 1) {
				System.out.println("There is only 1 more occurence of value " + arr[i]+ " starting at Index" + i); 
				
			} else {
				System.out.println("There are " + i + " more occurances of value " + arr[i] + " starting at Index " + i); 
			}
			
			
			
			
		}
		
		
	}

}
