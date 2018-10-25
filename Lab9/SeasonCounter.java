package oop;

public class SeasonCounter extends ModNCounter {

	
	private static String[] names =  {"spring", "summer", "fall", "winter"};
	
	
	public SeasonCounter() {
        // fill-in by creating an object with 4 divisor
		super(4);
    }
	

	@Override
	public String toString() {
        // fill-in so it returns the season name
		if (value() == 4) {
			reset();
		}
		return names[value()];
	}
	
  	
}
