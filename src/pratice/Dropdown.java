package pratice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	//username
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("secret_sauce");
	WebElement button= driver.findElement(By.xpath("//input[@id='login-button']"));
	
	button.click();
	WebElement filter=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
filter.click();
	Select s=new Select(filter);
	s.selectByVisibleText("Name (Z to A)");
	
	

	
}
}
