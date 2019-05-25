/*
 * 
 * PURPOSE: Solidify our knowledge of boolean expressions in conjunction
 * 			with logical operators. Also learn how to compare string objects.
 * 
 * 
 * 
 * @author Andrew Owens
 * @version 09/20/18
 * 
 */

import java.util.Scanner;

public class TDEE {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double tdee;
		double acta = 1.0;
		double actb = 1.3;
		double mactc = 1.6;
		double mactd = 1.7;
        double macte = 2.1;	
		double mactf = 2.4;
		double factc = 1.5;
		double factd = 1.6;
		double facte = 1.9;
		double factf = 2.2;
		
		String gender1;
		
		System.out.println("Please enter your name");
		String name = in.nextLine();
		
		System.out.println("Please enter your BMR");
		double bmr = in.nextInt();
		
		System.out.println("Please enter your gender (M/F): ");
		String gender = in.next();
		System.out.println();
		
		System.out.println("Select your Activity Level");
		System.out.println("[A] Resting (sleeping, Reclining)");
		System.out.println("[B] Sedentary (Minimal Movement)");
		System.out.println("[C] Light (Sittin, Standing)");
		System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
		System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
		System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");
		
		System.out.println("Enter the letter corresponding to your activity level: ");
		String response = in.next();
		System.out.println();
		
		if((gender.equals("m") || gender.equals("M")) && 
		   (response.equals("A") || response.equals("a"))) {
			
			
			tdee = bmr * 1.0;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + acta);
	        System.out.println("TDEE: " + tdee + " calories");
			
		}else if ((gender.equals("f") || gender.equals("F")) && 
		   (response.equals("A") || response.equals("a"))) {
			
			tdee = bmr * acta;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + acta);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("m") || gender.equals("m")) && 
				  (response.equals("B") || response.equals("b"))) {
			
			tdee = bmr * actb;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + actb);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("f") || gender.equals("F")) && 
				   (response.equals("B") || response.equals("b"))) {
			
			tdee = bmr * actb;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + actb);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("m") || gender.equals("M")) && 
				   (response.equals("C") || response.equals("c"))) {
			
			tdee = bmr * mactc;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + mactc);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("f") || gender.equals("F")) && 
				   (response.equals("C") || response.equals("c"))) {
			
			tdee = bmr * factc;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + factc);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("m") || gender.equals("M")) && 
				   (response.equals("D") || response.equals("d"))) {
			
			tdee = bmr * mactd;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + mactd);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("f") || gender.equals("F")) && 
				   (response.equals("D") || response.equals("d"))) {
			
			tdee = bmr * factd;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + factd);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("m") || gender.equals("M")) && 
				   (response.equals("E") || response.equals("e"))) {
			
			tdee = bmr * macte;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + macte);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("f") || gender.equals("F")) && 
				   (response.equals("E") || response.equals("e"))) {
			
			tdee = bmr * facte;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + facte);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("m") || gender.equals("M")) && 
				   (response.equals("F") || response.equals("f"))) {
			
			tdee = bmr * mactf;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + mactf);
	        System.out.println("TDEE: " + tdee + " calories");
	        
		}else if ((gender.equals("f") || gender.equals("F")) && 
				   (response.equals("F") || response.equals("f"))) {
			
			tdee = bmr * factf;
			gender1 = gender.toUpperCase();
			System.out.println("Your results:");
	        System.out.print("Name: " + name + "\t");
	        System.out.println("Gender: " + gender1);
	        System.out.print("BMR: " + bmr + " calories \t");
	        System.out.println("Activity factor: " + factf);
	        System.out.println("TDEE: " + tdee + " calories");
		
		}else {
			System.out.println("You did not select an option from the menu, please try again.");
		}

	}

}
