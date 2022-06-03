package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("//https://www.saucedemo.com/inventory.html");
}
}
