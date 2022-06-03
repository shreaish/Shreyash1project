package com.utility.souce;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;

public class Listeners implements ITestListeners
{
	WebDriver driver;
public void onTestStart(ITestResult result)
{
	System.out.println("test excution is started");
}
public void onTestfaild(ITestResult result)
{
	System.out.println("test excution is falid ");
}
public void onFinish(ITestResult result)
{
	System.out.println("test on finish");
}
public void onTestSuccess(ITestResult result)
{
	System.out.println("test on Sucess");
}
public void onTestFailure(ITestResult result) throws IOException
{
	System.out.println("test on Failure and taking screenshot");
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

