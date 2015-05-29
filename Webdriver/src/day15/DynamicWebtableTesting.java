package day15;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicWebtableTesting {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		
	}
	
	@Test
	public void webtableTest()
	{
		WebElement table=driver.findElement(By.xpath("html/body/div[6]/section[2]/div[1]/table"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
	    for(int i=0;i<rows.size();i++)
	    {
	    	List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
	        for(int j=0;j<cols.size();j++)
	        {
	        	System.out.print(cols.get(j).getText()+"   ");
	        }
	        System.out.println();
	    }
	}

}
