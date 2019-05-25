import java.util.Arrays;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] primeArray = new int[5];
		int sum = 0;
		
		primeArray[0] = 2;
		primeArray[1] = 3;
		primeArray[2] = 5;
		primeArray[3] = 7;
		primeArray[4] = 11;
		
		
		for(int s : primeArray) {
			sum +=s;
		}
		
		System.out.println("The total is: " + sum);
		System.out.println("The total was calculated by adding together the elements stored in the primeArray array.");
		System.out.println(" ");
		System.out.println("The array is composed of the following: " + Arrays.toString(primeArray));
	}

}
