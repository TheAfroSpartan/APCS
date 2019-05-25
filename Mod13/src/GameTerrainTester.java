/**
 * This class tests the extending classes from Terrain to Oasis
 *
 * @author (Andrew Owens)
 * @version (1/31/19)
 */

public class GameTerrainTester {

	//main method
	public static void main(String[] args) {
		
		//Declaration of objects
		Terrain Terra = new Terrain( 150, 240);
		Forest silva = new Forest(400, 400, 180);
		Mountain mons = new Mountain(600, 200, 12);
		WinterMountain coldMons = new WinterMountain(500, 600, 30, 2.5);
		Desert hot =new Desert(800, 500, 100);
		Oasis cool = new Oasis(50, 75, 200, 1000000);
		
		
		//Call methods and print
		System.out.println(Terra.getTerrainSize());
		System.out.println();
		
		System.out.println("Forest " + silva.getTerrainSize() + " and has " + silva.getTrees());
		System.out.println();
		
		System.out.println("Mountain " + mons.getTerrainSize() + " and has " +
							mons.getMountains());
		System.out.println();
		
		System.out.println("Winter Mountain " + coldMons.getTerrainSize() + " and has " 
							+ coldMons.getMountains() + " and " + coldMons.getTemp());
		System.out.println();
		
		System.out.println("Desert " + hot.getTerrainSize() + " and has " + hot.getDunes());
		System.out.println();
		
		System.out.println("Oasis " + cool.getTerrainSize() + " and has " + cool.getDunes()
							+ " and has " + cool.getWater());
		System.out.println();
		

	}

}