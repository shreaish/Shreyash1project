import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class address
{
public static void main(String[] args)
{
	
	System.setProperty("webdriver.gecko.driver"
			,"G:\\Automation\\mozela\\geckodriver.exe");
	
WebDriver driver=new FirefoxDriver();
driver.get("https://vctcpune.com");
WebElement test=driver.findElement(By.xpath("(//a[@href='../selenium/practice.html'])[1]"));
test.click();
List <String> ab= new ArrayList<String>(driver.getWindowHandles());
System.out.println(ab);
driver.switchTo().window(ab.get(1));


//System.out.println(ad);


WebElement textbox=driver.findElement(By.xpath("//input[@id='//input[@id='autocomplete']"));
textbox.sendKeys("i am shreyash");
System.out.println("End Of Program");
////input[@id='name']	
}
}
