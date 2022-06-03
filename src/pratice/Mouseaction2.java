package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction2
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoqa.com/buttons");
	//Action
	Actions act =new Actions(driver);
	
	//click
WebElement clickbutton=driver.findElement(By.xpath("//button[text()='Click Me']"));
String text=clickbutton.getText();
System.out.println(text);
act.click(clickbutton).perform();
Thread.sleep(3000); 
//right click 
WebElement clickbright=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
clickbright.click();
//double click
WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
doubleclick.click();
////


	
	
	
	
	
	
}
}
