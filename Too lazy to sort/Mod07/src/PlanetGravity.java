/*
 * PURPOSE: Demonstrate our knowledge of static methods in conjunction with math methods
 * 
 *  @author: Andrew Owens
 *  
 *  @version: 10/31/18
 * 
 */
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;

public class PlanetGravity {

	public static void main(String[] args)throws IOException {
		
		double [] massArray = {3.30E23,4.869E24,5.972E24,6.4219E23,1.900E27,5.68E26,8.683E25,1.0247E26};
		double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		
		List<Double>radius = new ArrayList<Double>();
		
		for(int i = 0; i < diameter.length; i++) {
			double token = (diameter[i] * 1000) / 2.0;
			radius.add(token);	
		}
		
		Double[] radiusArray = radius.toArray(new Double[0]);
		double[] gravity = calcGravity(massArray, radiusArray); 
		
		filePrint(massArray, radiusArray);
		setFormat(massArray, radiusArray, names, diameter, gravity);
	}
		
	public static void filePrint( double[] massArray, Double[] radiusArray) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(new File("gravity.txt"));
		double[]gravity = calcGravity(massArray,radiusArray);
		for(int i = 0; i < gravity.length;i++) {
		outFile.println(gravity[i]);
		}
		outFile.close();
	}
	
	public static void setFormat( double[] massArray, Double[] radiusArray, String[] names, double[] diameter, double[] gravity) throws FileNotFoundException {
		
		System.out.printf("%35s%n", "Planetary Data");
		System.out.printf("%-6s\t\t","Planet");
		System.out.printf("%6s\t","Diameter (Km)");
		System.out.printf("%6s\t\t","Mass (Kg)");
		System.out.printf("%6s%n","g (m/s^2)");
		System.out.println("-----------------------------------------------------------------");

		for(int i = 0; i < 8; i++) {
			System.out.print(names[i] + "\t\t");
			System.out.printf("%3.0f\t\t", diameter[i]);
			System.out.printf("%3.2E\t\t", massArray[i]);
			System.out.printf("%4.2f%n", gravity[i]);
		
		}
	}
	
	public static double[] calcGravity( double[] massArray, Double[] radiusArray) throws FileNotFoundException {
			
		
			double gConstant = 6.67E-11;
			int length = 8;
			double[] gravity = new double[length];
			
			for (int i = 0; i< length; i++) {
				gravity[i] = Math.abs((gConstant * massArray[i]) / (Math.pow(radiusArray[i], 2)));
				
			}
		
		return gravity;
		
	} 
	
}
