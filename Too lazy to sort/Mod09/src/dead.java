import java.util.Random;
import java.util.Scanner;

public class dead {

	public int[][] createArray(int rSize, int cSize) {

	    Random rnd = new Random();
	    int[][] array = new int[rSize][cSize];

	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[0].length; col++) {
	            array[row][col] = rnd.nextInt(26);
	        }
	    }
	    return array;
	}

	public void print2dArray(int[][] array) {

	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[0].length; col++) {
	            System.out.print(array[row][col] + "\t");
	        }
	        System.out.println("\n");
	    }
	}

	public int countInstence(int[][] array, int search) {

	    int count = 0;

	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[0].length; col++) {
	            if (array[row][col] == search)
	                count++;

	        }
	    }
	    return count;
	}

	public static void main(String[] args) {
/*
	    Journal5b call = new Journal5b();
	    Scanner in = new Scanner(System.in);
	    int[][] myArray;
	    int value;
	    myArray = call.createArray(10, 10);

	    call.print2dArray(myArray);

	    System.out.println("Enter a number to search for: ");
	    value = in.nextInt();

	    System.out.println("Your number occurred "
	            + call.countInstence(myArray, value) + " Times");  */
	}
}
