package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	Actions act=new Actions(driver);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement source=driver.findElement(By.xpath("(//div[text()='Washington'])[2])"));
		Thread.sleep(3000);
		WebElement dist=driver.findElement(By.xpath("(//div[text()='United States']"));
		Thread.sleep(3000);
		act.dragAndDrop(source, dist).perform();
		Thread.sleep(3000);
			
		
		
		
		
	}
}
