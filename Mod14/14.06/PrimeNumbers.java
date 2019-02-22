/**
 *@purpose This class instantiates the private variables lowerLimit and upperLimit.
 *         It contains a mutator method that calculates the prime numbers within the range
 *         and counts the number of prime numbers that occur within the range.
 * 
 *@author Andrew Owens
 *@version 2/11/19
 */
public class PrimeNumbers {

	//instance variables
	private int upperLimit;
	private int lowerLimit;
    private int counter;
    
    /**
     * Parameterized constructor, initializes instance variables
     * 
     * @param lowerLimit
     * @param upperLimit
     */
    public PrimeNumbers(int lowerLimit, int upperLimit){
    	this.lowerLimit = lowerLimit;
    	this.upperLimit = upperLimit;
    }            
   
    /**
     * This method calculates each prime number within a given range.
     * Also counts the number of primes within the range.
     * 
     * @return counter
     */
    public int calcPrimeNumbers(){
    	
    	int i = 0; 
    	int j = 0; 
    	int primeNum = 0;
        
        for (i = lowerLimit; i < upperLimit; i++) { 
            
        	for (j = 2; j < i; j++) { 

                primeNum = i % j; 

                    if (primeNum == 0) 
                       
                    	break; 
            	} 
            
        	if (i == j){ 
            
            	System.out.println(i); 
            	counter++;
            }
        } 
        
        return counter;
    }
    
    /**
     * Getter method to get counter
     * 
     * @return counter
     */
    public int getCounter() {
    	
    	return counter;
    }
}
