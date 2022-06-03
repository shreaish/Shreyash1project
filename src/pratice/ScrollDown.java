package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollDown
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com");
	//get attribute
WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
user.sendKeys("standard_user");
String id=user.getAttribute("id");
System.out.println(id);
//get text
WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
pass.sendKeys("secret_sauce");
WebElement click=driver.findElement(By.xpath("//input[@id='login-button']"));
click.click();
//casting
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,2000.5)");
js.executeScript("window.scrollBy(o,-2000.5)");
}
}
