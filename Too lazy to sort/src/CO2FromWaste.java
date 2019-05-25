/**
 * @purpose This class instantiates the households object with five private variables.
 * It contains a mutator method to calculate the total amount of emissions produced by people.
 * It contains mutator methods to calculate the reduction of emissions by recycling.
 * It contains getter methods for each private instance variable.
 * 
 * 
 * @author Andrew Owens
 * @version 11/21/18
 *
 */
public class CO2FromWaste
{
	//Deceleration of private instance variables
    private double totalEmissions, netEmissions;
    private double reduction = 0;
    private int people;
    private boolean privPaper, privPlastic, privGlass, privCans;

    /**
     * Constructor for objects of type CO2FromWaste and initializes the private instance variables.
     * @param numPeople, paper, plastic, glass, cans
     * 
     */
    CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
    {
        people = numPeople;
        privPaper = paper;
        privPlastic = plastic;
        privGlass = glass;
        privCans = cans;
    }

    /**
     * Mutator method to calculate the total emissions produced by a given number of people (no parameters)
     * Multiplies the value of people by the pounds of CO2 the average person produces.
     */
    public void calcGrossWasteEmission() {
    	
    	totalEmissions = people * 1018;
    }

    /**
     * Mutator method to calculate the reduction in emissions after recycling (no parameters).
     * Adds the amount of CO2 recycling reduces to reduction.
     * Multiplies the amount of reduction with the value of people.
     */
    public void calcWasteReduction() {
    	
    	if(privPaper) {
    		
    		reduction += 184;
    	}
    	if(privPlastic) {
    		
    		reduction += 25.6;
    	}
    	if(privGlass) {
    		
    		reduction += 46.6;
    	}
    	if(privCans){
    		
    		reduction += 165.8;
    	}
    	
    	reduction *= people;
    }

    /**
     * Mutator method to calculate the value of netEmissions (no parameters).
     * Subtracts reduction from totalEmissions
     */
    public void calcNetWasteReduction() {
    	
    	netEmissions = totalEmissions - reduction;
    }

    /**
     * Getter method to return the amount of people (no parameters).
     * @return amount of people
     */
    public int getNumPeople() {
    	
    	return people;
    }

    /**
     * Getter method to return whether or not paper was recycled (no parameters).
     * @return paper recycled true/false.
     */
    public boolean getPaper() {
    	
    	return privPaper;
    }
    
    /**
     * Getter method to return whether or not plastic was recycled (no parameters).
     * @return plastic recycled true/false.
     */
    public boolean getPlastic() {
    	
    	return privPlastic;
    }
    
    /**
     * Getter method to return whether or not glass was recycled (no parameters).
     * @return glass recycled true/false.
     */
    public boolean getGlass() {
    	
    	return privGlass;
    }
    
    /**
     * Getter method to return whether or not cans was recycled (no parameters).
     * @return cans recycled true/false.
     */
    public boolean getCans() {
    	
    	return privCans;
    }
    
    /**
     * Getter method to return totalEmissions (no parameters).
     * @return totalEmissions.
     */
    public double getTotalEmissions() {
    	
    	return totalEmissions;
    }
    
    /**
     * Getter method to return the amount of CO2 reduced (no parameters).
     * @return reduction
     */
    public double getReduction() {
    	
    	return reduction;
    }
    
    /**
     * Getter method to return the net emissions (no parameters).
     * @return netEmissions
     */
    public double getNetEmissions() {
    	
    	return netEmissions;
    }
}//end of class
