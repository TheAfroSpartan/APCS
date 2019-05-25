/**
 * This class defines a Cube object be extending Box4
 * using length and width and includes height.
 * The toString method has been added.
 *
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
public class Cube4 extends Box4 {

	// instance variables
	private int height;
	
	// Constructor for objects of class Box
	public Cube4(int l, int w, int h) {
		// call superclass
		super(l, w, h);
		// initialize instance variables
		this.height = h;
	}

	// return the height
	public int getHeight()
    {
        return this.height;
    }
	 // String to display when object is printed.
	public String toString()
    {
        return "The cube's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }

	//instanceof method to compare
	public boolean equals(Object object)
    {
    	if (! (object instanceof Cube4))
            return false;
            
        Cube4 t = (Cube4) object;
        return t.getLength() == getLength() && t.getHeight() == getHeight() && t.getWidth() == getWidth();
    }
}
