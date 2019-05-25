/**
 * This class defines a WinterMountain object by extending the Mountain class.
 * Contains a getter method.
 *
 * @author Andrew Owens
 * @version 1/31/19
 */
public class WinterMountain extends Mountain {
	
	//instance variables
	private double temp;
	
	// Constructor for objects of class Desert
	public WinterMountain(int l, int w, int numMountains, double degrees) {
		
		//call superclass
		super(l, w, numMountains);
		// initialize instance variables
		temp = degrees;
	}

	// Concatenates a String to show the number of dunes
	public String getTemp() {
		return "temperature " + temp + " degrees";
	}
}