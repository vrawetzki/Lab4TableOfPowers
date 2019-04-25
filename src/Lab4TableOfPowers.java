import java.util.Formatter;
import java.util.Scanner;

public class Lab4TableOfPowers {

	public static void main(String[] args) {
		
		System.out.println("Learn your squares and cubes!");
		
		
		// enter integer
		System.out.println("Please enter an integer: ");
		
		Scanner scan = new Scanner(System.in);
		
		int userNum = scan.nextInt();
		
		// Display of numbers and squares and cubes
        System.out.printf("%-6s | %-6s | %-6s", "Number", "Squared", "Cubed\n");
        
        System.out.printf("========================\n");
        
		
		for (int i = 1; i <= userNum; i++)
        {
			Formatter fmt = new Formatter();

		      fmt.format("   %-8d %-8d %-1d", i, i * i, i * i * i);
		      System.out.println(fmt);
		      
        // squaring a number
        int numSquared = (int) Math.pow (i, 2);
               
        // cubing a number
        int numCubed = (int) Math.pow (i, 3);
		
		}
		
		
		String cont = "yes"; 
		
		while(cont.equalsIgnoreCase("yes")) {
			// your code should start here
			System.out.println("Continue? (y/n)");
			Scanner scan1 = new Scanner(System.in);
		
			cont = scan.nextLine();
			
		}
		
		
	}
}



