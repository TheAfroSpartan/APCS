/*
 * 
 * PURPOSE: Demonstrate our understanding of constructors/objects/methods
 * 
 * @author: Andrew Owens
 * 
 * @version: 11/9/18
 */
import java.util.Scanner;

public class ClockV3{
    
    public ClockV3(){}

    public double calcTimeDiff(double time1, double time2){
        
    	return Math.abs(time1 - time2);
    }
    
    public double calcMinutes (double hours){
    	
    	return hours * 60;
    }

    
    public static void main(String[] args){
       
    	Scanner in = new Scanner(System.in);
        ClockV3 clock = new ClockV3();
        
        double time1 = 0;
        double time2 = 0;
        double differenceH = 0;
        double differenceM = 0;
        
        System.out.println("Please enter the first time.");
        time1 = in.nextDouble();
        
        System.out.println("Please enter the second time.");
        time2 = in.nextDouble();
             
        differenceH = clock.calcTimeDiff(time1,time2);
        differenceM = clock.calcMinutes(differenceH);

        System.out.printf("%27s", "Time Trials");
        System.out.printf("%10s%10s%20s%15s%n", "\nTime 1","Time 2","Time Difference","Difference" );
        System.out.printf("%-10s%6s%15s%20s%n", "(hrs)", "(hrs)", "(hrs)", "in Minutes");
        System.out.printf("%30s%n", "---------------------------------------------------");
        System.out.printf("%-10.2f%5.2f%15.2f%18.0f", time1,time2,differenceH,differenceM );
        in.close();
    }
}