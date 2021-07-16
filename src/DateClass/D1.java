package DateClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1 {
	public static void main(String[] args) {
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("E D M/d/yyy , hh:mm:ss:SSSS");
		System.out.println(sdf.format(d));
        System.out.println(d.toString());
	}

}
