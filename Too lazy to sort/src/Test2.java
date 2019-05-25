
public class Test2 {

	public static String worldFormat;
	
	//public Test2(String worldFormat1) {
		//worldFormat = worldFormat1; 
	//}
	public static String convertTime(String worldFormat) {
		String[] parts = worldFormat.split(":");
		String AmPm;
		String hour = parts[0];
		String minute = parts[1];
		int newHour = Integer.parseInt(hour);

		if(newHour > 12) {
			int USHour = newHour - 12;
			AmPm = "PM";
			String time = (USHour + ":" + minute + " " + AmPm);
			return time;
		}
		else if(newHour == 12) {
			AmPm = "PM";
			String time = (newHour + ":" + minute + " " + AmPm);
			return time;
		}
		else if(newHour < 12) {
			AmPm = "AM";
			String time = (newHour + ":" + minute + " " + AmPm);
			return time;
		}
		return hour;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yeey = convertTime("15:22");
		System.out.println(yeey);
	}

}
