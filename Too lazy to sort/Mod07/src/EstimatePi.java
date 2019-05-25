/*
 * PURPOSE: Test our knowledge of separating a program by methods
 * 
 * @author: Andrew Owens
 * 
 * @version:11/6/18
 */
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class EstimatePi {
	
	//variables
	public static double radius = 1.0;
    public static double h;
    public static double n;
    public static int totalHits;
    public static double total;
    public static int darts;
    public static int trials;
    
    //method to calculate the number of times the dart "hits" the target
    public static int calculateHits(double h, double n, int trials) {
        
    	totalHits = 0;

        for (int i = 1; i < trials; i++) {
            h = (2 * Math.random() - 1);
            n = (2 * Math.random() - 1);

            
            if ((Math.pow(h, 2) + Math.pow(n, 2)) <= (Math.pow(radius, 2))) {
                totalHits++;
            }
        }
       
        return totalHits;
    }
    
    public static int getHits() {
    	return totalHits;
    }

    //method to calculate "pi" for the trial
    public static double calculatePi(double totalHits, double darts) {
        return (4 * (totalHits / darts));
    }
    
    //prints out the calculated pi value to a .txt file
    public static void filePrint(int trials, double h, double n, double totalHits, int darts) throws FileNotFoundException {
    	
    	PrintWriter outFile = new PrintWriter(new File("piCalculated.txt"));
    	for (int i = 0; i < trials; i++) {
             int targetsHit = calculateHits(h, n, darts);
             double piCalculated = calculatePi(targetsHit,darts);
             outFile.println(piCalculated);
         }
         	outFile.close();
    }

    //main method to print out the data to screen
    public static void main(String[] args) throws FileNotFoundException {
        
    	Scanner scan = new Scanner(System.in);
        
    	int counter = 0;
        int i = 1;
        double total = 0;
    	
        System.out.println("How many darts per trial?");
        darts = scan.nextInt();

        System.out.println("How many trials?");
        trials = scan.nextInt();

        filePrint(trials, h, n, totalHits, darts);
        
        double[] piArray = new double[trials];
        
        File fileName = new File("piCalculated.txt");
		Scanner inFile = new Scanner(fileName);
		
		/*loop reads .txt file and assigns pi values to array
		  also formats the info to be printed to screen      */
		while(inFile.hasNextDouble()) {
			piArray[counter] = inFile.nextDouble();
			System.out.printf("%5s", "Trial ");
			System.out.printf("%1s", "[");
			System.out.printf("%2s", i);
			System.out.printf("%1s", "]: pi = ");
			System.out.printf("%-3.6f%n", piArray[counter]);
			total += piArray[counter];
			counter++;
			i++;
		}
		
		double average = total / trials;
		System.out.printf("%-10s" , "Estimate of pi = ");
		System.out.printf("%-3.6f", average);
		inFile.close();
		scan.close();
		

    }

}