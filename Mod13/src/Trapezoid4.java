/**
 * This class defines a Trapezoid object by extending Rectangle4 
 * using length and width and includes side and and side2.
 * The toString method has been added.
 *
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
public class Trapezoid4 extends Rectangle4 {
	
	// instance variables
	private int side1, side2;
	
	// Constructor for objects of class Trapezoid
	public Trapezoid4(int l, int w, int s1, int s2) {
		// call superclass
		super(l, w);
		// initialize instance variables
		side1 = s1;
		side2 = s2;
	}
	// return the side1
	public int getSide1()
    {
        return side1;
    }
	// return the side2
	public int getSide2() {
		
		return side2;
	}
	 // String to display when object is printed.
	public String toString()
    {
        return "The Trapezoid's dimensions are " + getLength() + " X " + getWidth() + " X " + side1 + " X " + side2;
    }
}
