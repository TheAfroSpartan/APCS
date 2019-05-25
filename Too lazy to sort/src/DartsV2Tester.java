/**
 * 
 * @purpose This class tests the DartsV2 class.
 * 
 * A piList object is created to hold the number of trials and the number of darts thrown.
 * 
 * @author Andrew Owens
 * @version 11/26/18
 *
 */
import java.util.Scanner;
import java.util.ArrayList;

public class DartsV2Tester {

	public static void main(String[] args) {
		
		//Deceleration and initialization of variables
		double total = 0.0;
		
		//initialization of scanner object
		Scanner scan = new Scanner(System.in);
		
		//user input
		System.out.println("How many darts per trial?");
		int darts = scan.nextInt();
		
		//user input
		System.out.println("How many trials");
		int trials = scan.nextInt();
		
		//Deceleration of ArrayList
		ArrayList<DartsV2> piList = new ArrayList<DartsV2>();
		
		//initialization of piList array with elements
		for(int i=0; i <= trials; i++) {
			piList.add(new DartsV2(trials, darts));
		}
		
		//invoke methods
		 for(DartsV2 dataRecord : piList){
			 
	            dataRecord.calculateHits();
	            dataRecord.calculatePi();
	        }
		
		 //creates a new dataRecord object of type DartsV2
		 DartsV2 dataRecord;
		 
		//call methods and print results
		 for(int index = 0; index < piList.size(); index ++)
			{
				dataRecord = piList.get(index);
				
				System.out.printf("%5s", "Trial ");
				System.out.printf("%1s", "[");
				System.out.printf("%2s", index);
				System.out.printf("%1s", "]: pi = ");
				System.out.printf("%-3.6f%n", dataRecord.getPi());
				total += dataRecord.getPi();
			}
		 	
		 	//initialization of average variable with arithmetic
		 	double average = total / trials;
			System.out.printf("%-10s" , "Estimate of pi = ");
			System.out.printf("%-3.6f", average);
	}//end of main

}//end of class
