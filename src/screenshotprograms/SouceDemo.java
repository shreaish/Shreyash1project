package screenshotprograms;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.HasFullPageScreenshot;
import org.openqa.selenium.io.FileHandler;

public class SouceDemo
{
	static WebDriver driver;
	
	
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	  driver=new FirefoxDriver();
	driver.get("https://www.flipkart.com/?ef_id=EAIaIQobChMIo7bGgLvD9wIVxFVgCh0NVgwnEAAYASAAEgICOfD_BwE:G:s&s_kwcid=AL!739!3!556022308048!!!g!!&cmpid=sem_9790089436_Catchall_New_dsa_MinusProductPage_goog&gclid=EAIaIQobChMIo7bGgLvD9wIVxFVgCh0NVgwnEAAYASAAEgICOfD_BwE");
	screenshotmethod();
	//loginid
	WebElement user=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	user.click();
	WebElement password=driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
	button.click();
	screenshotmethod();	
}
public static void screenshotmethod() throws IOException
{
	//datetime
Date d=new Date();
DateFormat d1=new SimpleDateFormat("MM-dd-yy HH-mm-ss");
String date=d1.format(d);

//screenshot
TakesScreenshot ts=(TakesScreenshot)driver;
File sourcefile=ts.getScreenshotAs(OutputType.FILE);
File distfile=new File("G:\\screen\\sourcedemo"+date+"123.jpg");
FileHandler.copy(sourcefile, distfile);
}




	
	
	
	
}
