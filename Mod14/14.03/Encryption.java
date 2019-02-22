/**
 * @purpose This class generates an encrypted alphabet according
 *          to the shift key provided in the CaesarTester class and
 *          encrypts the accompanying message according to the encrypted alphabet.
 * 
 * @author Andrew Owens
 * @version 2/7/19
 */
public class Encryption {

	//private array
	private String[] cipher = new String[CaesarTester.alphabet.length];
	
	/**
	 * Parameterized constructor
	 * @param shiftKey
	 */
	public Encryption(int shiftKey) {
		
		for(int i = 0; i < CaesarTester.alphabet.length; i++) {
			
			cipher[i] = CaesarTester.alphabet[(i+shiftKey)%26];
		}
	}
	
	//method to print encrypted alphabet
	public void showCipherAlphabet(){
		
		for(String text : cipher){
			
			System.out.print(text + " " );
		}
	}
	
	/**
	 * This method goes through each letter of the message.
	 * When a letter in the message equals a letter in the standard alphabet,
	 * the position of the letter in relation to the entire
	 * alphabet is used to find the equivalent letter in the ciphered alphabet.
	 * Then added onto the string object out through concatenation. 
	 * @param message
	 * @return encrypted message
	 */
	public String encryptor(String message){
		
		String out = "";
		
		for (int i = 0; i < message.length(); i++){
			
			 if (message.charAt(i) == ' '){
				 
		     out += " ";
			 }
			 
			 else{
				 
				 for (int n = 0; n < cipher.length; n++){
					 
					 if (message.substring(i, i + 1).equalsIgnoreCase(CaesarTester.alphabet[n])){
						 
						 out += cipher[n];
					 }
	             }
			 }
	     }
			return out; 
	}
}
