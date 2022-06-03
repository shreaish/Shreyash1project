package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Finalmousehandling 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"G:\\Automation\\mozela\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
		Actions act=new Actions(driver);
	act.sendKeys("shreyash").perform();
	WebElement text=driver.findElement(By.xpath("//p[@id='result']"));
	String result=text.getText();
	System.out.println(result);
		
	}
}
