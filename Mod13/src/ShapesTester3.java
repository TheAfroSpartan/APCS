
/**
 * This class demonstrates classes that override
 * the toString method.
 *
 * @author Poly Morphism
 * @version 06/13/17
 
import java.util.*;
public class ShapesTester3
{
    public static void main(String []args)
    {
        Rectangle3 one = new Rectangle3(5, 20);
        Rectangle3 two = new Box3(4,4,4);
        Rectangle3 three = new Cube4(4,4,4);
        Rectangle3 four = new Trapezoid4(7,6,5,8);
        Rectangle3 five = new Square4(3,3);

        //Print all shapes
        ArrayList<Rectangle3> shapes = new ArrayList<Rectangle3>();

        shapes.add( one );
        shapes.add( two );
        shapes.add( three );
        shapes.add( four );
        shapes.add(five);

        for(Rectangle3 rect: shapes)
        {
        	showEffectBoth(rect);
            System.out.println();
        }
    
        
        System.out.println("Test for Equality: ");
        
        for(int i = 0; i < shapes.size() - 1; i++) {

            if (shapes.get(i).equals(shapes.get(i + 1))) {
                System.out.println("Shapes[" + i + "] is equal to Shapes[" + (i + 1) + "]");
            } else {
                System.out.println("Shapes[" + i + "] is not equal to Shapes[" + (i + 1) + "]");
            }

        }
      
    }
    
    public static void showEffectBoth(Rectangle3 r)
    {
        System.out.println(r);
    }

}*/