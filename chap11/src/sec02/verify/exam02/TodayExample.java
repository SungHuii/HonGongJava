package sec02.verify.exam02;

import java.util.Calendar;

public class TodayExample {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		int week = c.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		default:
			strWeek = "일";
		}
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		
		System.out.println(year+"년 " + month+"월 " + day+"일 "+ strWeek+"요일 "+ hour+"시 " +minute+"분");
		
	}

}
