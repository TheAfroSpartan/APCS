import java.util.Scanner;

public class dartss {

    /* Public static variables */

    public static Scanner in = new Scanner(System.in);

    public static double x;
    public static double y;
    public static double radius = 1.0;
    public static double numX, numY, pi, avg,numHits, total;
    public static int numThrows, trails;

    /*
    Public static int method
    @return Calculates the hits of the dart
     */
    public static int hits(double x, double y, int trails) {
        numHits = 0;

        for (int i = 1; i < trails; i++) {
            x = (2 * Math.random() - 1);
            y = (2 * Math.random() - 1);

            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2))) {
                numHits++;
            }
        }System.out.println(numHits);
        return (int) numHits;
    }

    /*
    Public static double method
    @return Calculates PI
     */
    public static double[] calcPi(double numHits, double numThrows) {
    		double[] piCalc = new double[10];
    		
    		for(int i = 0; i < 10; i++) {
    			piCalc[i] = (4 * (numHits) / numThrows);
    			System.out.println(piCalc[i]);
    		}
    	return piCalc;
    }

    public static void setFormat(double numHits, double numThrows, double[] piCalc, int trails) {
    	
    	 for(int i = 0; i < trails; i++) {
         	//System.out.println(piCalc[i]);
         }
    }
    /*
    Public Main static method
    @return Output
     */
    public static void main(String[] args) {
        System.out.println("How many times should the dart be thrown per trial?");
        numThrows = in.nextInt();

        System.out.print("\n");

        System.out.println("How many trials do you want to simulate?");
        trails = in.nextInt();

        System.out.print("\n");
        
        hits(x, y, trails);
       double[] piCalc = calcPi(numHits, numThrows);
       setFormat(numHits, numThrows, piCalc, trails);
        /*
        for (int i = 0; i < trails; i++) {
            int hits = hits(x,y,numThrows);
            double estimatedPi = calcPi(hits,numThrows);
            total += estimatedPi;
            System.out.printf("Trial " + (i + 1) + ": pi = %12f\n", estimatedPi);
        }
        double averagePi = (total / trails);

        System.out.printf("Average Calculation of Pi: %1.5f", averagePi);
        */
    }

}
