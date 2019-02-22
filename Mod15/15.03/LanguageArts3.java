/**
 * Purpose: This Class extends from the Homework class, defining a Language Arts assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */
public class LanguageArts3 extends Homework3 implements Processing{

	private int pagesRead;
	//Constructor that calls Homework constructor 
	public LanguageArts3() {
		super();
	}

	//Defining abstract method assignment
	@Override
	public void assignment(int pages) {
		setPagesToRead(pages);
		setSubject("Language Arts");
	}
	
	//Formatting method
	public String toString() {
		String output = "Before reading: " + getSubject() + " - " + getPages() + "\n" +
						"After reading: " + getSubject() + " - " + (getPages() - pagesRead);
		return output;
	}

	@Override
	public void work() {
		
		 pagesRead = 0 + (int)(Math.random() * ((getPages() - 0) + 1));	
		
	}

}
