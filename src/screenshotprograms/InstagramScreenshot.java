package screenshotprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InstagramScreenshot
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.instagram.com");
	
	
}
}
