/**
 * @purpose This class generates a decrypted alphabet according
 *          to the shift key provided in the CaesarTester class and
 *          decrypts the accompanying message according to the encrypted alphabet.
 * 
 * @author Andrew Owens
 * @version 2/7/19
 */
public class Decryption {

	//private array
	private String[] decipher = new String[CaesarTester.alphabet.length];

	/**
	 * Parameterized constructor
	 * @param shiftKey
	 */
	public Decryption(int shiftKey) {
		
		for(int i = 0; i < CaesarTester.alphabet.length; i++) {
			
			decipher[i] = CaesarTester.alphabet[(i + shiftKey)%26];
		}
	}
	
	//method to print encrypted alphabet
	public void showDecipherAlphabet(){
		
		for(String text : decipher){
			
			System.out.print(text + " " );
		}
	}
	
	/**
	 * This method goes through each letter of the message.
	 * When a letter in the message equals a letter in the ciphered alphabet,
	 * the position of the letter in relation to the entire
	 * alphabet is used to find the equivalent letter in the srandard alphabet.
	 * Then added onto the string object out through concatenation. 
	 * @param message
	 * @return encrypted message
	 */
	public String decryptor(String message){
		
		String out = "";
		
		for (int i = 0; i < message.length(); i++){
			
			 if (message.charAt(i) == ' '){
				 
		     out += " ";
			 }
			 
			 else{
				 
				 for (int n = 0; n < decipher.length; n++){
					 
					 if (message.substring(i, i + 1).equalsIgnoreCase(decipher[n])){
						 
						 out += CaesarTester.alphabet[n];
					 }
	             }
			 }
	     }
			return out; 
	}
}
