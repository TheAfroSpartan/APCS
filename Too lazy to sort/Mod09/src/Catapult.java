/**
 * @purpose This Class instantiates the launch object with two private variables.
 * 			It contains a mutator method to calculate the velocity of the projectile.
 * 			It contains a mutator method to multiply the angle by sin and 2.
 * 			It contains a mutator method to calculate the range of the projectile.
 * 			It contains getter methods for the private instance variables velocity, angle, range.
 * 
 * @author Andrew Owens
 *
 * @version 2/11/19
 *
 */
public class Catapult {
	//Decleration of private instance variables
	private  double velocity;
	private  double angle;
	private  double range;
	
	/**
	 * Constructor for objects of type Catapult and initializes the private instance variables
	 * also converts input KPH into m/s.
	 * @param velocity1
	 * @param angle1
	 */
	public Catapult(double velocity, double angle) {
		this.velocity = velocity * 0.277778;
		this.angle = angle;
	}
	
	/**
	 * Mutator method to square the velocity(no parameters)
	 * Multiplies velocity with itself.
	 */
	public void calcVelocity() {
		this.velocity = Math.pow(this.velocity, 2);
	}
	
	/**
	 * Getter method to return the velocity (no parameters)
	 * @return velocity
	 */
	public double getVelocity() {
		return this.velocity;
	}
	
	/**
	 * Mutator method to calculate the angle for the Range equation (no parameters)
	 * Multiplies sin by (2 * angle)
	 */
	public void calcAngle() {
		this.angle = Math.sin(2* this.angle);
	}
	
	/**
	 * Getter method to return the angle (no parameters)
	 * @return angle
	 */
	public double getAngle() {
		return this.angle;
	}
	
	/**
	 * Mutator method to calculate the range of the projectile (no parameters)
	 * Multiplies velocity by angle and then divides by 9.8 (the acceleration due to gravity)
	 */
	public void calcRange() {
		this.range = (this.velocity * this.angle)/9.8;
	}
	
	/**
	 * Getter method to return the range (no parameter)
	 * @return range
	 */
	public double getRange() {
		return this.range;
	}
	
	/**
	 * Formatting method to format the print of the range (no parameters)
	 * @return formatted print of range
	 */
	public String toString()
    {
        return String.format("%12.5f", this.range);
    }
	
}