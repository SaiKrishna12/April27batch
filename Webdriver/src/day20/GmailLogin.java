package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GmailLogin {
	
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@Test
	public void loginTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\April27Batch\\Webdriver\\GmailLogin.properties");
		Properties prop=new Properties();
		prop.load(f);
		
		driver.findElement(By.id(prop.getProperty("txtUsername"))).sendKeys("gandham.saikrishna");
		driver.findElement(By.id(prop.getProperty("btnNext"))).click();
		driver.findElement(By.id(prop.getProperty("txtPassword"))).sendKeys("password@123");
		driver.findElement(By.id(prop.getProperty("btnSignin"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
