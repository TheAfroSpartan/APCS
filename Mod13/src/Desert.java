/**
 * This class defines a Desert object by extending the Terrain.
 * Contains a getter method.
 *
 * @author Andrew Owens
 * @version 1/31/19
 */
public class Desert extends Terrain{
	
	//instance variables
	private int dunes;
	
	// Constructor for objects of class Desert
	public Desert(int l, int w, int numDunes) {
		
		//call superclass
		super(l, w);
		// initialize instance variables
		dunes = numDunes;
	}

	// Concatenates a String to show the number of dunes
	public String getDunes() {
		return dunes + " dunes";
	}
}