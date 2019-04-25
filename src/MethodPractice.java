import java.util.Scanner;

public class MethodPractice {
	
	// methods can live here
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	// NEVER WRITE METHODS INSIDE THE MAIN
	sayHello();
	// String dog = sayHelloName("Fido!");
	
	System.out.println("Please enter your name: ");
	String userName = scan.nextLine();
	System.out.println(sayHelloName(userName));
	
	
	// we have to use the name of the class to call method
	//  because the method does not live in this class directly
	Robot.sayHello();
	
	MethodPractice test = new MethodPractice();
	boolean t = test.checkSeven(65, "Grant Chirpus");
	System.out.println(t);
	
	System.out.println(daySeconds(48));
	
	
	// wont print without sysout
			
}
	
	
	// methods can also live here
	
	/*
	 *  5 steps for writing methods
	 *  1. visibility modifier (required): for public or private
	 *  2. static or nothing (ex is mathabsolute)
	 *  3. return type: should match what you need to return (method type is int, return type should be int
	 *  4. method name: verbs to show action
	 *  5. parameter list: things need to use in method, it can be blank (), like the string[] args
	 *  
	 */
	
	public static void sayHello() {
		System.out.println("Hello!");
		
	}
	
	// because this method has a type we need to
	// put the returned value into a sysout to see
	// the details
	
	public static String sayHelloName(String name) {
		return "Hello, " + name;
		
	}
	
	
	// this is different because no static
	// need two returns because if only true its waiting for the second one
	// 
	private boolean checkSeven (int num, String name) {
		// can call methods inside of other methods
		String names = sayHelloName(name);
		if (num == 7 || name.contentEquals("Hello, Grant Chirpus")) {
			return true;
		}
		return false;
	}
	// check for equality on string is name.equals
	

	
//create a method with type 'int' and name 'dayseconds'
	// parameter 'int hours'
	// goal calculate number of seconds in hours
	
	public static int daySeconds(int hours) {
		
		return hours * 60 * 60;
		// system.out.println(seconds); -- can put sysout statements in 
		// methods that have a return, but it's only typically
		// used for testing
		
		
}
	
	
}