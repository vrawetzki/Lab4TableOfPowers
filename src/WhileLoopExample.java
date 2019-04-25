import java.util.Scanner;

public class WhileLoopExample {
	
	public static void main(String[] args) {
		
		// prompt user to do something over and over
		
		Scanner scan = new Scanner(System.in);
		
		String cont = "yes"; 
		
		while(cont.equalsIgnoreCase("yes")) {
			// your code should start here
			System.out.println("Play!");
			
			// this is where your code should end
			System.out.println("Do you want to continue? (yes/no) ");
			cont = scan.nextLine();
			
		}
		
		
		// this is to let the user know its over
		System.out.println("Goodbye!");
		scan.close();
		
	}

}
