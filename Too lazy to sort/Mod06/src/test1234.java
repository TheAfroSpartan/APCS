/**
 * PURPOSE: Demonstrate our knowledge and understanding of previously learned topics
 *
 * @author Andrew Owens
 * @version 10/20/18
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.HashMap;
//import java.util.Map;

public class test1234 {

	public static void main(String[] args) throws FileNotFoundException {
		
		//I am aware that I can reuse scanners
		Scanner scan = null;
		Scanner scan1 = null;
		Scanner scan2 = null;
		Scanner scan3 = null;
		Scanner windscan = null;
		Scanner finalscan = null;
		Scanner categoryscan = null;
		Scanner windScan1 = null;
		Scanner pressureScan = null;
		Scanner categoryscan1 = null;
		
		//create new files to print to
		PrintWriter outFile = new PrintWriter(new File("years.txt"));
		PrintWriter outFile1 = new PrintWriter(new File("pressure.txt"));
		PrintWriter outFile2 = new PrintWriter(new File("windSpeed.txt"));
		PrintWriter outFile3 = new PrintWriter(new File("names.txt"));
		PrintWriter outFile4 = new PrintWriter(new File("category.txt"));
		PrintWriter outFile5 = new PrintWriter(new File("final.txt"));
		
		//integers
		int i = 0;
		int windsum = 0;
		int a = 0;
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;
		int counter5 = 0;
		int sum = 0;
		int pressuresum = 0;
		//int h = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE;
		int min2 = Integer.MAX_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		//Arrays to store values in
		List<String> years = new ArrayList<String>();
		List<String>pressure = new ArrayList<String>();
		List<String>names = new ArrayList<String>();
		List<String>category = new ArrayList<String>();
		List<String>finalData = new ArrayList<String>();
		List<Double>windSpeed = new ArrayList<Double>();
		List<Integer>categorysum = new ArrayList<Integer>();
		List<Integer>windSum = new ArrayList<Integer>();
		List<Integer>pressureSum = new ArrayList<Integer>();
		//Map<Integer, String>  map = new HashMap<>();
		
		scan = new Scanner(new File ("HurricaneData.txt"));
		
		//prints only the years to the years.txt file
		while(scan.hasNextLine()) {
				
				counter++;
				outFile.println(scan.next());
				
				scan.nextLine();
			}
		
		//provides the length of the array
		int [] array = new int [counter];
		int b = array.length;
			
			outFile.close();
			scan.close();
			
		scan1 = new Scanner(new File ("HurricaneData.txt"));
		
		//prints the air pressure to pressure.txt
		while(scan1.hasNextLine()) {
				String line = scan1.nextLine();
				outFile1.println(line.substring(9, 13));	
			}
			
			outFile1.close();
			scan1.close();
			
		scan2 = new Scanner(new File ("HurricaneData.txt"));
		
		//prints wind speed to windSpeed.txt file
		while(scan2.hasNextLine()) {
				String line2 = scan2.nextLine();
				outFile2.println(line2.substring(13,16));
			}
			
			outFile2.close();
			scan2.close();
			
		scan3 = new Scanner(new File ("HurricaneData.txt"));
		
		//prints names to names.txt file
		while(scan3. hasNextLine()) {
				String line3 = scan3.nextLine();
				outFile3.printf("%4s%n", line3.substring(16));
			}
			
			outFile3.close();
			scan3.close();
			
		File yearslist = new File("years.txt");
	    Scanner inFile = new Scanner(yearslist);
	    
	    //read years file and add values to array list
		while (inFile.hasNext()) {
			String token = inFile.next();
			years.add(token);
		}
		inFile.close();
		
		File pressureList = new File("pressure.txt");
		Scanner inFile1 = new Scanner(pressureList);
		
		//read pressure file and add values to array list
		while (inFile1.hasNext()) {
			String token1 = inFile1.next();
			pressure.add(token1);
		}
		inFile1.close();
		
		File windList = new File("windSpeed.txt");
		Scanner inFile2 = new Scanner(windList);
		
		//read windSpeed file and add values to array list
		while(inFile2.hasNext()) {
			Double token2 = inFile2.nextDouble();
			windSpeed.add(token2);
		}
		
		inFile2.close();
		
		windscan = new Scanner(new File("windSpeed.txt"));
		
		//convert string into int for categorizing
		while(windscan.hasNext()) {
			String number = windscan.next();
			int result = Integer.parseInt(number);
			
			if(result >= 64 && result <= 82) {
				outFile4.println("1");
			}else if(result >= 83 && result <= 95) {
				outFile4.println("2");
			}else if(result >= 96 && result <= 112) {
				outFile4.println("3");
			}else if(result >= 113 && result <= 136) {
				outFile4.println("4");
			}else if(result > 137) {
				outFile4.println("5");
			}
			
		}
		
		outFile4.close();
		windscan.close();
		
		
		File namesList = new File("names.txt");
		Scanner inFile3 = new Scanner(namesList);
		
		// read names file and add names to array list
		while(inFile3.hasNext()) {
			String token3 = inFile3.next();
			names.add(token3);
		}
		
		inFile3.close();
		
		File categoryList = new File("category.txt");
		Scanner inFile4 = new Scanner(categoryList);
		
		//read category file and add values to array list
		while(inFile4.hasNext()) {
			String token4 = inFile4.next();
			category.add(token4);
		}
		
		//declare arrays and assign their values
		String[] yearsArray = years.toArray(new String[0]);
		String[] pressureArray = pressure.toArray(new String[0]);
		String[] namesArray = names.toArray(new String [0]);
		String[] categoryArray = category.toArray(new String [0]);
		Double[] windArray = windSpeed.toArray(new Double[0]);
		
		
		
		/* me trying to figure out how I should use arrays
		 
		for (String s : yearsArray) {
			System.out.println(yearsArray[10]);
			break;
		}
		
		for (String q : pressureArray) {
			System.out.println(pressureArray[10]);
			break;
		}
		
		for (Double u : windArray) {
			System.out.println(windArray[10]);
			break;
	}
*/
		
		finalscan = new Scanner(new File ("HurricaneData.txt"));
		
		//print out formatted hurricane data final.txt
		while(a < b) {
			outFile5.print(yearsArray[a] + "\t");
			outFile5.printf("%-9s\t", namesArray[a]);
			outFile5.printf("%4s\t\t", categoryArray[a]);
			outFile5.printf("%5s\t\t", pressureArray[a]);
			outFile5.printf("%4.2f\t%n", windArray[a] * 1.151);
			a++;
			
			finalscan.nextLine();
		}
		 outFile5.close();
		 finalscan.close();
		
		 
		  
		 Scanner userin = new Scanner(System.in);
	     System.out.println("Please enter the year you would like the range to start at (Earliest Year is 1995).");
	     String user = userin.next();
			
	     System.out.println("Please enter the year you want the range to end at (Latest year is 2015.");
		 String user1 = userin.next();
		 //int result1 = Integer.parseInt(categorynum);
		 int response = Integer.parseInt(user);
		 int response1 = Integer.parseInt(user1);
		 
		 double range = (response1 - 1995)* 7.8;
		 
		 while (user.equals("1995")) {
			  i =0;
			  break;
		 }
		 
		 while (user.equals("1996")) {
			  i = 11;
			  break;
		 }
		 while (user.equals("1997")) {
			  i = 20;
			  break;
		 }
		 while (response == 1998) {
			  i = 23;
		 }
		 while (response == 1999) {
			  i = 34;
		 }
		 while (response == 2000) {
			  i = 41;
		 }
		 while (response == 2001) {
			  i = 49;
		 }
		 while (response == 2002) {
			  i = 58;
		 }
		 while (response == 2003) {
			  i = 62;
		 }
		 while (response == 2004) {
			  i = 69;
		 }
		 while (response == 2005) {
			  i = 78;
		 }
		 while (response == 2006) {
			  i = 93;
		 }
		 while (response == 2007) {
			  i = 98;
		 }
		 while (response == 2008) {
			  i = 104;
		 }
		 while (response == 2009) {
			  i =112;
		 }
		 while (response == 2010) {
			  i = 115;
		 }
		 while (response == 2011) {
			  i =127;
		 }
		 while (response == 2012) {
			  i =134;
		 }
		 while (response == 2013) {
			  i =144;
		 }
		 while (response == 2014) {
			  i =146;
		 }
		 while (response == 2015) {
			  i =153;
		 }
		 File report = new File("final.txt");
		 Scanner inFile5 = new Scanner(report);
		 
		 // read final file and add values to array list
		 while(inFile5.hasNext()) {
			 String token5 = inFile5.nextLine();
			 finalData.add(token5);
			 //inFile5.nextLine();
		 }
		 
		 //declare array and assing their values
		 String[] dataArray = finalData.toArray(new String [0]);
		 
		 categoryscan = new Scanner(new File("category.txt"));
		 
		 //convert category string into ints for average
		 while(categoryscan.hasNext()) {
			 String categorynum = categoryscan.next();
			 int result1 = Integer.parseInt(categorynum);
			 categorysum.add(result1);
		 }
		 categoryscan.close();
		 
		 windScan1 = new Scanner(new File("windSpeed.txt"));
		 
		 //convert wind speed to int for average
		 while(windScan1.hasNext()) {
			 String windnum = windScan1.next();
			 int result2 = Integer.parseInt(windnum);
			 windSum.add(result2);	 
		 }
		 windScan1.close();
		 
		 pressureScan = new Scanner(new File("pressure.txt"));
		 
		 //convert pressure to int for average
		 while(pressureScan.hasNext()) {
			 String pressurenum = pressureScan.next();
			 int result3 = Integer.parseInt(pressurenum);
			 pressureSum.add(result3);
		 }
		 
		 //declare arrays and assign their values
		 Integer[] catArray = categorysum.toArray(new Integer[0]);
		 Integer[] windSumArray = windSum.toArray(new Integer[0]);
		 Integer[] pressureSumArray = pressureSum.toArray(new Integer[0]);
		 
		 //a lone enhanced for loop
		 for( int d : catArray) {
			 sum = sum + catArray[d];
		 }
		 
		 //loop for average
		 for( int x = 0; x < windSumArray.length; x++) {
			 windsum = windsum + windSumArray[x];
		 }
		//loop for average
		 for( int r = 0; r <  pressureSumArray.length; r++) {
			 pressuresum = pressuresum + pressureSumArray[r];
		 }
		 
		 //calculate averages
		 double catAverage = 1.0d * sum / catArray.length;
		 double windAverage = (1.0d * windsum / windSumArray.length) * 1.15078;
		 double pressureAverage = 1.0d * pressuresum / pressureSumArray.length;
		 
		 //calculate minimum and maximum
		 for( int g = 0; g < catArray.length; g++) {
			 if(catArray[g] < min)
				 min = catArray[g];
			 
			 if(catArray[g] > max)
				 max = catArray[g];
		 }
		 
		 for( int g = 0; g < windSumArray.length; g++) {
			 if(windSumArray[g] < min1)
				 min1 = windSumArray[g];
			 
			 if(windSumArray[g] > max1)
				 max1 = windSumArray[g];
		 }
		 
		 for( int g = 0; g < pressureSumArray.length; g++) {
			 if(pressureSumArray[g] < min2)
				 min2 = pressureSumArray[g];
			 
			 if(pressureSumArray[g] > max2)
				 max2 = pressureSumArray[g];
		 }
		 
		 System.out.println("\t\t\t" + "Hurricane 1995-2015");
		 System.out.println();
		 System.out.print("Year" + "\t");
		 System.out.printf("%4s\t", "Hurricane");
		 System.out.printf("%4s\t", "Category");
		 System.out.printf("%4s\t", "Pressure (mb)");
		 System.out.printf("%4s\t%n", "Wind Speed (mph)");
		 System.out.println("========================================================================");
		 
		 System.out.println(i);
		 while( i < range ) {
			 i++;
			 System.out.println(dataArray[i]);
		 }
		 
		 System.out.println("========================================================================");
		 System.out.print("\t");
		 System.out.printf("%-9s\t","Average:");
		 System.out.printf("%6.1f\t\t", catAverage);
		 System.out.printf("%7.1f\t\t", pressureAverage);
		 System.out.printf("%6.2f%n", windAverage);
		 System.out.print("\t");
		 System.out.printf("%-9s\t","Minimum:");
		 System.out.printf("%4s\t\t", min);
		 System.out.printf("%5s\t\t", min2);
		 System.out.printf("%5.2f%n", min1 * 1.15078);
		 System.out.print("\t");
		 System.out.printf("%-9s\t","Maximum:");
		 System.out.printf("%4s\t\t", max);
		 System.out.printf("%5s\t\t", max2);
		 System.out.printf("%5.2f%n", max1 * 1.15078);
		 System.out.print("\n");
		 
		 System.out.println("Summary of Categories:");
		 
		 File catAmount = new File("category.txt");
		 Scanner inFile6 = new Scanner(catAmount);
		 
		 String token6 = "";
		 
		 //loops for counting occurrences
		 while(inFile6.hasNext()) {
			 token6 = inFile6.next();
	           
	           while (token6.equals("1")){
	               counter1++;
	               break;
	           } 
	           while(token6.equals("2")) {
	        	   counter2++;
	        	   break;
	           }
	           while(token6.equals("3")) {
	        	   counter3++;
	        	   break;
	           }
	           while(token6.equals("4")) {
	        	   counter4++;
	        	   break;
	           }
	           while(token6.equals("5")) {
	        	   counter5++;
	        	   break;
	           }
		 }
		 System.out.println("\tCat 1: " + counter1);
		 System.out.println("\tCat 2: " + counter2);
		 System.out.println("\tCat 3: " + counter3);
		 System.out.println("\tCat 4: " + counter4);
		 System.out.println("\tCat 5: " + counter5);
		
		 
		 /* The following code are my futile attempts at trying to incorporate user input
		
		Scanner userin = new Scanner(System.in);
		System.out.println("Please enter the year you would like the range to start at (Earliest Year is 1995).");
		String response = userin.next();
		
		System.out.println("Please enter the year you want the range to end at (Latest year is 2015.");
		String response1 = userin.next();
		
		for(String year : yearsArray ) {
			String hurricanes = map.get(year);
			for(String hurricane : dataArray) {
				System.out.println(hurricane);
				continue;
			}
			
		}
		
		if(response.equals("1995")) {
			 for (int j = 11; j >= 0; j--) {
		          if (h - j >= 0) {
		              System.out.println(dataArray[h - j]);
		            }
		        }
		}
		*/
	}
}