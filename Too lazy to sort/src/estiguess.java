import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;

public class estiguess{

    static int radius = 1;

    static Scanner input = new Scanner(System.in);

    static int trials, z, hits;

    static Random rand = new Random();

    static double x, y, pi;

    static long darts;

    static double average, sum;

    static double[] piEstimate;

    ArrayList<Double> boi = new ArrayList<Double>();
    

    public static void promptUserInput(){

        System.out.println("How many darts per trial? (integers only)");

        darts = input.nextLong();

        System.out.println("How many trials?");

        trials = input.nextInt();
    }

    public static double[] estimate(){

        piEstimate = new double[trials + 1];


        for (z = 1; z<trials + 1; z++)  {

            for(int i = 0; i<darts; i++) {

                x = 2 * rand.nextDouble() - 1;

                y = 2 * rand.nextDouble() - 1;

                if((Math.pow(x, 2) + Math.pow(y, 2)) <= radius) {

                    hits++;

                }

            }


            piEstimate[z] = (double)(hits)/(darts) * 4;

            hits = 0;


        }
        return piEstimate;
    }

    public static void averagePi(){

        for(int i = 0; i < piEstimate.length; i++) {

            sum += piEstimate[i];

        }

        average = sum/trials;


    }

    public static void printPies(){

        for(z = 1; z < piEstimate.length; z ++)

        {

            System.out.printf("Trial [ %d]: pi = %8.6f %n", z, piEstimate[z]);

            System.out.println(" ");

        }

        System.out.println("******************************************************");

        System.out.println();

        System.out.printf("Estimate of pi = %8.6f", average);

    }




}