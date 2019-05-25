/**
 * PURPOSE: Learn the PrintWriter class and its methods for writing to text files. 
 * 			Also learn how to read from recently created text files and use the 
 * 			data read from the file.
 *
 * @author Andrew Owens
 * @version 10/01/18
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class AnimalPopulation
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
        
        //input validation loop
        while (trials <= 1000) {
        	System.out.println("Please try again. Please enter a number larger than 1000.");
        	System.out.println();
        	System.out.println("How many trials should be simulated?");
        	trials = in.nextInt();
        } //end of while loop
        	
        
        //loop for printing specified amount of random numbers
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
       int count = 0; // tracks the number of lines until 10 is generated
       
       //loop for counting lines until 10 is "spotted"
       while( inFile.hasNext() ){
           
           token = inFile.next();
           count++;
           
           while (token.equals("10")){
              
        	   outfile1.println(count);
               count = 0;
 
               break;
               
           } //end of nested while
       } //end of main while
       
       outfile1.close();
       
       File counter = new File("count.txt");
       Scanner inCounter = new Scanner (counter);
       int cToken;
       double average;
       int avgcounter = 0; //variable for the amount of lines generated in count.txt file
       int sum = 0;
       
       //loop for calculating sum and determining what to divide sum by
       while( inCounter.hasNextInt()) {
    	   
    	   cToken = inCounter.nextInt();
    	   avgcounter++;
    	   sum += cToken;
   
       } //end of while loop
       
       average = (double)sum / (double)avgcounter;
	   
       System.out.println("The Results!");
       System.out.println("The average number of birds observed until spotting a Bald Eagle at "
       						+ "the national park is: " + average);
       
    }//end of main method
}//end of class