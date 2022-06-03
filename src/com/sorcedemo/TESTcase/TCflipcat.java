package com.sorcedemo.TESTcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sorcedemo.POM.FlipcartLOGOUT;
import com.sorcedemo.POM.Flipcartlogpag;
import com.sorcedemo.POM.ProductselectPOM;

public class TCflipcat
{
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		
	
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");

driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Flipcartlogpag fg=new Flipcartlogpag(driver);
	fg.username();
	System.out.println("username");
	fg.password();
	System.out.println("password");
	fg.clickbutton();
	System.out.println("clickbutton");

}
	@Test
	public void validation()
	{
	String a=driver.getCurrentUrl();
	System.out.println(a);
	System.out.println("tase case passd");
	}
	@AfterMethod()
	public void teardown()
	{
		FlipcartLOGOUT n=new FlipcartLOGOUT(driver);
		n.dropdown();
		n.my();
		n.logout();
		System.out.println("end of program");
		
	}
}