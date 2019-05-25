/**
 * @purpose This Class instantiates the fibNum object with a single variable.
 * 			It contains a mutator method to calculate the Fibonacci number
 * 
 * @author Andrew Owens
 *
 * @version 1/21/19
 *
 */
class Fibonacci {
	
	/**
	 *Default constructor 
	 * 
	 */
	public Fibonacci() {
		
	}
	
	/**
	 * Mutator method to calculate Fibonacci number
	 * @param num
	 * @return num
	 */
	public int number(int num) {
		
		if (num == 0) {
			 return 0;
		 }
		 else if(num == 1) {
			 return 1;
		 }
		 else if(num > 46) {
			 return (Integer)null;
		 }
		 else {
			 
			 return number(num - 1) + number(num - 2);
		 }
		
	}
}
