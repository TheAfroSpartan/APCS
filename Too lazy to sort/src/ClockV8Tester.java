/*
 * PURPOSE: Expand upon knowledge of OOP
 * 
 * @author: Andrew Owens
 * 
 * @date: 11/20/18
 */
public class ClockV8Tester {
	
	public static void main(String[] args) {
				
				//variables
				double sum = 0;
				double avg = 0;
				double min = Double.MAX_VALUE;
				double max = Double.MIN_VALUE;
				
				//array to get hour time
				double[] hours = new double[3];
				
				//object values entered in as an array
				ClockV8[] times = {new ClockV8(2.5, 4.5, "Henry"),
                        		   new ClockV8(1.25, 5.60, "Elise"),
                        		   new ClockV8(12.30, 16.75, "Danny")};
				
				//loop to calculate time differences and enter in array
				for(int index = 0; index < times.length; index++)
		        {
		            times[index].calcTimeDiff();
		            times[index].calcTimeDiff1();
		        }
				
					//fill array with the hour difference
		            hours[0] = times[0].getTime();
		            hours[1] = times[1].getTime();
		            hours[2] = times[2].getTime();
		          
		        //loop to find max/min values as well as calculate sum    
		        for(int i = 0; i < hours.length; i++) {
		        	if(hours[i] > max) {
		        		max = hours[i];
		        	}
		        	if(hours[i] < min) {
		        		min = hours[i];
		        	}
		        	
		        	sum += hours[i];
		        }
		        
		        avg = sum / hours.length;
				
		        //print results after calculations
				System.out.printf("%40s", "Time Trials");
			    System.out.printf("%6s%15s%15s%25s%19s%n", "\nName", "Time 1","Time 2","Time Difference","Difference" );
			    System.out.printf("%18s%15s%20s%25s%n", "(hrs)", "(hrs)", "(hrs)", "in Minutes");
		        System.out.printf("%30s%n", "______________________________________________________________________________");
		        for(int index = 0; index < times.length; index++)
		        {
		            System.out.print(times[index]); 
		        }
		        System.out.printf("%30s%n", "______________________________________________________________________________");
				
		        System.out.printf("%45s%8.2f%22.0f%n", "Minimum:",  min, min * 60);
		        System.out.printf("%45s%8.2f%22.0f%n", "Maximum:",  max, max * 60);
		        System.out.printf("%45s%8.2f%22.0f%n", "Average:",  avg, avg * 60);
	}
}
