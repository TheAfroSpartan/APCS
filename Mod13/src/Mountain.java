 /**
 * This class defines a Mountain region object by extending a Terrain.
 * Contains a getter method.
 *
 * @author Andrew Owens
 * @version 1/31/19
 */
public class Mountain extends Terrain {
	
	//instance variable
	private int mountains;
	
	// Constructor for objects of class Mountain
	public Mountain(int l, int w, int numMountains) {
		//call superclass
		super(l, w);
		// initialize instance variables
		mountains = numMountains;
	}
	
	// Concatenates a String to show the number of mountains in the region
	public String getMountains() {
		return mountains + " mountains";
	}

}