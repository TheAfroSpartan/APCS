import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Please enter the larger length");
		int length1 = scan.nextInt();
		
		System.out.println("Please enter the smaller length.");
		int length2 = scan.nextInt();
		
		System.out.println("Please enter the larger width");
		int width1 = scan.nextInt();
		
		System.out.println("Please enter the smaller width");
		int width2 = scan.nextInt();
		
		double lengthRatio = (double)length1 / length2;
		double widthRatio = (double)width1 / width2;
		System.out.println("The length ratio is: " + lengthRatio);
		System.out.println("The width ratio is: " + widthRatio);
		
		if(lengthRatio == widthRatio) {
			System.out.println("The rectangles are similar.");
		}else if(!(lengthRatio == widthRatio)) {
			System.out.println("The rectangles are not similar.");
		}
		
		double a = Math.pow(10, 23);
		double b = a * 3.3;
		System.out.println("YEAAAAA" + b);

}
}