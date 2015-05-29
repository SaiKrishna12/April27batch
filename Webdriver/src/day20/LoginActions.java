package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginActions {
	FirefoxDriver driver;
	public void launchBrowser()
	{
		driver=new FirefoxDriver();
	}
	public void navigate()
	{
		driver.get("http://gmail.com");
	}
	public void enterUsername(String locator)
	{
		driver.findElement(By.id(locator)).sendKeys("gandham.saikrishna@gmail.com");
	}
	public void clickNext(String locator)
	{
		driver.findElement(By.id(locator)).click();
	}
	public void enterPassword(String locator)
	{
		driver.findElement(By.id(locator)).sendKeys("password@123");
	}
	public void clickLogin(String locator)
	{
		driver.findElement(By.id(locator)).click();
	}

}
