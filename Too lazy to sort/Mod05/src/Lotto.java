import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(System.in);

        int lotNumLength = 3;              //number of digits per lottery number
        String lotteryNum = "";
        String userPick = "";


        //Generate a 3-digit "lottery" number composed of random numbers.
        //Simulate a lottery by drawing one number at a time and
        //concatenating it to the string.
        for(int n = 1; n <= lotNumLength; n++)
        {
            int digit = (int) (Math.random() * 9);  //generate a random integer from 0 to 9 (inclusive)
            System.out.println("This" + digit);
            
            String sdigit = Integer.toString(digit);
            
            lotteryNum = sdigit;                    //concatenate the random digit to the lottery String
            //System.out.println(lotteryNum);       //debug statement; use while testing program
            
        }

        //Input: Ask user to guess 3 digit number
        System.out.println("Enter your " + lotNumLength + " digit lottery number: ");
        userPick = in.nextLine();

        //Output: Error if user guess did not contain the right number of digits. Otherwise
        // report matches for front pair, back pair, or all digits.
        if(userPick.length() != lotNumLength)
        {
        	System.out.println("Sorry, your pick did not contain the right number of digits.");
        }
        else
        {
	        //Create Strings with front and back pair digits for easy comparison
	        String lotteryFrontPair = lotteryNum.substring(0,2);
	        System.out.println(lotteryFrontPair);
	        //String lotteryBackPair = lotteryNum.substring(0);
	        //System.out.println(lotteryBackPair);
	        String userFrontPair = userPick.substring(0, 2);
	        System.out.println(userFrontPair);
	        String userBackPair = userPick.substring(1, 2);
	        System.out.println(userBackPair);

/*
            //Compare the user's guess to the lottery number and report results
	        if(userBackPair.compareTo(lotteryBackPair) < 0)
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the back pair matched!");
	        }
	        else if( !userFrontPair.equals(lotteryFrontPair) )
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, the front pair matched!");
	        }
	        else if(userPick == lotteryNum)
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tCongratulations, both pairs matched!");
	        }
	        else
	        {
	            System.out.println("\tWinner: " + lotteryNum + "\n\tSorry, no digits match. \n\tThe odds were not in your favor.");
            }
		*/
	}
       

}
}
