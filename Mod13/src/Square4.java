/**
 * This class defines a Square object by extending Rectangle4 
 * using length and width.
 * The toString method has been added.
 *
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
public class Square4 extends Rectangle4 {

	// Constructor for objects of class Square
	public Square4(int l, int w) {
		// call superclass
		super(l, w);
		
	}
	 // String to display when object is printed.
	 public String toString()
	    {
	        return "The square's dimensions are " + getLength() + " X " + getWidth();
	    }

}
