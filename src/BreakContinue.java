
public class BreakContinue {
	public static void main(String[] args) {
		
		
		// this will create an infinite loop
		// and it will run continuously until we add
		// a stop condition
		while(true) { 
			// System.out.println(Math.random());
			int randomNum = (int)(Math.random() * 10);
			System.out.println(randomNum);
			
			// to break out of this loop we need a conditional
			// statement
			// and we'll use the break keyword to exit
			if (randomNum == 7) {
				
				System.out.println("You found 7!");
				break;
			}
		}
		
		//  now we want this to only execute five times
		System.out.println("Continue Example: ");
		
		for (int i = 0; i <5; i++ ) {
			int randomNum = (int)(Math.random() * 10);
			// this is consider block scope because its in 
			// this loop and doesn't know it was declared 
			// elsewhere
			if (randomNum > 7) {
				System.out.println("This number is too big -- going back to the top of the loop");
				continue; 
			}
			System.out.println(randomNum);
			// the only time you should see randomNum is when its seven or see
			
		}
		
		
	}
}
