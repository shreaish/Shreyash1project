package com.sorcedemo.TESTcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.sorcedemo.POM.LogOutPOM;
import com.sorcedemo.POM.Loginpage;
import com.utility.souce.Screenshot;

import pratice.Loginhomepage;

public class TestNG1
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setupmethod(String browserName ) throws InterruptedException
	{
		if(browserName.equals("chrome"))
		{
	System.setProperty("webdriver.gecko.driver"
			,"F:\\FirefoxDriver\\geckodriver.exe");

 driver=new FirefoxDriver();
	}
	else
 {
	 System.setProperty("webdriver.chrome.driver"
				,"F:\\FirefoxDriver\\geckodriver.exe");

	 driver=new ChromeDriver();
 }
 
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Loginhomepage lp=new Loginhomepage (driver);
	lp.username();
	System.out.println("enter username");
	lp.password();
	System.out.println("enter password");
	lp.clickbutton();
	System.out.println("click button");
	Thread.sleep(1000);
	}

@Test
public void validation1() throws IOException
{
String act=driver.getTitle();
String exp="Swag Labs";
System.out.println("Test varification");
	if(act.equals(exp))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	Screenshot.screenshot(driver);
	//selectbutton
	
	//logout
	LogOutPOM lp=new LogOutPOM(driver);
	
	lp.menubutton();
	System.out.println("click on menu button");

	lp.logout();
	System.out.println("click on logout button");
}
@Test
public void validation2() throws IOException
{
String act=driver.getCurrentUrl();
String exp="https://www.saucedemo.com/inventory.html";
System.out.println("Test varification");
	if(act.equals(exp))
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("Test case failed");
	}
	Screenshot.screenshot(driver);
	//selectbutton
	
	//logout
	LogOutPOM lp=new LogOutPOM(driver);
	
	lp.menubutton();
	System.out.println("click on menu button");

	lp.logout();
	System.out.println("click on logout button");
}
@AfterMethod
public void tearDown() 
{

driver.quit();
	System.out.println("end of program");
}
	}

