import java.util.ArrayList;

/*
 * 0 --> Sun
 * 1 --> mon
 * 2 --> tue
 * 3 --> wed
 * 4 --> thu
 * 5 --> fri
 * 6 --> sat
 *  
 */

public class DaysOfWeek {
	
	private ArrayList<String> days = new ArrayList<>();
	
	public DaysOfWeek() {
		super();
		days.add("SUNDAY");
		days.add("MONDAY");
		days.add("TUESDAY");
		days.add("WEDNESDAY");
		days.add("THURSDAY");
		days.add("FRIDAY");
		days.add("SATURDAY");
	}
	
	
	public void getDay(int day) {
		String result = "";
		if(day>=7) {
			result = days.get(day%7);
		}
		else {
			result = days.get(day);
		}
		System.out.println(result);
	}
	
	

}
