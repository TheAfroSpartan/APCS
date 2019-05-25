/**
 * @purpose: This class instantiates the footprint object wit three private variables.
 * It contains mutator methods to calculate the amount of CO2 in tons and to convert tons into pounds.
 * It contains getter methods for each private instance variable.
 * Private instance variables include myGallonsUsed, myTonsCO2, myPoundsCO2.
 * 
 * @author Andrew Owens
 * @version 2/11/19
 *
 */
public class CO2FootprintV2
{
	//Deceleration of private instance variables
    private double gallons, myTonsCO2, myPoundsCO2;

    /**
     * Constructor for objects of type CO2FootprintV2
     * @param gallons of oil
     * Precondition: there is an amount of gallons greater than or equal to 0
     */
    CO2FootprintV2(double gallons)
    {
        this.gallons = gallons;
    }

    /**
     * Mutator method to calculate the tons of CO2 produced from gallons consumed (no parameters).
     * Multiplies the amount of CO2 produced per gallon of gasoline (8780 grams) in scientific notation by the amount of gallons used.
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * this.gallons;
    }

    /**
     * Mutator method to convert the amount of tons into pounds (no parameters).
     * Multiplies the amount of tons by the amount of pounds per ton.
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of gallons used (no parameters).
     * @return gallons used
     */
    public double getGallons()
    {
        return this.gallons;
    }

    /**
     * Getter method to return the amount of tons of CO2 produced (no parameters).
     * @return tons produced
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the amount of pounds of CO2 produced (no parameters).
     * @return pounds produced.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}
