import java.util.ArrayList;
import java.util.List;

public class Student {

	private List<Double> scores;
	private String firstName, lastName;
	private String letterGrade;
	
	public Student(String firstName, String lastName, double[] scores) {
		
		if(firstName == null || firstName.isEmpty())
			throw new IllegalArgumentException("First Name cannot be null or empty.");
		this.firstName = firstName;
		
		if(lastName == null || lastName.isEmpty())
			throw new IllegalArgumentException("Last Name cannot be null or empty.");
		this.lastName = lastName;
		
		this.letterGrade = calcLetterGrade(scores);
		
		if(scores.length == 0)
			throw new IllegalStateException( "You must add Scores" );
		this.scores = new ArrayList<Double>();
		for(int i = 0; i < scores.length; i++) {
			this.scores.add(scores[i]);
		}
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLetterGrade() {
		return this.letterGrade;
	}
	
	public void setLetterGrade(double[] scores) {
		String grade = calcLetterGrade(scores);
		this.letterGrade = grade;
	}
	
	public List<Double> getScores() {
		return this.scores;
	}
	
	public void setScores(double[] scores) {
		for(int i = 0; i < scores.length; i++) {
			this.scores.set(i, scores[i]);
		}
	}
	
	public String toString() {
		
		String output = firstName + " " + lastName + " - " + letterGrade + ": " + scores;
		return output;
	}
	
	public String calcLetterGrade(double[] scores) {
		double sum = 0;
		double average;
		
		if(scores.length == 0)
			throw new IllegalStateException( "You must first add Scores" );
		
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		
		average = sum / scores.length;
		
		if(average >= 90)
			return "A";
		else if(average < 90 && average >= 80)
			return "B";
		else if(average < 80 && average >= 70)
			return "C";
		else if(average < 70 && average >= 60)
			return "D";
		else
			return "F";
	}
}
