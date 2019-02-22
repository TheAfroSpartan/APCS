/**
 * Purpose: This Class extends from the Homework class, defining an AP Computer Science assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */
public class ComputerScience3 extends Homework3 implements Processing{

	private int pagesRead;
	
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
		String output = "Before reading: " + getSubject() + " - " + getPages() + "\n" +
						"After reading: " + getSubject() + " - " + (getPages() - pagesRead);
		return output;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		pagesRead = 0 + (int)(Math.random() * ((getPages() - 0) + 1));
		
	}
	
	

}
