package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction
{
public static void main(String args[])
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
driver.get("https://www.saucedemo.com");
//x-path by login button
WebElement login=driver.findElement(By.xpath("//input[@id='user-name']"));
login.sendKeys("standard_user");
//password
WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
pass.sendKeys("secret_sauce");
//login button
WebElement loginbutton=driver.findElement(By.xpath("//input[@id='login-button']"));
//mouse action 
Actions act=new Actions(driver);
act.click(loginbutton).perform();






	
}
}
