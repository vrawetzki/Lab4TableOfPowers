
public class MethodOverloadingEx {

	public static void main(String[] args) {
		int num = 1;
		System.out.println(modifyMe(num));
		
		System.out.println(modifyMe(1,15));
		
		System.out.println(modifyMe("1.5"));
		
	}
	
	// Method Overloading
	// 1. Methods must have the same name (don't have to
	// 		be the same return type)
	// 2. Must have one of the following differences:
	//		a. Different parameter types
	//		b. Different parameter order
	//		c. Different amount of parameters
	
	public static int modifyMe(int num) {
		return num * 56;
		
	}
	
	public static int modifyMe(int num, int num2) {
		return num * num2; 
		
	}
	
	public static double modifyMe(String userNum) {
		//convert string into number and multiple it
		double d = Double.parseDouble(userNum) * 0.5;
		return 0;
		
	}
}
