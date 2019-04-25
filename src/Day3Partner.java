import java.util.Scanner;

public class Day3Partner {


	/*
	 * Write a method named ageInDays that takes in an int value for an age
	 * and calculates the amount of days
	 * a user has been alive.
	 * 
	 * Now add the ability to take input from a user, and 
	 * write another method called daysUntil75() that calls ageInDays() and 
	 * calculates the amount of days until they reach 
	 * 75yrs (27375 days).
	 *
	 */
	

		public static void main(String[] args) {
			
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter your age in years: ");
			// call method here
			int userAge = scan.nextInt();
			
			System.out.println(ageInDays(userAge));		
			
			System.out.println("You have " + (daysUntil75(userAge)) + " until 75.");
			
			scan.close();
		}

		// your methods should go here
		public static int ageInDays (int days) {
			
			return days * 365;
				
		}
		
		public static int daysUntil75(int daysLeft) {
			
			return 27375 - ageInDays(daysLeft);
			
		}
}


