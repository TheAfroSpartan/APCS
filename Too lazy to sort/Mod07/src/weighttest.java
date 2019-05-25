import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class weighttest {

	public static void main(String[] args)throws IOException {
		
		Scanner scan = new Scanner(System.in);
		
		List<Double>Pounds = new ArrayList<Double>();
		
		System.out.println("Please enter your weight in pounds.");
		double userPounds = scan.nextDouble();
		
		Pounds.add(userPounds);
		
		Double[]poundsArray = Pounds.toArray(new Double[0]);
		
		List<Double>gravityFile = new ArrayList<Double>();
		File report1 = new File("gravity.txt");
		Scanner inFile5123 = new Scanner(report1);
		while(inFile5123.hasNext()) {
			double token5123 = inFile5123.nextDouble();
			gravityFile.add(token5123);
		}
		inFile5123.close();
		
		Double[] gravity = gravityFile.toArray(new Double [0]);
		
		
		double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
		List<Double>radius = new ArrayList<Double>();
		
		for(int i = 0; i < diameter.length; i++) {
			double token = (diameter[i] / 2.0) * 1000.0;
			radius.add(token);
			
		}
		
		Double[] radiusArray = radius.toArray(new Double[0]);
		
		
		
		List<Double>mass = new ArrayList<Double>();
		
		double a = Math.pow(10, 23);
		double mass1 = a * 3.3;
		mass.add(mass1);
		
		double b = Math.pow(10, 24);
		double mass2 = b * 4.869;
		mass.add(mass2);
		
		double c = Math.pow(10, 24);
		double mass3 = c * 5.972;
		mass.add(mass3);
		
		double d = Math.pow(10, 23);
		double mass4 = d * 6.4219;
		mass.add(mass4);
		
		double e = Math.pow(10, 27);
		double mass5 = e * 1.90;
		mass.add(mass5);
		
		double f = Math.pow(10, 26);
		double mass6 = f * 5.68;
		mass.add(mass6);
		
		double g = Math.pow(10, 25);
		double mass7 = g * 8.683;
		mass.add(mass7);
		
		double h = Math.pow(10, 26);
		double mass8 = h * 1.0247;
		mass.add(mass8);
		//double[] mass = {1,3,5};
		
		Double[] massArray = mass.toArray(new Double[0]);
		//PrintWriter outFile = new PrintWriter(new File("radius.txt"));
		List<Double>gConstant = new ArrayList<Double>();
		
		for(int i = 0; i < diameter.length; i++) {
			double G = 6.67 * (10^ -11);
			gConstant.add(G);
		}
		
		Double[] gConstantArray = gConstant.toArray(new Double[0]);
		
		//double[]result = calcGravity(gConstantArray,massArray,radiusArray);
		
		//System.out.println("Surface gravity of each Planet yea " + Arrays.toString(result));
		
		filePrint(gConstantArray, massArray, radiusArray);
		filePrint1(gravity, massArray, poundsArray);
		setFormat(gConstantArray, massArray, radiusArray, names, diameter, gravity);
		
	}
		
	public static void filePrint(Double[] gConstantArray, Double[] massArray, Double[] radiusArray) throws FileNotFoundException {
		PrintWriter outFile = new PrintWriter(new File("gravity.txt"));
		double[]gravity = calcGravity(gConstantArray,massArray,radiusArray);
		for(int i = 0; i < gravity.length;i++) {
			if((gravity[i] == 1.1143223286590117E12) || (gravity[i] == 1.0430391515671055E12) || (gravity[i] == 2.479502448454765E12)) {
				outFile.println(gravity[i]);
			}else {
			outFile.println(gravity[i]);
			}
		}
		outFile.close();
	}
	public static void filePrint1(Double[] gravity, Double[] massArray, Double[] poundsArray) throws FileNotFoundException {
			PrintWriter outFile1 = new PrintWriter(new File("weight.txt"));
			double[]weight = calculateWeight(gravity, massArray, poundsArray);
			for(int i = 0; i < weight.length;i++) {
			outFile1.println(weight[i]);
			}
			outFile1.close();
	}
	
	public static void setFormat(Double[] gConstantArray, Double[] massArray, Double[] radiusArray, String[] names, double[] diameter, Double[] gravity) throws FileNotFoundException {
		int i = 0; 
		File report = new File("gravity.txt");
		Scanner inFile5 = new Scanner(report);
		 
		//double[]gravity = calcGravity(gConstantArray,massArray,radiusArray);
		
		while(inFile5.hasNextLine()) {
			String token5 = inFile5.nextLine();
			System.out.print(names[i] + "\t\t");
			System.out.printf("%3.0f\t\t", diameter[i]);
			System.out.printf("%3.2E\t\t", massArray[i]);
			System.out.printf("%3.2E%n", gravity[i]);
			i++;
		}
	}
	
	public static double[] calcGravity(Double[] gConstantArray, Double[] massArray, Double[] radiusArray) throws FileNotFoundException {
			
			
			
			//List<Double>radius = new ArrayList<Double>();
			
			int length = gConstantArray.length<massArray.length ? gConstantArray.length : massArray.length;
			//double G = 6.67 * (10^ -11);
			double[] gravity = new double[length];
			
			for (int i = 0; i< length; i++) {
				gravity[i] = Math.abs((gConstantArray[i] * massArray[i]) / (Math.pow(radiusArray[i], 2)));
				
			}
			
			//for(int i = 0; i< length; i++) {
				//double token = first[i] / 2;
				//radius.add(token);
			//}
		
		return gravity;
		
	} 
	
	public static double[]calculateWeight(Double[] gravity, Double[] massArray, Double[] poundsArray) throws FileNotFoundException{
		   
		  // double[] mass = new double[8]; //size 8 instead of 7
		   int length = gravity.length;
		   double[] weight = new double[length]; //size 8 instead of 7
		   double[] mass123 = new double [length];
		   double userPounds = poundsArray[0];
		   for (int i = 0; i < length; i++){ //loop 8 times, not 9
		     mass123[i] = (userPounds * 433.59237)/(gravity[i]);
		     weight[i] = mass123[i] * gravity[i];
		     System.out.println(weight[i]);
		   }
		   //System.out.println(weight[3]);
		   return weight;
		}
}
