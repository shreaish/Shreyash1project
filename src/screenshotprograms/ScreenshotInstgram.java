package screenshotprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotInstgram 
{
	public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	 File distfile=new File("G:\\screen\\velocity.jpg");
	 FileHandler.copy(sourcefile, distfile);
	 System.out.println("screenshot is taken");


}
}
