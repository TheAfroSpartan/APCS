
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Andrew Owens
 * @version 2/3/19
 */
import java.util.*;
public class ShapesTester4
{
	//main method
    public static void main(String []args)
    {
        Rectangle4 one = new Rectangle4(5, 20);
        Rectangle4 two = new Box4(4,4,4);
        Rectangle4 three = new Cube4(4,4,4);
        Rectangle4 four = new Trapezoid4(7,6,5,8);
        Rectangle4 five = new Square4(3,3);

        //Create ArrayList to store objects
        ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add(five);

        //enhanced for loop to print dimensions
        for(Rectangle4 rect: shapes)
        {
        	showEffectBoth(rect);
            System.out.println();
        }
    
        
        System.out.println("Test for Equality: ");
        
        //loop to compare dimensions
        for(int i = 0; i < shapes.size() - 1; i++) {

            if (shapes.get(i).equals(shapes.get(i + 1))) {
                System.out.println("Shapes[" + i + "] is equal to Shapes[" + (i + 1) + "]");
            } else {
                System.out.println("Shapes[" + i + "] is not equal to Shapes[" + (i + 1) + "]");
            }

        }
      
    }
    //method to print
    public static void showEffectBoth(Rectangle4 r)
    {
        System.out.println(r);
    }

}