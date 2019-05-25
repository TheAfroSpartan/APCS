/*
 * PURPOSE: Demonstrate our knowledge of static methods in conjunction with math methods
 * 
 *  @author: Andrew Owens
 *  
 *  @version: 11/1/18
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class PlanetWeight {

    public static double [] gravity()throws IOException {
		int counter = 0;
		double[] gravityArray = new double[8];
		File fileName = new File("gravity.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext()){
			gravityArray[counter] = inFile.nextDouble();
			counter++;
		}
		inFile.close();
		return gravityArray;
    }


    public static double[] calcWeight(double[]gravityArray, double[]weight, Double [] poundsArray) {
		double pounds = poundsArray[0];
		double grams = pounds * 433.59237;
    	for (int counter = 0; counter < 8; counter++){
			weight[counter] = (grams * (gravityArray[counter] / 9.8)) / 433.59237;
		}
		return weight;
    }

    public static void setFormat(double[] gravityArray, double[] weight, String[] planetNames) {
	    System.out.printf("%31s\t%n","My Weight on the Planets");
	    System.out.printf("%-6s\t\t", "Planet");
	    System.out.printf("%6s\t\t", "Gravity");
	    System.out.printf("%6s%n", "Weights (lbs)");
	    System.out.println("*********************************************");
	    for (int counter = 0; counter< 8; counter ++){
	    	System.out.print(planetNames[counter] + "\t\t");
			System.out.printf("%4.2f\t\t", gravityArray[counter]);
			System.out.printf("%4.2f%n", weight[counter]);
	    }
    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<Double> poundsList = new ArrayList<Double>();
        
    	System.out.println("Please enter your weight in pounds.");
    	double weightScan = scan.nextDouble();
    	poundsList.add(weightScan);
    	Double[] poundsArray = poundsList.toArray(new Double[0]); 
    	
    	String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
	    
    	double gravityArray[] = gravity();
	    double[] weight = new double[8];
	    weight = calcWeight(gravityArray, weight, poundsArray);
	    setFormat(gravityArray, weight, planet);
    }

}