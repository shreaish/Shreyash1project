import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Domclass 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.gecko.driver","G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	System.out.println("browser is open");
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	username.sendKeys("standard_user");
	System.out.println("enter username");
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys("secret_sauce");
	System.out.println("enter password");
	WebElement click=driver.findElement(By.xpath("//input[@id='login-button']"));
	Actions act=new Actions(driver);
	act.click(click).perform();
	System.out.println("click login button");
	//validation
	String actual=driver.getTitle();
	System.out.println(actual);
	String expected ="Swag Labs";
	if(actual.equals(expected))
	{
		System.out.println("test case pass");
	}
	else
	{
		System.out.println("test case faild");
	}
	WebElement menubutton=driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
	
	menubutton.click();
	System.out.println("click logoutbutton");
	WebElement logoutbutton=driver.findElement(By.xpath("//a[text()='Logout']"));
	driver.quit();
	System.out.println("end of program");
}
}
