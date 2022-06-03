package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sorcedemo.POM.LogOutPOM;
import com.sorcedemo.POM.Loginpage;

public class Tc1loginpage
{ WebDriver driver;
@BeforeMethod
public void SetupMethod()
{
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	System.out.println("browser is open");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Loginpage lp=new  Loginpage(driver);
	lp.username();
	System.out.println("enter username");
	lp.password();
	System.out.println("enter password");
	lp.clickbutton();
	System.out.println("enter login button");
	LogOutPOM hp=new LogOutPOM(driver);
	hp.menubutton();
	System.out.println("click menubutton");
	hp.logout();
	System.out.println("click logout button");
}
@Test
public void validatingfuctionality1()
{
String actual=driver.getTitle();
	String expected="Swag Labs";
	
	if(actual.equals(expected))
	{
		System.out.println("1st test case is passed");
	}
	else
	{		System.out.println("1st test case is failed ");
}
	LogOutPOM hp=new LogOutPOM(driver);
	hp.menubutton();
	System.out.println("click menubutton");
	hp.logout();
	System.out.println("click logout button");
	
}
//@Test
//public void validationfunctionlity2()
//{String r1=driver.getCurrentUrl();
//String r2="https://www.saucedemo.com";
//	if(r1.equals(r2))
//	{
//		System.out.println("2st test case is passed");
//	}
//	else
//	{
//		System.out.println("2st test case is failed ");
//	}

//	
//}

}
