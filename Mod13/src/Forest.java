/**
 * This class defines a Forest object by extending the Terrain.
 * Contains a getter method.
 *
 * @author Andrew Owens
 * @version 1/31/19
 */
public class Forest extends Terrain{
	
	//instance variables
	private int trees;

	// Constructor for objects of class Desert
	public Forest(int l, int w, int numTrees) {
		
		//call superclass
		super(l, w);
		// initialize instance variables
		trees = numTrees;
	}
	
	// Concatenates a String to show the number of dunes
	public String getTrees() {
		return trees + " trees";
	}

}