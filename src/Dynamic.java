import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dynamic
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"G:\\Automation\\mozela\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		
		WebElement user=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		user.sendKeys("7038184381");
		boolean user1=user.isSelected();
		System.out.println(user1);
		System.out.println("location=");
		user.getLocation();

		System.out.println(user.getAttribute("input"));
	
		System.out.println	(user.getTagName());
	
		System.out.println(	user.getText());
		WebElement pass=driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
		pass.sendKeys("spd1996@");
		WebElement click=driver.findElement(By.xpath("//div//button"));
		click.click();

			System.out.println(driver.getCurrentUrl());

			System.out.println(driver.getTitle());
	}

}
