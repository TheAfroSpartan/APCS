/**
 * Purpose: This Class extends from the Homework class, defining a Language Arts assignment
 * 
 * @author Andrew Owens
 * @version 2/19/19
 */
public class LanguageArts3 extends Homework3 implements Processing{

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
		String output = getSubject() + " - " + "read " + getPages() + " pages.";
		return output;
	}

	@Override
	public void work() {
		
		 int pagesRead = 0 + (int)(Math.random() * ((getPages() - 0) + 1));	
		 String output = "Before reading: " + getSubject() + " - " + getPages() + "\n" +
				 "After reading: " + getSubject() + " - " + (getPages() - pagesRead);
		System.out.println(output);
		
	}

}
