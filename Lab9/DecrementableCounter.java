package oop;

public class DecrementableCounter   extends Counter {

	public void decrement() {
		int val = value();
		if (val > 0) {
			reset();
			for(int i = 0; i < val - 1; i++) {
				increment();
			}
		}
	}
}
