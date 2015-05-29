package day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputBoxes1 {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		driver=new FirefoxDriver(fp);
		driver.get("http://facebook.com");
	}
	
	@Test
	public void inputBoxesTest()
	{
		String[] str={"one","two","three","four","five","six","seven","eight"};
		List<WebElement> myinput=driver.findElements(By.xpath
				      ("//input[@type='text' or @type='password']"));
	    System.out.println(myinput.size());
	    for(int i=0;i<myinput.size();i++)
	    {
	    	myinput.get(i).sendKeys(str[i]);
	    	
	    }
	}

}
