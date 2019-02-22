/**
 *Purpose: Abstract class that defines a homework assignment
 *
 *
 *@author Andrew Owens
 *@version 2/19/19
 */
public abstract class Homework3 implements Processing{
	
	//instance variables
	private int pages;
	private String subject;

	//Constructor that initiates instance variables with default values
	public Homework3() {
		this.pages = 0;
		this.subject = "none";
	}
	
	/**
	 * Getter Method to get pages
	 * @return pages
	 */
	public int getPages() {
		return this.pages;
	}
	
	/**
	 * Getter Method to get subject of homework
	 * @return subject
	 */
	public String getSubject() {
		return this.subject;
	}
	
	/**
	 * Mutator method to set value to pages
	 * @param pages
	 */
	public void setPagesToRead(int pages){
       this.pages = pages;
    }
	
	/**
	 * Mutator method to assign String to subject
	 * @param subject
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	//abstract method
	public abstract void assignment(int pages);
}