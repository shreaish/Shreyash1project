package pratice;

import java.time.Duration;
import java.time.temporal.TemporalAmount;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sorcedemo.POM.Loginpage;

public class Selectmulti
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	System.out.println("browser opened");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Loginpage ip=new Loginpage(driver);
			ip.username();
			System.out.println("enter user");
			ip.password();
			System.out.println("enter password");
			ip.clickbutton();
			System.out.println("click button");
			//select  multiple product
		List<WebElement> al=(List<WebElement>) driver.findElement(By.xpath("//button[text()='Add to cart']"));
		for(int i=0;i<=5;i++)
		{
		al.get(i).click();
		}
	

		
}
}
