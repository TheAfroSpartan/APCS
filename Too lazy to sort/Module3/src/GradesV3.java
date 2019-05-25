/**
 * PURPOSE: Learn how to use the Scanner class method correctly
 * and also how to store objects correctly,
 *  
 * @author Andrew Owens
 * @version 09/04/18
 */
import java.util.Scanner;

public class GradesV3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		int numTests = 0;
		double totalPoints = 0.0;
        double average = 0.0;
		
        System.out.println("Please enter your name.");
        String fullName = in.nextLine();
        System.out.println("What Subject are the tests for?");
        String subject = in.nextLine();
       
        numTests++;
        System.out.println("Please enter a test Grade.");
        double testGrade1 = in.nextDouble();
        System.out.println("Test #" + numTests + " scored: " + testGrade1);
        System.out.println();
        
        numTests++;
        System.out.println("Please enter a second test grade.");
        double testGrade2 = in.nextDouble();
        System.out.println("Test #" + numTests + " scored: " + testGrade2);
        System.out.println();
 
        numTests++;
        System.out.println("Please enter a third test grade.");
        double testGrade3 = in.nextDouble();
        System.out.println("Test #" + numTests + " scored: " + testGrade3);
        System.out.println();

        
        totalPoints = (testGrade1 + testGrade2 +testGrade3);
        average = (testGrade1 + testGrade2 +testGrade3)/3;
        
        
        System.out.println("Name: " + fullName + "   Subject: " + subject + 
        				   "   Test Scores: " + testGrade1 + ", " + testGrade2 + ", " + testGrade3);
        System.out.println("Total Points: " + totalPoints);
        System.out.println("Average: " + average);
	}

}
