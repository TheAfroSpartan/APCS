/**
 * Purpose: This Class extends from the Homework class, defining a Calculus3 assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */

public class Calculus3 extends Homework3{

	private int pages;
	//Constructor that calls Homework constructor
	public Calculus3() {
		super();
	}
	
	//Defining abstract method assignment
	@Override
	public void assignment(int pages) {
		setPagesToRead(pages);
		setSubject("Calculus");
	}
	
	//Formatting method
	public String toString() {
		String output = getSubject() + " - " + "read " + getPages() + " pages.";
		return output;
	}

	@Override
	public void work(int pages) {
		// TODO Auto-generated method stub
		int pagesRead = 0 + (int)(Math.random() * ((pages - 0) + 1));
		this.pages = pages - pagesRead;
		
	}

}