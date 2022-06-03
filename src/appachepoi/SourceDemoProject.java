package appachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class SourceDemoProject

{
	public static WebDriver driver;
public static void main(String[] args) throws IOException
{
	System.setProperty("webdriver.gecko.driver",
			"G:\\Automation\\mozela\\geckodriver.exe");
	 driver=new FirefoxDriver();
	driver.get("https://www.saucedemo.com");
	
	String path="G:\\Excalsheet\\apache.xlsx";
	FileInputStream file=new FileInputStream(path);
	XSSFWorkbook book=new XSSFWorkbook(file);
	//ID
	String userid=book.getSheet("selenium").getRow(0).getCell(0).getStringCellValue();
	System.out.println(userid);
	//passsword
	
	String password=book.getSheet("selenium").getRow(1).getCell(0).getStringCellValue();
	System.out.println(password);
	WebElement user=driver.findElement(By.xpath("//input[@id='user-name']"));
	user.sendKeys(userid);
	WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
	pass.sendKeys(password);
	screenshotmethod();
	WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
	button.click();

	//(//div//button)[3]
	WebElement add=driver.findElement(By.xpath("(//div//button)[3]"));
	add.click();
	screenshotmethod();
		
}
//screenshot method
public static void screenshotmethod() throws IOException
{
Date d=new Date();
DateFormat d1=new SimpleDateFormat();
String date=d1.format(d);

TakesScreenshot ts =(TakesScreenshot)driver;
File sourcefile=ts.getScreenshotAs(OutputType.FILE);
File distfile=new File("G:\\screen\\sourcedemo"+date+"demo.jpg");
FileHandler.copy(sourcefile, distfile);
}

}
