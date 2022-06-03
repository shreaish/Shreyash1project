package screenshotprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAteprogram 
{
	public static void main(String[] args)
	{
		Date d=new Date();
		DateFormat d1=new SimpleDateFormat("MM-dd-yy &HH-mm-ss");
		String date=d1.format(d);
		System.out.println(date);
		
		
	}

}
