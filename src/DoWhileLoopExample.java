
public class DoWhileLoopExample {
	
	public static void main(String[] args) {
		
		
		int counter = 100; 
		
		// syntax for do loop will always execute the code inside at least once
		do {
			
			System.out.println(--counter);
			// counter--; // same as saying counter = counter - 1, gives us 100-1 when run
			
			
		} while (counter >= 0);
		
		// when it hits zero i want it to stop - greater than or equal to zero
		
	
	}
	
}
