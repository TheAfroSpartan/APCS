/**
 * @purpose This class tests the Fibonacci class
 * 
 * A fibNum object is created to hold the user's number value.
 * 
 *  @author Andrew Owens
 *  @version 1/21/19
 */
import java.util.Scanner;

public class FibonacciTester {

	public static void main(String[] args) {
		
		//Declaration of scanner object
		Scanner scan = new Scanner(System.in);
		
		//error trap
		try {
			
		//loop to run program until condition is met
		while(true) {
		
		System.out.println("Enter any number from 0~46 or any number larger than 46 to quit.");
		int num = scan.nextInt();
		
		//declaration of new object of Fibonacci class
		Fibonacci fibNum = new Fibonacci();
		
		System.out.println("The Fibonacci number is: " + fibNum.number(num));
		System.out.println();
		
		//condition to break loop
		if(num > 46) {
			break;
		}
		}
		//error catcher
		}catch(Exception e) {
			System.out.println("Thank You!");
		}
	}
}
