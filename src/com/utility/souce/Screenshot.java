package com.utility.souce;

import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void screenshot(WebDriver driver) throws IOException
{
	Date d=new Date();
	DateFormat d1=new SimpleDateFormat("MM-dd-yy HH-mm-ss");
	String date12=d1.format(d);
	
	TakesScreenshot tc=(TakesScreenshot)driver;
	File souce=tc.getScreenshotAs(OutputType.FILE);
	File dist=new File("G:\\screen"+date12+"source.jpg");
	FileHandler.copy(souce, dist);
	System.out.println("Screenshot is taken");
	
	
	
}
}
