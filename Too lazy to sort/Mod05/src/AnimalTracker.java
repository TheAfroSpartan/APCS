/**
 * The purpose of this program is to demonstrate the PrintWriter 
 * class and its methods for writing to text files.
 *
 * @author Andrew Owens
 * @version 06/05/17
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class AnimalTracker
{
    public static void main (String [ ] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        PrintWriter outFile = new PrintWriter(new File("animals.txt"));
        
        System.out.println("Welcome to the Bald Eagle Simulator");
        System.out.println();
        System.out.println("How many trials should be simulated?");
        System.out.println("Please enter a number larger than 1000.");
        int trials = in.nextInt();
        
        while (trials <= 1000) {
        	System.out.println("Please try again. Please enter a number larger than 1000.");
        	System.out.println();
        	System.out.println("How many trials should be simulated?");
        	trials = in.nextInt();
        }
        	
        
        
       for (int loop = 1; loop <= trials; loop++)
       {
           int number = rand.nextInt(10) + 1;
           outFile.println(number);
       
       }//end for loop

       outFile.close( );    //close the file when finished
       
       PrintWriter outfile1 = new PrintWriter(new File("count.txt"));
       
       File animals = new File("animals.txt");
       Scanner inFile = new Scanner(animals);
       
       String token = "";
       int count = 0;
       
       while( inFile.hasNext() ){
           
           token = inFile.next();
           count++;
           
           while (token.equals("10")){
              
        	   outfile1.println(count);
               count = 0;
 
               break;
           }
       }
       outfile1.close();
       
       
       File counter = new File("count.txt");
       Scanner inCounter = new Scanner (counter);
       int cToken;
       double average;
       int avgcounter = 0;
       int sum = 0;
       
       
       while( inCounter.hasNextInt()) {
    	   
    	   cToken = inCounter.nextInt();
    	   avgcounter++;
    	   //System.out.println(cToken);
    	   sum += cToken;
    	   //System.out.println("Sum: " + sum + " avgc: " + avgcounter);
    	   
    	   
    	   //average = sum / avgcounter;
    	   //System.out.println("The average is: " + average);
    	   
       }
       
       average = (double)sum / (double)avgcounter;
	   System.out.println("The average is: " + average);
       
    }//end of main method
}//end of class