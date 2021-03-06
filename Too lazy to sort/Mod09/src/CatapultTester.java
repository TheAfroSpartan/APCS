/**
 * @purpose This class tests the Catapult class
 * 
 * A launch object is created to hold the speed and angle of the projectile
 * 
 *  @author Andrew Owens
 *  @version 11/05/18
 */
import java.util.ArrayList;

public class CatapultTester {

	public static void main(String[] args) {
		// Declaration of 2-dimensional array
		double[][] array = new double[5][6];
		
		//Declaration and initialization of angle variables
		double angle1 = Math.toRadians(25);
		double angle2 = Math.toRadians(30);
		double angle3 = Math.toRadians(35);
		double angle4 = Math.toRadians(40);
		double angle5 = Math.toRadians(45);
		double angle6 = Math.toRadians(50);
		
		//Declaration and initialization of speed variables
		double speed1 = 20;
		double speed2 = 25;
		double speed3 = 30;
		double speed4 = 35;
		double speed5 = 40;
		//Declaration and initialization of increment counters.
		int z = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		
		//Declaration of ArrayList
		ArrayList<Catapult>launch = new ArrayList<Catapult>();
		//initialization of launch arraylist with elements
		launch.add(new Catapult(speed1,angle1));
		launch.add(new Catapult(speed1,angle2));
		launch.add(new Catapult(speed1,angle3));
		launch.add(new Catapult(speed1,angle4));
		launch.add(new Catapult(speed1,angle5));
		launch.add(new Catapult(speed1,angle6));
		
		launch.add(new Catapult(speed2,angle1));
		launch.add(new Catapult(speed2,angle2));
		launch.add(new Catapult(speed2,angle3));
		launch.add(new Catapult(speed2,angle4));
		launch.add(new Catapult(speed2,angle5));
		launch.add(new Catapult(speed2,angle6));
		
		launch.add(new Catapult(speed3,angle1));
		launch.add(new Catapult(speed3,angle2));
		launch.add(new Catapult(speed3,angle3));
		launch.add(new Catapult(speed3,angle4));
		launch.add(new Catapult(speed3,angle5));
		launch.add(new Catapult(speed3,angle6));
		
		launch.add(new Catapult(speed4,angle1));
		launch.add(new Catapult(speed4,angle2));
		launch.add(new Catapult(speed4,angle3));
		launch.add(new Catapult(speed4,angle4));
		launch.add(new Catapult(speed4,angle5));
		launch.add(new Catapult(speed4,angle6));
		
		launch.add(new Catapult(speed5,angle1));
		launch.add(new Catapult(speed5,angle2));
		launch.add(new Catapult(speed5,angle3));
		launch.add(new Catapult(speed5,angle4));
		launch.add(new Catapult(speed5,angle5));
		launch.add(new Catapult(speed5,angle6));
		
		//Declaration of new object of Catapult Class
		Catapult dataRecord;
		
		//invoke methods
		for(int index = 0; index < launch.size(); index++)
        {
            dataRecord = launch.get(index);
            dataRecord.calcVelocity();
            dataRecord.calcAngle();
            dataRecord.calcRange();
         
         //initialization of 2-dimensional array with elements   
         while(index <=5) {
          	array[0][index] = dataRecord.getRange();
           	break;
         }
         while(index <= 11 && index >5) {
        	 array[1][z] = dataRecord.getRange();
        	 z++;
        	 break;
         }
         while(index <= 17 & index > 11) {
        	 array[2][a] = dataRecord.getRange();
        	 a++;
        	 break;
         }
         while(index <= 23 && index > 17) {
        	 array[3][b] = dataRecord.getRange();
        	 b++;
        	 break;
         }
         while(index <= 29 && index > 23) {
        	 array[4][c] = dataRecord.getRange();
        	 c++;
        	 break;
         }
        }


     
        
        System.out.printf("%55s%n", "Projectile Distance (Meters)");
        System.out.printf("%4s %11s %10s %10s %10s %10s %10s%n", "KPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.println("=======================================================================");
        
        //for loops to print 2-dimensional array elements
        System.out.printf("%4s", "20");
        for(int v = 0; v<6; v++) {
        	System.out.printf("%11.3f", array[0][v]);
        }
        
        System.out.printf("%n%4s", "25");
        for(int v = 0; v<6; v++) {
        	System.out.printf("%11.3f", array[1][v]);
        }
        
        System.out.printf("%n%4s", "30");
        for(int v = 0; v<6; v++) {
        	System.out.printf("%11.3f", array[2][v]);
        }
        
        System.out.printf("%n%4s", "35");
        for(int v = 0; v<6; v++) {
        	System.out.printf("%11.3f", array[3][v]);
        }
        
        System.out.printf("%n%4s", "40");
        for(int v = 0; v<6; v++) {
        	System.out.printf("%11.3f", array[4][v]);
        }
}
}