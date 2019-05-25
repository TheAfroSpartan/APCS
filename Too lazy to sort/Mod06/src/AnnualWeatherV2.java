/**
 * PURPOSE: Learn how to properly format things to print to screen
 *
 * @author Andrew Owens
 * @version 10/14/18
 */
import java.util.Scanner;

public class AnnualWeatherV2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String location = "Apalachicola, Florida";
		double avgtemp = 0;
		double sum = 0;
		double totalpercip = 0;
		
		System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
		String scale1 = scan.next();
		
		System.out.println("Choose the percipitation scale (i = inches, c = centimeters): ");
		String scale2 = scan.next();
		
		String[] month;
		month = new String[12];
		
		//months
		month [0] = "Jan.";
		month [1] = "Feb.";
		month [2] = "Mar.";
		month [3] = "Apr.";
		month [4] = "May";
		month [5] = "Jun.";
		month [6] = "Jul.";
		month [7] = "Aug.";
		month [8] = "Sep.";
		month [9] = "Oct.";
		month [10] = "Nov.";
		month [11] = "Dec.";
		
		//temperature
		double[] temp;
		temp = new double[12];
		
		while(scale1.equalsIgnoreCase("c")) {
			
			temp [0] = (52.7 - 32.0) * (5.0/9);
			temp [1] = (55.3 - 32.0) * (5.0/9);
			temp [2] = (60.7 - 32.0) * (5.0/9);
			temp [3] = (66.8 - 32.0) * (5.0/9);
			temp [4] = (74.1 - 32.0) * (5.0/9);
			temp [5] = (80.0 - 32.0) * (5.0/9);
			temp [6] = (81.9 - 32.0) * (5.0/9);
			temp [7] = (81.7 - 32.0) * (5.0/9);
			temp [8] = (79.1 - 32.0) * (5.0/9);
			temp [9] = (70.2 - 32.0) * (5.0/9);
			temp [10] = (62.0 - 32.0) * (5.0/9);
			temp [11] = (55.2 - 32.0) * (5.0/9);
			
			for(int i = 0; i <= 11; i++) 
			{
				sum = sum + temp[i];	
			}
			
				avgtemp = sum / 12;
			break;
			}
		
		while(scale1.equalsIgnoreCase("f")) {
			
			temp [0] = 52.7;
			temp [1] = 55.3;
			temp [2] = 60.7;
			temp [3] = 66.8;
			temp [4] = 74.1;
			temp [5] = 80.0;
			temp [6] = 81.9;
			temp [7] = 81.7;
			temp [8] = 79.1;
			temp [9] = 70.2;
			temp [10] = 62.0;
			temp [11] = 55.2;
		
		for(int i = 0; i <= 11; i++) 
		{
			sum = sum + temp[i];	
		}
		
			avgtemp = sum / 12;
		break;
		}
		
		//Precipitation
		double[] percip;
		percip = new double [12];
		
		
		while(scale2.equalsIgnoreCase("c")) {
			percip [0] = 4.9 * 2.54;
			percip [1] = 3.8 * 2.54;
			percip [2] = 5.0 * 2.54;
			percip [3] = 3.0 * 2.54;
			percip [4] = 2.6 * 2.54;
			percip [5] = 4.3 * 2.54;
			percip [6] = 7.3 * 2.54;
			percip [7] = 7.3 * 2.54;
			percip [8] = 7.1 * 2.54;
			percip [9] = 4.2 * 2.54;
			percip [10] = 3.6 * 2.54;
			percip [11] = 3.5 * 2.54;
			
			for(int i = 0; i <= 11; i++) 
			{
				totalpercip = totalpercip + percip[i];	
				}
			break;
		}
		
		while(scale2.equalsIgnoreCase("i")) {
		percip [0] = 4.9;
		percip [1] = 3.8;
		percip [2] = 5.0;
		percip [3] = 3.0;
		percip [4] = 2.6;
		percip [5] = 4.3;
		percip [6] = 7.3;
		percip [7] = 7.3;
		percip [8] = 7.1;
		percip [9] = 4.2;
		percip [10] = 3.6;
		percip [11] = 3.5;
		
		for(int i = 0; i <= 11; i++) 
		{
			totalpercip = totalpercip + percip[i];	
			}
		   break;
		}
		
		
		
		System.out.println("			Weather Data");
		System.out.println("		 Location: " + location );
		System.out.println("Month	           Temperature (F)	          Percipitation (in.)");
		System.out.println("*********************************************************************");
		
		System.out.print(month[0] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[0]);
		System.out.printf("%.1f\n",percip[0]);
		
		System.out.print(month[1] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[1]);
		System.out.printf("%.1f\n",percip[1]);
		
		System.out.print(month[2] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[2]);
		System.out.printf("%.1f\n",percip[2]);
		
		System.out.print(month[3] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[3]);
		System.out.printf("%.1f\n",percip[3]);
		
		System.out.print(month[4] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[4]);
		System.out.printf("%.1f\n",percip[4]);
		
		System.out.print(month[5] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[5]);
		System.out.printf("%.1f\n",percip[5]);
		
		System.out.print(month[6] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[6]);
		System.out.printf("%.1f\n",percip[6]);
		
		System.out.print(month[7] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[7]);
		System.out.printf("%.1f\n",percip[7]);
		
		System.out.print(month[8] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[8]);
		System.out.printf("%.1f\n",percip[8]);
		
		System.out.print(month[9] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[9]);
		System.out.printf("%.1f\n",percip[9]);
		
		System.out.print(month[10] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[10]);
		System.out.printf("%.1f\n",percip[10]);
		
		System.out.print(month[11] + "\t\t\t");
		System.out.printf( "%.1f\t\t\t\t",temp[11]);
		System.out.printf("%.1f\n",percip[11]);
		
		System.out.println("*********************************************************************");
		
		System.out.print("   Average Temp: ");
		System.out.printf("%.1f\t",avgtemp);
		System.out.print("Anual Percipitation: ");
		System.out.printf("%.1f",totalpercip);
		
	}

}
