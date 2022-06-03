package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe 
{
public static void main(String[] args)
{

	System.setProperty("webdriver.gecko.driver"
		,"G:\\Automation\\mozela\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();
//frame1

driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame2']"));
////
driver.switchTo().frame(iframe);
//dropdown
	WebElement drop=driver.findElement(By.xpath("//select[@id='animals']"));
	drop.click();
	Select s=new Select(drop);
	s.selectByVisibleText("Avatar");
	System.out.println("end");
driver.switchTo().defaultContent();
WebElement frame2=driver.findElement(By.xpath("//iframe[@id='frame1']"));
driver.switchTo().frame(frame2);
WebElement box=driver.findElement(By.xpath("(//input)[1]"));
box.sendKeys("indian");
WebElement click=driver.findElement(By.xpath("//input[@id='a']"));
click.click();
System.out.println("program end");

}
}
