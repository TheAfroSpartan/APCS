/**
 * 
 * @purpose This class tests the CO2FromWaste class.
 * 
 * A households object is created to hold the number of people and their boolean conditions in an arraylist.
 * 
 * @author Andrew Owens
 * @version 11/21/18
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
    public static void main(String[] args)
    {
    	//Deceleration of ArrayList
        ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
        
      //initialization of households array with elements
        households.add(new CO2FromWaste(1, true, true, true, true));
        households.add(new CO2FromWaste(6, true, false, true, false));
        households.add(new CO2FromWaste(3, false, true, true, false));
        households.add(new CO2FromWaste(2, true, true, false, true));
        households.add(new CO2FromWaste(10, true, false, false, true));
        households.add(new CO2FromWaste(1, false,true,true, true));
        
        //invoke methods
        for(CO2FromWaste dataRecord : households)
		{
			dataRecord.calcGrossWasteEmission();
			dataRecord.calcWasteReduction();
			dataRecord.calcNetWasteReduction();
		}
        
        //print results
		System.out.println("|       |        |                                         |             Pounds of CO2             |");
		System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
		System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
		System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
		
		//creates a new dataRecord object of type CO2FromWaste
		CO2FromWaste dataRecord;
		
		//call methods
		for(int index = 0; index < households.size(); index ++)
		{
			dataRecord = households.get(index);
			
			System.out.printf("|   %1d   |    %2d  |   %-5b  |  %-5b   |  %-5b  |  %-5b  |  %8.2f  |   %7.2f   |   %8.2f |%n", index, 
							  dataRecord.getNumPeople(), dataRecord.getPaper(), dataRecord.getPlastic(), dataRecord.getGlass(), 
							  dataRecord.getCans(), dataRecord.getTotalEmissions(), dataRecord.getReduction(), dataRecord.getNetEmissions());
		}
	}//end of main
}//end of class


