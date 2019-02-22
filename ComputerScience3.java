/**
 * Purpose: This Class extends from the Homework class, defining an AP Computer Science assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */
public class ComputerScience3 extends Homework3{

	//Constructor that calls Homework Constructor
	public ComputerScience3() {
		super();
	}

	//Defining the abstract method assignment
	@Override
	public void assignment(int pages) {
		setPagesToRead(pages);
		setSubject("AP Computer Science");
	}
	
	//Formatting method
	public String toString() {
		String output = getSubject() + " - " + "read " + getPages() + " pages.";
		return output;
	}

	@Override
	public void work(int pages) {
		// TODO Auto-generated method stub
		
	}
	
	

}