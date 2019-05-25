
public class CircleStats {
	
	public CircleStats() {
		
	}
	
	public double calcCircleArea(int diameter) {
		return 0.25 * (Math.PI * Math.pow(diameter, 2)); 
	}
	
	public double calcCircleArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
}
