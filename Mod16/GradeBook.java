import java.util.ArrayList;

public class GradeBook {

	public static void main(String[] args) {
		
		ArrayList<Student> Students = new ArrayList<Student>();
		
		Student Andrew = new Student("Andrew Owens", 100, 99, 98, 97, 96);
		Students.add(Andrew);
		
		Student David = new Student("David Carpenter", 87, 91, 76, 82, 85);
		Students.add(David);
		
		Student Lee = new Student("Lee Brookes", 55, 77, 68, 81, 73);
		Students.add(Lee);
		
		Student Ashley = new Student("Ashley Kepler", 87, 85, 90, 79, 88);
		Students.add(Ashley);
		
		printResults(Students);
		
	}
	
	//Method to Print out the array elements
		public static void printResults(ArrayList<Student> students) {
			
		System.out.printf("%-8s%11s%8s%8s%8s%8s%n", "Student name", "Q1", "Q2", "Q3", "Q4" , "Q5");
		System.out.println("---------------------------------------------------------------------");
		
		for(int i = 0; i < students.size(); i++) {
		
			System.out.printf("%-15s",students.get(i).getName());
			
			for(int j = 1; j < students.size() + 2; j++) {
				System.out.printf("%8d", students.get(i).getScores(j));
				
				}
			
			System.out.println();
			
			}	 
				
		}
		
		/**
		 * Static method deletes the given candidate from the arraylist
		 * @param candidates
		 * @param find
		 */
	    public static void changeStudent(ArrayList<Student> students, String find)
	    {
	        int location = 0;
	        int index;

	        // find location of item you want to delete
	        for(index = 0; index < students.size(); index++)
	        {
	            if(students.get(index).getName().equals(find))
	            {
	                location = index;
	                break;
	            }
	        }
	        
	        // delete item from ArrayList
	        if (index != students.size())
	            students.remove(location);
	    }
		
}
