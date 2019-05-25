/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
public class Box4 extends Rectangle4
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box4(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        height = h;
    }

    // return the height
    public int getHeight()
    {
        return height;
    }

    // String to display when object is printed.
    
    public String toString()
    {
    	 return "The box's dimensions are " + getLength() + " X " + getWidth() + " X " + height;
    }
  //instanceof method to compare
    public boolean equals(Object object)
    {
    	if (! (object instanceof Box4))
            return false;
            
        Box4 t = (Box4) object;
        return t.getLength() == getLength() && t.getHeight() == getHeight() && t.getWidth() == getWidth();
    }
}