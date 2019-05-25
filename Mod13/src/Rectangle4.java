
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
public class Rectangle4
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle4(int l, int w)
    {
        // initialize instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "The rectangle's dimensions are " + length + " X " + width;
    }
  //instanceof method to compare
    public boolean equals(Object object)
    {
        if (! (object instanceof Rectangle4))
            return false;
            
        Rectangle4 t = (Rectangle4) object;
        return t.getLength() == getLength() && t.getWidth() == getWidth();
    }
}