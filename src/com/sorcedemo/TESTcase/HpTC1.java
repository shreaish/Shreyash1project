package com.sorcedemo.TESTcase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sorcedemo.POM.Homepage1;
import com.utility.souce.Screenshot;

public class HpTC1
{ WebDriver driver;
	@Test 
	public void method() throws IOException
	{
		System.setProperty("webdriver.gecko.driver"
				,"G:\\Automation\\mozela\\geckodriver.exe");

	 driver=new FirefoxDriver();
		System.out.println("brower open");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		System.out.println("enter URL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		 Homepage1 hp=new Homepage1(driver);
		 
		 hp.username();
		 System.out.println("username");
		 hp.password();
		 System.out.println("password");
		 hp.clickbutton();
		 System.out.println("click button");
		String a= hp.getTest();
		System.out.println(a);
		 
		 hp.singleproduct();
		 System.out.println("single product");
		 hp.multiproduct();
		 System.out.println("multiply product");
		 Screenshot.screenshot(driver);
		 System.out.println("screenshot is taken");
		 hp.menubutton();
		 System.out.println("menu button");
		 hp.logout();
		 System.out.println("logout button");
		
}
}