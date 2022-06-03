package TestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ddf.EscherColorRef.SysIndexProcedure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sorcedemo.POM.LogOutPOM;
import com.sorcedemo.POM.SinglemutiSelectPOM;
import com.utility.souce.Screenshot;

import pratice.Loginhomepage;

public class TCProduct 
{
	WebDriver driver;
	@BeforeMethod
	public void setupmethod() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver"
			,"F:\\FirefoxDriver\\geckodriver.exe");

 driver=new FirefoxDriver();
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
	public void validation() throws IOException
	{
		SinglemutiSelectPOM po=new SinglemutiSelectPOM(driver);
		String act=po.addtocard();
		String exp="6";
		if(act.equals(act))
		{
			System.out.println("test cased passed");
		}
		else
		{
			System.out.println("test caed failed");
		}
		System.out.println(act);
		po.multiselect();
		System.out.println("single product select");
		
		
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
