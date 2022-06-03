package screenshotprograms;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Finalscreenshot 
{
	static WebDriver driver;
public static void main(String[] args) throws IOException
{//loginpage
System.setProperty("webdriver.gecko.driver",
		"G:\\Automation\\mozela\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://www.facebook.com");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
screenshotmethod();

//home page
//driver.findElement(By.xpath(null))
	
}
public static void screenshotmethod() throws IOException
{//date
	Date d=new Date();
	DateFormat d1=new SimpleDateFormat("MM-dd-yy HH-mm-ss");
	String date=d1.format(d);
	System.out.println(date);
	//Screenshot method
	TakesScreenshot ts=(TakesScreenshot)driver;
	File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	File distfile=new File("G:\\screen\\source"+date+"soucece.jpg");
	FileHandler.copy(sourcefile, distfile);
}


}
