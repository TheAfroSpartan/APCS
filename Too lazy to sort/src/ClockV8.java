/*
 * PURPOSE: Calculate the difference in time between two given times.
 * 
 * @author: Andrew Owens
 */
public class ClockV8 {
	//instance variables
		private double myTime, myTime1;
		private double time1;
		private double time2;
		private String name;
		
		//constructor
		public ClockV8(double time1a, double time2a, String name1) {
			
			time1 = time1a;
			time2 = time2a;
			myTime = 0.0;
			myTime1 = 0.0;
			name = name1;
		}
		
		//method to calculate hour difference between time1 and time2
		public void calcTimeDiff() {
			myTime =  (Math.abs(time1-time2));
		}
		
		
		public double getTime(){
			return myTime;
		}
		
		//method to calculate minute difference between time1 and time2
		public void calcTimeDiff1() {
			myTime1 =  (Math.abs(time1-time2)) * 60;
		}
		
		public double getTimea(){
			return myTime1;
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
		
		
		public String toString() {
			return String.format("%-5s%13.2f%15.2f%20.2f%22.0f%n", name, time1, time2, myTime, myTime1);
		}
		
}