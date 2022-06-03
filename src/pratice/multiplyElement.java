package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplyElement 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	//username
	WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
	user.sendKeys("standard_user");
	//password
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("secret_sauce");
	WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
	button.click();
	
	List<WebElement> cart= driver.findElements(By.xpath("//button[text()='Add to cart']"));
	
	for(int i=0;i<cart.size();i++)
	{
		cart.get(i).click();
		
	}
	
}
}
