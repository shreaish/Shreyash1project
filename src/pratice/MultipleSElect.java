package pratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sorcedemo.POM.Loginpage;

public class MultipleSElect 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");

	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.saucedemo.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	Loginpage lp=new  Loginpage(driver);
	lp.username();
	System.out.println("enter username");
	lp.password();
	System.out.println("enter password");
	lp.clickbutton();
	System.out.println("click button");
	//selectmultipleselemt
	List<WebElement> multi=(List<WebElement>) driver.findElement(By.xpath("//button[text()='Add to cart']"));

	for(int a=0;a<multi.size();a++)
	{
		multi.get(a).click();
	}
}
}
