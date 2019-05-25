/**
 * PURPOSE: Test our knowledge of the PrintWriter method and our knowledge
 * 			of previously covered topics.
 *
 * @author Andrew Owens
 * @version 10/03/18
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class SecretPasscodes {

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		PrintWriter outFile = new PrintWriter(new File("ascii.txt"));

		//intro
		System.out.println("		Password Generator Menu");
		System.out.println("******************************************************");
		System.out.println("*	[1] Lowercase Letters                        *");
		System.out.println("*	[2] Uppercase Letters                        *");
		System.out.println("*	[3] Lowercase Letters and Symbols            *");
		System.out.println("*	[4] Uppercase Letters and Symbols            *");
		System.out.println("*	[5] Quit                                     *");
		System.out.println("******************************************************");
		
		System.out.println("Enter Selection (1-5): ");
		String response = in.next();
		
		//terminate program if 5 is input
		while(response.equals("5")) {
			
		if(response == "5") {
		break;
			}
		}
		
		//loop for wrong input
		while(!(response.equals("1") || response.equals("2") || response.equals("3")
				|| response.equals("4") || response.equals("5")))
		{
			System.out.println("Please try again");
			System.out.println();
			System.out.println("Enter Selection (1-5): ");
			response = in.next();
			
			//breaks loop if input is now correct
			if(response.equals("1") || response.equals("2") || response.equals("3")
				|| response.equals("4") || response.equals("5")) {
				break;
			}		
		
		}
		
		//terminate program if 5 is input after correction
		while(response.equals("5")) {
			
			if(response == "5") {
			break;
			}
		}
		
		
		System.out.println("Password Length (6 or more): ");
		int length = in.nextInt();
		
		//password length loop
		while (length < 6) {
			System.out.println("INVALID OPTION. Please try again");
			length = in.nextInt();
		}
		
		//loop to generate ascii values
		while(response.equals("1")) {
			
			for(int loop = 1; loop <= (length / 2); loop++) {
				int numbers = (int)(Math.random() * ((57 - 48) + 1)) + 48;
				int letters = (int)(Math.random() * ((122 - 97) + 1)) + 97;
				outFile.println(numbers);
				outFile.println(letters);
			}
			
			break;
		}
		
		//loop to generate ascii values
		while(response.equals("2")) {
			
			for(int loop = 1; loop <= (length / 2); loop++) {
				int numbers = (int)(Math.random() * ((57 - 48) + 1)) + 48;
				int letters = (int)(Math.random() * ((90 - 65) + 1)) + 65;
				outFile.println(numbers);
				outFile.println(letters);
			}
			
			break;
		}
		
		//loop to generate ascii values
		while(response.equals("3")) {
			
			for(int loop = 1; loop <= (length / 2); loop++) {
				int symbols = (int)(Math.random() * ((64 - 58) + 1)) + 58;
				int letters = (int)(Math.random() * ((122 - 97) + 1)) + 97;
				outFile.println(symbols);
				outFile.println(letters);
			}
			
			break;
		}
		
		//loop to generate ascii values
		while(response.equals("4")) {
			
			for(int loop = 1; loop <= (length / 2); loop++) {
				int symbols = (int)(Math.random() * ((64 - 58) + 1)) + 58;
				int letters = (int)(Math.random() * ((90 - 65) + 1)) + 65;
				outFile.println(symbols);
				outFile.println(letters);
			}
			
			break;
		}
		
		outFile.close();
		
		File chars = new File ("ascii.txt");
		PrintWriter outFile1 = new PrintWriter(new File("password.txt"));
		Scanner inFile = new Scanner(chars);
		
		//read ascii values and convert into characters for password
		 while( inFile.hasNext() ){
	           
	           int token = inFile.nextInt();
	           outFile1.println((char) token);
		 }
		 
		 outFile1.close();
		 	
		 	PrintWriter outFile2 = new PrintWriter(new File("ascii2.txt"));
		 	System.out.println("Enter Selection (1-5): ");
			String response1 = in.next();
			
			//loop for if user only wants one password
			while(response1.equals("5")) {
				
				 System.out.println("Thank You for using the Pass Code Generator.");
				 System.out.println();
				 
				 System.out.println("Here are your randomly generated codes:");
				 System.out.print("  1 \t");
			 
				 File passwords1 = new File ("password.txt");
				 Scanner passwordFile = new Scanner(passwords1);
				 String token = "";
				 
				 while(passwordFile.hasNext()) {
					 token = passwordFile.next();
					 System.out.print(token);
				 }
				
				//terminate program if 5 is input
				if(response1 == "5") {	 
					break;
					}
				break;
			}
			
			//terminate program if 5 is input
			while(response1.equals("5")) {
				
				if(response1 == "5") {
					break;
				}
			}
			
			//loop for correct second password input
			while(!(response1.equals("1") || response1.equals("2") || response1.equals("3")
					|| response1.equals("4") || response1.equals("5")))
			{
				System.out.println("Please try again");
				System.out.println();
				System.out.println("Enter Selection (1-5): ");
				response1 = in.next();
				
				if(response1.equals("1") || response1.equals("2") || response1.equals("3")
					|| response1.equals("4") || response1.equals("5")) {
					break;
				}
				
				
			
			}
			
			
			System.out.println("Password Length (6 or more): ");
			int length1 = in.nextInt();
			
			//loop for if length is less than 6
			while (length1 < 6) {
				System.out.println("INVALID OPTION. Please try again");
				length1 = in.nextInt();
			}
			
			//loop to generate ascii values
			while(response1.equals("1")) {
				
				for(int loop = 1; loop <= (length1 / 2); loop++) {
					int numbers1 = (int)(Math.random() * ((57 - 48) + 1)) + 48;
					int letters1 = (int)(Math.random() * ((122 - 97) + 1)) + 97;
					outFile2.println(numbers1);
					outFile2.println(letters1);
				}
				
				break;
			}
			
			//loop to generate ascii values
			while(response1.equals("2")) {
				
				for(int loop = 1; loop <= (length1 / 2); loop++) {
					int numbers1 = (int)(Math.random() * ((57 - 48) + 1)) + 48;
					int letters1 = (int)(Math.random() * ((90 - 65) + 1)) + 65;
					outFile2.println(numbers1);
					outFile2.println(letters1);
				}
				
				break;
			}
			
			//loop to generate ascii values
			while(response1.equals("3")) {
				
				for(int loop = 1; loop <= (length1 / 2); loop++) {
					int symbols1 = (int)(Math.random() * ((64 - 58) + 1)) + 58;
					int letters1 = (int)(Math.random() * ((122 - 97) + 1)) + 97;
					outFile2.println(symbols1);
					outFile2.println(letters1);
				}
				
				break;
			}
			
			//loop to generate ascii values
			while(response1.equals("4")) {
				
				for(int loop = 1; loop <= (length1 / 2); loop++) {
					int symbols1 = (int)(Math.random() * ((64 - 58) + 1)) + 58;
					int letters1 = (int)(Math.random() * ((90 - 65) + 1)) + 65;
					outFile2.println(symbols1);
					outFile2.println(letters1);
				}
				
				break;
			}
			
			outFile2.close();
			
			File chars1 = new File ("ascii2.txt");
			PrintWriter outFile3 = new PrintWriter(new File("password2.txt"));
			Scanner inFile1 = new Scanner(chars1);
			
			//read ascii2 and convert to characters for password
			 while( inFile1.hasNext() ){
		           
		           int token1 = inFile1.nextInt();
		           outFile3.println((char) token1);
			 }
			 
			 outFile3.close();
			 
			 System.out.println("Thank You for using the Pass Code Generator.");
			 System.out.println();
			 
			 System.out.println("Here are your randomly generated codes:");
			 
			 System.out.print("  1 \t");
		 
			 File passwords1 = new File ("password.txt");
			 Scanner passwordFile = new Scanner(passwords1);
			 String token = "";
			
			 //print out password
			 while(passwordFile.hasNext()) {
				 token = passwordFile.next();
				 System.out.print(token);
			 }
			 
			 System.out.println();
			 
			 System.out.print("  2 \t");
			 
			 File passwords2 = new File ("password2.txt");
			 Scanner passwordFile2 = new Scanner(passwords2);
			 String token1 = "";
			 
			 //print out passwprd.
			 while(passwordFile2.hasNext()) {
				 token1 = passwordFile2.next();
				 System.out.print(token1);
			 }
	}

}
