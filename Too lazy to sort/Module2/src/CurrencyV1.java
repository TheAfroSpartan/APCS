/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Andrew Owens
 * @version 08/31/18
 */
public class CurrencyV1 {

	public static void main(String[] args) {
		
		//Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars
        double UsDollar = 0.0;

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 19.57852;     // 1 US dollar = 19.57852 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        double eurosSpent = 742.5;
        double euroExchangeRate = 0.858771;
        double dollarsSpentInGermany = 0.0;
        double dollarsAfterGermany = 0.0;
        
        double poundsSpent = 832.3;
        double poundExchangeRate = 0.769698;
        double dollarsSpentInEngland = 0.0;
        double dollarsAfterEngland = 0.0;
        //remaining variables below here

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
      	System.out.println("Starting US dollars:      " + startingUsDollars);
      	System.out.println();
      	System.out.println();
      	
      	//Mexico
      	System.out.println("Mexico: ");
      	System.out.println("Pesos spent:                    " + pesosSpent);
      	UsDollar = pesosSpent / pesoExchangeRate;
      	System.out.println("US dollars equivalent:          " + UsDollar);
      	dollarsAfterMexico = startingUsDollars - UsDollar;
      	System.out.println("US dollars remaining:           " + dollarsAfterMexico);
      	System.out.println();
      	System.out.println();
      	
      	//Germany
        System.out.println("Germany: ");
      	System.out.println("Euros spent:                    " + eurosSpent);
      	UsDollar =  eurosSpent / euroExchangeRate;
      	System.out.println("US dollars equivalent:          " + UsDollar);
      	dollarsAfterGermany = dollarsAfterMexico - UsDollar;
      	System.out.println("US dollars remaining:           " + dollarsAfterGermany);
      	System.out.println();
      	System.out.println();
      	
      	//England
        System.out.println("England: ");
      	System.out.println("Pounds spent:                    " + poundsSpent);
      	UsDollar =  poundsSpent / poundExchangeRate;
      	System.out.println("US dollars equivalent:          " + UsDollar);
      	dollarsAfterEngland = dollarsAfterGermany - UsDollar;
      	System.out.println("US dollars remaining:           " + dollarsAfterEngland);
  
      	
      	System.out.println("====================================================");
      	System.out.println("Remaining US dollars:           " + dollarsAfterEngland);
      	System.out.println();
      	System.out.println();
      	




        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = 8; 		//how many items can be purchased
		int fundsRemaining1 = 0;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		fundsRemaining1 = budget1 % costItem1;
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = 16; 	//how many items can be purchased
		double fundsRemaining2 = 0.0;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		fundsRemaining2 = (double)(budget2 % costItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

	}

}
