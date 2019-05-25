/**
 * @purpose This class instantiates the piList object with two private variables.
 * It contains a mutator method to calculate the amount of darts that hit their target.
 * It contains mutator methods to calculate the estimate of pi from the results of previous mutator method.
 * It contains getter methods for the private instance variable totalHits and pi.
 * 
 * 
 * @author Andrew Owens
 * @version 11/26/18
 *
 */
public class DartsV2 {
	
	//Deceleration of private instance variables
	private double radius;
	private double h,n, pi;
	private int totalHits, darts, trials;
	
	/**
     * Constructor for objects of type DartsV2 and initializes the private instance variables.
     * @param darts1, trials1
     * 
     */
	public DartsV2(int darts1, int trials1) {
		trials = trials1;
		darts = darts1;
		totalHits = 0;
		radius = 1.0;
	}
	
	 /**
     * Mutator method to calculate the total hits from darts thrown (no parameters)
     * Generates two random numbers less than 1 and multiples them by 2.
     * If the sum of the two random numbers squared is less then the radius squared,
     * then plus increment totalHits variable
     */
	public int calculateHits() {
    	
        for (int i = 1; i < trials; i++) {
            h = (2 * Math.random() - 1);
            n = (2 * Math.random() - 1);

            
            if ((Math.pow(h, 2) + Math.pow(n, 2)) <= (Math.pow(radius, 2))) {
                totalHits++;
            }
        }
        return totalHits;
    }
	
	/**
     * Getter method to return the amount of hits (no parameters).
     * @return amount of hits
     */
	public int getHits() {
		return totalHits;
	}

	 /**
     * Mutator method to calculate the estimate of pi (no parameters)
     * Multiplies 4 by the quotient of totalHits divided by number of trials
     * 
     */
    public void calculatePi() {
        pi = (4.0 * ((double)totalHits / (double)trials));
    }
    
    /**
     * Getter method to return the pi estimate (no parameters).
     * @return estimate of pi
     */
    public double getPi() {
    	return pi;
    }
    
    /**
     * Formatting method to format the print of the pi estimate
     * @return formatted print of pi
     */
    public String toString() {
    	return String.format("%12.2f", pi);
    }
}//end of class