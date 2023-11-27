package sec02.verify.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TodayExample {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분");
		
		
		String today = sdf.format(date);
		
		
		System.out.println(today);
	}

}
