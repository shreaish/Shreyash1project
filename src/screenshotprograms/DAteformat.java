package screenshotprograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DAteformat
{
public static void main(String[] args) 
{
	Date d=new Date();
	DateFormat d1=new SimpleDateFormat("MM-hh-ss");
	String a=d1.format(d);
	System.out.println(a);
	
}
}
