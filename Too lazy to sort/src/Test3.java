
public class Test3 {

	public static int daysInYear(int year) {
		int days;
		if(year % 4 == 0 && (year % 100 == 0) == false) {
			days = 366;
			return days;
		}
		if(year % 400 == 0) {
			days = 366;
			return days;
		}
		else {
			days = 365;
			return days;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yeet = daysInYear(1992);
		System.out.println(yeet);
	}

}
