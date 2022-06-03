package com.sorcedemo.TESTcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sorcedemo.POM.BYmouseAction;

public class TC1mouse 
{
	public static void main(String[] args)
	{WebDriver driver;
		System.setProperty("webdriver.gecko.driver"
				,"G:\\Automation\\mozela\\geckodriver.exe");

		 driver=new FirefoxDriver();
		System.out.println("brower open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		System.out.println("enter URL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		BYmouseAction as=new BYmouseAction(driver);
		as.username();
		as.password();
		as.loginbutton();
		System.out.println("click button");
		System.out.println("end of program");
	
	
		
		
		
		
}
}