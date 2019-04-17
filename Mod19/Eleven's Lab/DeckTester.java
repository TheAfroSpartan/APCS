/**
 * This is a class that tests the Deck class.
 *
 *  < Andrew Owens >
 *  < 3/29/19 >
 */

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

      String[] myRanks = {"queen", "king", "jack", "ace", "two", "eight", "seven", "three", "four", "five"};
      String[] mySuits = {"heart", "spades", "clover", "diamonds", "heart", "spades", "clover", "diamonds", "heart", "clover"};
      int[] myPointValues = {10,10,10,1,2,8,7,3,4,5};
      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);
      
      System.out.println("**** Original Deck Methods ****");
      System.out.println("  toString: \n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size());
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card ****");
      System.out.println("  deal: " + myDeck.deal());
      System.out.println();
      System.out.println();
      
      
      System.out.println("**** Deck Methods After 1 Card Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size() );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal Remaining 5 Cards ****");
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println("  toString:\n" + myDeck.deal());
      System.out.println();
      System.out.println();

      System.out.println("**** Deck Methods After All Cards Dealt ****");
      System.out.println("  toString:\n" + myDeck.toString());
      System.out.println("  isEmpty: " + myDeck.isEmpty());
      System.out.println("  size: " + myDeck.size() );
      System.out.println();
      System.out.println();

      System.out.println("**** Deal a Card From Empty Deck ****");
      System.out.println("  deal: "  + myDeck.deal());
      System.out.println();
      System.out.println();


      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
      String[] myRanks2 = {"ace","ace","ace","ace","two","two","two","two","three","three","three","three","four","four","four","four","five","five","five","five",
    		  			   "six","six","six","six","seven","seven","seven","seven","eight","eight","eight","eight","nine","nine","nine","nine","ten","ten","ten","ten",
    		  			   "jack","jack","jack","jack","queen","queen","queen","queen","king","king","king","king",};
      String[] mySuits2 = {"heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs",
    		               "heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs",
    		               "heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs","heart","spades","diamonds","clubs",
    		               "heart","spades","diamonds","clubs",};
      int[] myPointValues2 = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,6,6,7,7,7,7,8,8,8,8,9,9,9,9,10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13};
      Deck myDeck2 = new Deck(myRanks2, mySuits2, myPointValues2);
      
       System.out.println("\n**** 52 Card Deck shuffle Tests ****");
       
       System.out.println("**** Original Deck ****");
       System.out.println("  toString: \n" + myDeck2.toString());
       System.out.println("  isEmpty: " + myDeck2.isEmpty());
       System.out.println("  size: " + myDeck2.size());
       System.out.println();
       System.out.println();

       
       myDeck2.shuffle();
       System.out.println("**** Deck After Shuffle ****");
       System.out.println("  toString:\n" + myDeck2.toString());
       System.out.println("  isEmpty: " + myDeck2.isEmpty());
       System.out.println("  size: " + myDeck2.size() );
       System.out.println();
       System.out.println();
       
       
       System.out.println("**** Deal a Card ****");
       System.out.println("  deal: " + myDeck2.deal());
       System.out.println();
       System.out.println();
       
       
       System.out.println("**** Deck Methods After 1 Card Dealt ****");
       System.out.println("  toString:\n" + myDeck2.toString());
       System.out.println("  isEmpty: " + myDeck2.isEmpty());
       System.out.println("  size: " + myDeck2.size() );
       System.out.println();
       System.out.println();
  
       
       System.out.println("**** Deal 5 Cards ****");
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println("  toString:\n" + myDeck2.deal());
       System.out.println();
       System.out.println();
       System.out.println("  size: " + myDeck2.size() );
       System.out.println();
       System.out.println();

       myDeck2.shuffle();
       System.out.println("**** Deck Methods After 2nd Shuffle ****");
       System.out.println("  toString:\n" + myDeck2.toString());
       System.out.println("  isEmpty: " + myDeck2.isEmpty());
       System.out.println("  size: " + myDeck2.size() );
       System.out.println();
       System.out.println();
   }
}