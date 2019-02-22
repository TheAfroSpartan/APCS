/**
 * Purpose: This Class extends from the Homework class, defining a Spanish3 assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */
public class Spanish3 extends Homework3{

	//Constructor that calls Homework constructor
	public Spanish3() {
		super();
	}

	//Defining the abstract method assignment
	@Override
	public void assignment(int pages) {
		setPagesToRead(pages);
		setSubject("Spanish3");
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