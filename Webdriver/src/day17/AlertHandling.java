package day17;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
	
	@Test
	public void alertTest()
	{
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
		
		Alert a=driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.linkText("Gmail")).click();

	}

}
