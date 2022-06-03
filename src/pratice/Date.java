package pratice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Date 
{
	public static void main(String[] args) 
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy  HH-mm-ss");
				
		String q=d1.format(d);
		System.out.println(q);
	}

}
//
//Date d=new Date();
//DateFormat d1=new SimpleDateFormat("MM-dd-yy HH-MM-ss");
//String date=d1.format(d);
//System.out.println(date);
//		
