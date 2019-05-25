/*
 * PURPOSE: Run calculations with data provided from ClockV7tester
 * 
 * @author: Andrew Owens
 */
public class ClockV7 {
	
	//instance variables
	private double time1;
	private double time2;
	private String name;
	
	//constructor
	public ClockV7(double time1a, double time2a, String name1) {
		
		time1 = time1a;
		time2 = time2a;
		name = name1;
	}
	
	//method to calculate hour difference between time1 and time2
	public double calcTimeDiff(double time1, double time2) {
		return Math.abs(time1-time2);
	}
	
	//overloaded method to calculate amount of minutes
	public double calcTimeDiff(double hours) {
		return hours * 60;
	}
	
	public String getName() {
		return name;
	}
	
	public double getTime1() {
		return time1;
	}
	
	public double getTime2() {
		return time2;
	}
}