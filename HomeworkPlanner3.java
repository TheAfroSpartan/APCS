/**
 *  Purpose: Tests the Homework class and its subclasses
 *  	
 *  @author Andrew Owens
 *  @version 2/19/19
 */
import java.util.ArrayList;

public class HomeworkPlanner3 {
	
	public static void main(String []args){
		
        Calculus3 subject1 = new Calculus3();
        subject1.assignment(5);
        
        LanguageArts3 subject2 = new LanguageArts3();
        subject2.assignment(55);
        subject2.work(55);
        ComputerScience3 subject3 = new ComputerScience3();
        subject3.assignment(3);
        
        Spanish3 subject4 = new Spanish3();
        subject4.assignment(18);
        
        //ArrayList of HomeWork class that stores objects
        ArrayList<Homework3> assignments = new ArrayList<Homework3>();
        assignments.add(subject1);
        assignments.add(subject2);
        assignments.add(subject3);
        assignments.add(subject4);
       
        
        System.out.printf("%30s%n", "My Homework Reading To-Do");
        System.out.println("----------------------------------");
        
        //Enhanced For loop to print homework assignments
        for(Homework3 print : assignments) {
        	System.out.println(print.toString());
        }
        
       
    }

}