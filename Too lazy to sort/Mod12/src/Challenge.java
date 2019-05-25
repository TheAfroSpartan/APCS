/**
 * @purpose This Class  takes user input from main method for the mutator method 'convert'.
 * 			It contains a mutator method to calculate the binary equivalent.
 * 
 * @author Andrew Owens
 *
 * @version 1/24/19
 *
 */
import java.util.Scanner;

public class Challenge{

	/**
	 * Mutator Method converts decimal to binary
	 * @param num
	 * @return num
	 */
	public static int convert(int num){ 
        if (num == 0){  
            return 0;  
              
        }else{
        
        return (num % 2 + 10 * convert(num / 2)); 
    
        } 
    } 
	
	/**
	 * Main Method takes user input and invokes convert method
	 * @param args
	 */
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a whole number.");
		int num = scan.nextInt(); 
		
		System.out.println(convert(num)); 
	} 
}
