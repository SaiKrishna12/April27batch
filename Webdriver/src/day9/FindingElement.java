package day9;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindingElement {
	FirefoxDriver driver;
	@BeforeMethod
	public void setUP()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		 driver=new FirefoxDriver(fp);
		driver.get("http://en.wikipedia.org/wiki/Rajinikanth");
	}
	@Test
	public void searchForElement()
	{
		String str=driver.getPageSource();
		if(str.contains("Rajnikanth"))
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
