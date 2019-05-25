/**
 * 
 * @purpose:This class tests the CO2FootprintV2 class.
 * 
 * A footprint object is created to hold the amount of gas for calculations in the CO2FootprintV2 class.
 * 
 * @author Andrew Owens
 * @version 11/20/18
 *
 */
public class CO2FootprintV2Tester
{
    public static void main(String[] args)
    {
    	//Deceleration of variables
        double gallonsOfGas = 2410;
        
        //initialization of object footprint
        CO2FootprintV1 footprint = new CO2FootprintV1(gallonsOfGas);
        
        //call methods
        footprint.calcTonsCO2();
        footprint.convertTonsToPounds();

        //print results
        System.out.println("           CO2 Emissions");
        System.out.println("  Gallons   Pounds      Tons");
        System.out.println("  of Gas   from Gas   from Gas");
        System.out.println("  ****************************");
        System.out.printf("  %6.1f   %8.2f    %6.3f", footprint.getGallons(),
                                                      footprint.getPoundsCO2(),
                                                      footprint.getTonsCO2());

        System.out.println();
    }
}
