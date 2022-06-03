package pratice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseaction3 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://demoqa.com/buttons");
	//Action
	Actions act =new Actions(driver);
	//normal click;   //button[text()='Click Me']
	//right click    //button[text()='Right Click Me']
	//double click  Double Click Me   //button[text()='Double Click Me']
	//drag And Drop
	
	//1.normal click
	WebElement click1=driver.findElement(By.xpath("//button[text()='Click Me']"));
	act.click(click1).perform();
	String data1=click1.getText();
	System.out.println(data1);
	Thread.sleep(3000);
	 //right click
	WebElement click2=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
	act.contextClick(click2).perform();
	String data2=click2.getText();
	System.out.println(data2);
	Thread.sleep(3000);
	//double click
	WebElement click3=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	act.doubleClick(click3).perform();
	String data3=click3.getText();
	System.out.println(data3);
	Thread.sleep(3000);
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	WebElement source=driver.findElement(By.xpath("(//div[text()='Washington'])[2])"));
	Thread.sleep(3000);
	WebElement dist=driver.findElement(By.xpath("(//div[text()='United States']"));
	Thread.sleep(3000);
	act.dragAndDrop(source, dist);
	Thread.sleep(3000);
	
	
}
}
