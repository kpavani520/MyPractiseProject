package CalenderClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Example1 {
	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("E D M/d/yyy , hh:mm:ss:SSSS");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.get(Calendar.YEAR));
	
		
	}

}
