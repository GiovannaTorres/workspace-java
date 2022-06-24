package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		//format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		

		Date d1 = Date.from(Instant.parse("2021-10-28T15:12:11Z"));
		System.out.println(sdf.format(d1));
		

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		
		

		Date d2 = Date.from(Instant.parse("2021-10-27T15:12:11Z"));
		System.out.println(sdf.format(d2));
		

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		
		
		boolean isItBefore = cal2.before(cal1);
		System.out.println(isItBefore);
		
		cal2.add(Calendar.HOUR_OF_DAY, 30);
		cal2.add(Calendar.MINUTE, 20);
		d2 = cal2.getTime();
		System.out.println(sdf.format(d1));
		System.out.println(sdf.format(d2));
		
		isItBefore = cal2.before(cal1);
		System.out.println(isItBefore);
		
		
		
		int minutes = cal1.get(Calendar.MINUTE);
		int hours = cal1.get(Calendar.HOUR_OF_DAY);
		int month = 1 + cal1.get(Calendar.MONTH); //plus 1 bc january is 0
		int dayY = cal1.get(Calendar.DAY_OF_YEAR);
		int dayM = cal1.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("\nCalendar 1 data: ");
		System.out.println("Hours: " + hours);
		System.out.println("Minutes: " + minutes);
		System.out.println("Day of the month: " + dayM);
		System.out.println("Month: " + month);
		System.out.println("Day of the year: " + dayY);
	}

}
