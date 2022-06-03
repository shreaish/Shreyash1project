package screenshotprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dateandtime 
{
public static void main(String[] args) {
	
	Date d=new Date();
	DateFormat d1=new SimpleDateFormat("MM-dd-yy HH-MM-ss-ms-mms");
	String date=d1.format(d);
	System.out.println(date);
			
}
}
