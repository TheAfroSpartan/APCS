public class Circle
  {

      private double radius;
      private double d;
      //constructors
      // postcondition: the instance variable is initialized
      public Circle(double rad)
      {
    	  radius = rad;
      }

      // postcondition: the instance variable is initialized
      public Circle(int diameter)
      {
    	  d = diameter;
      }

      // postcondition: returns the arcLength of a circle with radius equal to this
      // circle's radius, according to the formula: (PI / 180) * r * deg,
      // where PI is the value of pi (3.1415...), r is the radius of the circle,
      // and deg is the angle in degrees passed as the parameter.
      // Use the Math class constant to represent the value of pi.
      public double arcLength(double degree) 
      {
    	  return (Math.PI/180) * (radius * degree);
      }

      // There may be other instance variables, constructors,
      // and methods that are not shown.

  

public static void main(String[] args) {
	Circle eya;
//	System.out.println(eya.arcLength(45));
	
}
}