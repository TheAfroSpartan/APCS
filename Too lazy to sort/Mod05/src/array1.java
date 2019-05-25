import java.util.Scanner;
import java.util.Random;

public class array1 {
	public static void main (String [] args){
	       
	       Scanner scan = new Scanner(System.in);
	       
	        //System.out.println("Enter a numer");
	        //int in = scan.nextInt();
	        
	        int[] occurrenceArray = new int[10];
	        
	        
	        numberInput(occurrenceArray);
	        displayOccurrences(occurrenceArray);
	    }
	    public static void displayOccurrences(int[] occurrenceArray){
	        System.out.printf("%-7s%s\n", "Number", "Occurrences");
	        
	        for(int i = 1; i < occurrenceArray.length; i++){
	            if(occurrenceArray[i] >0){
	                System.out.printf("%-7s%s\n", i, occurrenceArray[i]);
	            }
	        }
	    }
	    
	    public static void numberInput(int[] occurrenceArray){
	        
	        Random randomNumber = new Random();
	        int number = randomNumber.nextInt(10);
	        int trials = 1;
	        
	        while (trials <= 1000){
	            trials++;
	        while (number != 0 ){
	            occurrenceArray[number]++; //+1 to the location of the index
	            number = randomNumber.nextInt(10);
	            
	            
	        }
	        }
	    }
	}

