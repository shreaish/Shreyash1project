package com.sorcedemo.TESTcase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sorcedemo.POM.Loginpage;
import com.sorcedemo.POM.SingleProduct;

public class Tc2 
{
	public static void main(String[] args)
	{	WebDriver driver;
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");

 driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Loginpage lp=new  Loginpage(driver);
	lp.username();
	System.out.println("enter username");
	lp.password();
	System.out.println("enter password");
	lp.clickbutton();
	System.out.println("click button");
	 SingleProduct s=new SingleProduct(driver);
	 s.singleadd();
	 System.out.println("single product select");
	 s.multipleadd();
	 System.out.println("multiple product select");
	 String a=driver.getCurrentUrl();
	 System.out.println(a);
	 String e="https://www.saucedemo.com/inventory.html";
	 if(a.equals(e))
	 {
		 System.out.println("test case passs");
	 }
	 else
	 {
		 System.out.println("tase case falied");
	 }
	 
	 
}
}