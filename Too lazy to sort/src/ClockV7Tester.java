/*
 * PURPOSE: Demonstrate our understanding of OOP so far.
 * 
 * @author: Andrew Owens
 * 
 * @version: 11/15/18
 */
public class ClockV7Tester {
	
	public static void main(String[] args) {
		
		//Time difference variables for Hours and Minutes
		double differenceH, differenceM; 
		double differenceH1, differenceM1; 
		double differenceH2, differenceM2;
		
		//class instances
		ClockV7 timeBoy = new ClockV7(2.5, 4.5, "Henry");
		ClockV7 timeGirl = new ClockV7(1.25, 5.60, "Elise");
		ClockV7 timeBaby = new ClockV7(12.30, 16.75, "Danny");
		
		//Summoning the outside methods
		differenceH = timeBoy.calcTimeDiff(2.5, 4.5);
		differenceM = timeBoy.calcTimeDiff(differenceH);
		differenceH1 = timeGirl.calcTimeDiff(1.25, 5.60);
		differenceM1 = timeGirl.calcTimeDiff(differenceH1);
		differenceH2 = timeBaby.calcTimeDiff(12.30, 16.75);
		differenceM2 = timeBaby.calcTimeDiff(differenceH2);
		
		//Formatted print
		 System.out.printf("%40s", "Time Trials");
	     System.out.printf("%6s%15s%15s%25s%19s%n", "\nName", "Time 1","Time 2","Time Difference","Difference" );
	     System.out.printf("%18s%15s%20s%25s%n", "(hrs)", "(hrs)", "(hrs)", "in Minutes");
         System.out.printf("%30s%n", "______________________________________________________________________________");
         System.out.printf("%-5s%13.2f%15.2f%20.2f%22.0f%n", timeBoy.getName(), timeBoy.getTime1(), timeBoy.getTime2(), differenceH, differenceM );
         System.out.printf("%-5s%13.2f%15.2f%20.2f%22.0f%n", timeGirl.getName(), timeGirl.getTime1(), timeGirl.getTime2(), differenceH1, differenceM1 );
         System.out.printf("%-5s%13.2f%15.2f%20.2f%22.0f%n", timeBaby.getName(), timeBaby.getTime1(), timeBaby.getTime2(), differenceH2, differenceM2 );
		
		
	}
}