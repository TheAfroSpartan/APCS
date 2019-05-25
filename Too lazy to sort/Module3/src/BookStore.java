/*
 * 
 * PURPOSE: A challenge to evaluate our knowledge of substrings

 * 			and storing user input.
 * 
 * @author: Andrew Owens
 * @Version: 09/10/18
 * 
 */
import java.util.Scanner;
import java.util.Random; 

public class BookStore {

	public static void main(String[] args) {
		
		Random rand = new Random(); //generate order number
        Scanner in = new Scanner(System.in); //takes in user input
        
        int cost = 0;
        int hardback = 15;
        int paperback = 10;
        int n = rand.nextInt(1000) + 1; //order number will be between 1 and 100
        
        
        System.out.println("Welcome to Andrew's Book Store!");
        System.out.println("Please enter your first and last name. ");
        String name = in.nextLine();
        String firstin = name.substring(0,1); //returns first letter
        String[] splitname = name.split("\\s+"); // splits the input at the space between first and last name
        
        System.out.println("Please enter the date (mm/dd/yyyy). ");
        String date = in.nextLine();
        
        System.out.println("What book would you like to purchase?");
        String book = in.nextLine();
        
        System.out.println("How many copies would you like?");
        int booknum = in.nextInt(); //stores input as integer
        
        System.out.println("Would you like hardback ($15) or paperback ($10)?");
        String response = in.next();
        
        System.out.println("Enter your debit card number (#####-###-####): ");
        String debit = in.next();
        String digits = debit.substring(8, 12); //assigns the last 4 numbers to digits
        
        
        System.out.println("Enter your PIN (####): ");
        String pin = in.next();
        
        //if statements for the users response
        if(response.equals("hardback")) {
          
          cost = hardback * booknum;
       
        }else if (response.equals("paperback")){
            
            cost = paperback * booknum;
        
        }
        
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");
        System.out.println("Your e-Receipt");
        System.out.println();
        
        System.out.println(date);
        System.out.println("Order number: " + n);
        System.out.println();
        
        System.out.println(firstin + "." + " " + splitname[1]); //I split name into two earlier so I can use an index to return the last name
        System.out.println("Account: #####-###-" + digits);
        System.out.println("Book: " + book);
        System.out.println("Number of Copies: " + booknum);
       
        //if statements depending on whether the user wanted paperback or hardback
        if(response.equals("hardback")) {
        	
        	System.out.println("Cost of a Hardback book: $" + hardback);
        
        }else if (response.equals("paperback")){
        	
        	System.out.println("Cost of a Paperback book: $" + paperback);
       
        }
        
        System.out.println();
        System.out.println("$" + cost + " will be debited to your account.");
        System.out.println();
        
        System.out.println("Thank you for your purchase. Enjoy your book!");
        System.out.println("*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*");

	}

}
