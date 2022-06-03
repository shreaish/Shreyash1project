package screenshotprograms;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Drowdown 
{
public static void main(String[] args) throws IOException 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=  new FirefoxDriver();
	driver.get("https://www.facebook.com");

	TakesScreenshot ts=(TakesScreenshot) driver;
	File souce=ts.getScreenshotAs(OutputType.FILE);
	File distfile= new File("G:\\screen\\screenshot.jpg");
FileHandler.copy(souce, distfile);
	System.out.println("sheenshot is taken");
	
}
}

////select[@id='dropdown-class-example']