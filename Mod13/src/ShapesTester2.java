 /**
 * This class tests extending classes from
 * Circle2 to OvalCylinder2
 *
 * @author Andrew Owens
 * @version 1/30/19
 */
import java.util.ArrayList;

public class ShapesTester2 {

	/**
	 * The polymorphic method. Prints out object's name and receives center. 
	 * @param list
	 * @return shapes name and center
	 */
	public static String showCenter(Circle2 list) {
		return "For this " + list.getName() + " the " + list.getCenter();
	}
	
	/**
	 * Main Method. Declares ArrayList and initializes objects.
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Circle2> circle = new ArrayList<Circle2>();
		
		circle.add(new Circle2(2,4,5));
		circle.add(new Cylinder2(10,15,12,11));
		circle.add(new Oval2(25,10,12,15));
		circle.add(new OvalCylinder2(40,10,22,11,12));
		
		/**
		 * Enhanced for loop to evoke showCenter method with the objects in the ArrayList 
		 */
		for(Circle2 list : circle) {
			System.out.println(showCenter(list));
		}
	}
}
