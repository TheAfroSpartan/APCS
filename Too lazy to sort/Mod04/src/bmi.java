import java.util.Scanner;

public class bmi {

	public static void main(String[] args) {

Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your full name.");
		String name = in.nextLine();
		
		System.out.println("Please enter your weight in pounds.");
		String weightlbs = in.nextLine();
		
		System.out.println("Enter your height (E.g: 5 11). ");
		String heightft = in.nextLine();
		String feet = heightft.substring(0,1);
		String inches = heightft.substring(2);
		
		int feetnum = Integer.parseInt(feet);
		int inchnum = Integer.parseInt(inches);
		int weightnum = Integer.parseInt(weightlbs);
		int inchtotal = (feetnum * 12) + inchnum;
		
		double centi = inchtotal * 2.54;
		double kilo = weightnum * 0.453592;
		double height2 = centi * centi;
		double bmi = (kilo / height2) * 10000;
		double meter = centi / 100;
		
		System.out.println("Body Mass Index Calculator");
		System.out.println("==========================");
		System.out.println("Name: " + name);
		System.out.println("Height (m): " + meter);
		System.out.println("BMI: " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("Category: Underweight");
		}
		
		else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.println("Category: Healthy Weight");
		}
		
		else if(bmi >= 25 && bmi < 29.9) {
			System.out.println("Category: Overweight");
		}
		
		else if(bmi >= 29.9) {
			System.out.println("Category: Obese");
		}
	}

}
