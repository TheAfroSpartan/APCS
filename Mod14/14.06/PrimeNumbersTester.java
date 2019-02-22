/**
 * This class tests the PrimeNumbers class.
 * 
 * @author Andrew Owens
 * @version 2/12/19
 */
import java.util.Scanner;
public class PrimeNumbersTester{
	
	//main method
    public static void main(String[] args){
    	
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the lower limit.");
        int lowerLimit = scan.nextInt();
        
        System.out.println("Enter the upper limit.");
        int upperLimit = scan.nextInt();
        
        PrimeNumbers primeNum = new PrimeNumbers(lowerLimit, upperLimit);
        
        primeNum.calcPrimeNumbers();
        
        int counter = primeNum.getCounter();
        
        System.out.println("There are " + counter + " prime numbers between " + lowerLimit + " and " + upperLimit);
        
    }
}
