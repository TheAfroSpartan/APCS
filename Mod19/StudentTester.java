
public class StudentTester {

	public static void main(String[] args) {
		
		double[] arr = {99.50, 100.00,98.75,91.25};
		double[] arr2 = {99.00, 91.00,93.75,94.25};
		double [] arr3 = {};
		
		Student testing = new Student("Andrew" , "Owens", arr);
		
		System.out.println(testing.getScores());
		
		testing.setScores(arr2);
		
		System.out.println(testing.getScores());
		
		System.out.println(testing.toString());
		
		
		
		//testing.setScores(arr3);
		
		testing.setLetterGrade(arr2);
		
		System.out.println(testing.getLetterGrade());
		
	}
}
