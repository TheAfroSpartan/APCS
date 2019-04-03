
public class Contacts {

	private String name, relation, birthday, email, phoneNum;
	
	public Contacts(String name, String relation, String birthday, String phoneNum, String email) {
		
		this.name = name;
		this.relation = relation;
		this.birthday = birthday;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRelation() {
		return this.relation;
	}
	
	public void setRelation(String relation) {
		this.relation = relation;
	}
	
	public String getBirthday() {
		return this.birthday;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getPhoneNum() {
		return this.phoneNum;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		
		String number = phoneNum.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1)$2-$3");
		String output = name + ", " + relation + ", " + birthday + ", " + number + ", " + email;
		return output;
	}
}
