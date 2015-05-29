package day13;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultilpleWindows1 {
	
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://citibank.com");
		
	}
	
	@Test
	public void multipleWindowTest()
	{
		driver.findElement(By.linkText("Learn More")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
		   driver.switchTo().window(it.next());
		   try
		   {
		      driver.findElement(By.xpath("html/body/div[1]/div[1]/div/div[2]/div[1]/div[1]/a/img")).click();
		      break;
		   }
		   catch(Exception e)
		   {
			   
		   }
		}
		
		
		
		
		
		
		
		
		
		
	}

}
