/**
 * This is a class that tests the Card class.
 *
 *  < Andrew Owens >
 *  < 3/29/19 >
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);
      Card kingDiamond = new Card("king", "diamonds", 10);
      Card jackSpades = new Card("jack", "spades", 10); 
      //Card twoClovers = new Card("two", "clovers", 2);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      System.out.println("**** Tests Card 2: king of diamonds ****");
      System.out.println("  rank: " + kingDiamond.rank());
      System.out.println("  suit: " + kingDiamond.suit());
      System.out.println("  pointValue: " + kingDiamond.pointValue());
      System.out.println("  toString: " + kingDiamond.toString());
      System.out.println();
     
      // Test card 3
      System.out.println("**** Tests Card 3: jack of spades ****");
      System.out.println("  rank: " + jackSpades.rank());
      System.out.println("  suit: " + jackSpades.suit());
      System.out.println("  pointValue: " + jackSpades.pointValue());
      System.out.println("  toString: " + jackSpades.toString());
      System.out.println();
      
      // Test matches() method
      System.out.println("**** Matches Test ****");
      
      if(kingDiamond.matches(jackSpades) == true) {
    	  System.out.println("matching: true");
    	  System.out.println("not matching: false");
      }
      else if(kingDiamond.matches(jackSpades) == false) {
    	  System.out.println("matching: false");
    	  System.out.println("not matching: true");
      }
   }
}