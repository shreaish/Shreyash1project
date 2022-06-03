package com.sorcedemo.TESTcase;

import java.time.Duration;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sorcedemo.POM.Loginpage;

public class Tc1loginpage 
{
	
public static void main(String[] args)
{WebDriver driver;
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

String Actual=driver.getTitle();
String Expected="Swag ";
if(Actual.equals(Expected))
{
	System.out.println("test case passed");
}
else
{
	System.out.println("Test case failed");
}

System.out.println("end of program");
//logout
Homepage hp=new Homepage(driver);
hp.clickmenubutton();
System.out.println("click on menu button");

hp.logout();
System.out.println("click on logout button");
driver.quit();

}
}