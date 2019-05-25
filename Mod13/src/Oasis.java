/**
 * This class defines a Desert object by extending the Desert class.
 * Contains a getter method.
 *
 * @author Andrew Owens
 * @version 1/31/19
 */
public class Oasis extends Desert {

	//instance variables
	private int water;
	
	// Constructor for objects of class Desert
	public Oasis(int l, int w, int numDunes, int lake) {
		
		//call superclass
		super(l, w, numDunes);
		// initialize instance variables
		water = lake;
	}
	
	// Concatenates a String to show the number of dunes
	public String getWater() {
		return water + " gallons of water";
	}
}