import java.util.ArrayList;

public class Test {
	public static double s1,s2,s3;
	
	public static boolean bee(double s1, double s2, double s3) {
		if(s1 > s2 && s1 > s3) {
			if(Math.pow(s1, 2) < (Math.pow(s3, 2) + Math.pow(s2, 2))) {
				return true;
			}
		}
		else if(s2 > s1 && s2 > s3) {
			if(Math.pow(s2, 2) < (Math.pow(s1, 2) + Math.pow(s3, 2))) {
				return true;
			}
		}
		else if(s3 > s1 && s3 > s2) {
			if(Math.pow(s3, 2) < (Math.pow(s1, 2) + Math.pow(s2, 2))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		boolean yeet = bee(3, 4, 3);
		
		/*ArrayList<String> list = new ArrayList<String>();
		 list.add("Wei");
		 list.add("Marila");
		 list.add("Anna");
		 list.add("Neal");
		 list.add("Rachel");
		 list.add("Jack");
		 list.add("Aneesh");
		 list.set(1, "Beth");
		 */
		 System.out.println(yeet);
		 
	}

}
