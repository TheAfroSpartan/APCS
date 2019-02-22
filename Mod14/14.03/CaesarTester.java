/**
 * This class declares an alphabet as a class constant and tests the 
 * Encryption/Decryption classes
 * 
 * @author Andrew Owens
 * @version 2/8/19
 */
import java.util.Scanner;

public class CaesarTester {
	
	//class constant declared/initialized
	public static final String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
											 "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	//main method
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		String option = "";
		String message = "";
		int shiftKey;
		boolean operational = true;
	
	//try-catch to catch any invalid input	
	try {
		
		//while loop to iterate program until condition is met
		while(operational == true){
		
			System.out.println("Please select an option:");
			System.out.println("A: Encrypt message \nB: Decrypt message \nC: Quit.");
			option = scan.nextLine();
		
		//if loop to encrypt 
		if(option.equalsIgnoreCase("a")){	
			
			System.out.println("Please enter a number from 0~25.");
			shiftKey = scan.nextInt();
			Encryption key = new Encryption(shiftKey);
			scan.nextLine();
			
			System.out.println("Your cipher alphabet is: ");
			key.showCipherAlphabet();
			System.out.println();
			
			System.out.println("Please enter a plaintext message to encrypt.");
			message = scan.nextLine();
			System.out.println(key.encryptor(message));
			
			System.out.println();
			System.out.println("Hit enter to continue.");
			scan.nextLine();
			
		}
		
		//if loop to decrypt
		if(option.equalsIgnoreCase("b")){
			
			System.out.println("Please enter the shift key.");
			shiftKey = scan.nextInt();
			Decryption key = new Decryption(shiftKey);
			scan.nextLine();
			
			System.out.println("Your cipher alphabet is: ");
			key.showDecipherAlphabet();
			System.out.println();
			
			System.out.println("Please enter an encrypted message to decrypt.");
			message = scan.nextLine();
			System.out.println(key.decryptor(message));
			
			System.out.println();
			System.out.println("Hit enter to continue.");
			scan.nextLine();
		
		}
		
		//if loop to terminate while loop
		if(option.equalsIgnoreCase("c")){
			System.out.println("Bye");
			operational = false;
			}
		}
		scan.close();
	}
	//catches invalid input
	catch(Exception e) {
		
		System.out.println("Ivalid Input.");
		}
	}
}
