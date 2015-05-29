package day16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebtableCalander {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://makemytrip.com");
		
	}
	
	@Test
	public void webtableTest()
	{
		driver.findElement(By.className("radio_state")).click();
		driver.findElement(By.id("from_typeahead1")).clear();
		driver.findElement(By.id("from_typeahead1")).sendKeys("Hyderabad, India (HYD)");
		driver.findElement(By.id("to_typeahead1")).clear();
		driver.findElement(By.id("to_typeahead1")).sendKeys("New Delhi, India (DEL)");
		
		driver.findElement(By.xpath("//*[@id='start_date_sec']/span[2]")).click();
		
		String doj="12/04/2016";
		String[] a=doj.split("/");
		String[] months={"January","February","March","April","May","June","July","August","September","October","November","December"};
		int x=Integer.parseInt(a[1]);
		
		String month=months[x-1];
		String year=a[2];
		String day=a[0];
		
		String calyear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
		while(!calyear.equals(year))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a")).click();
			calyear=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[2]")).getText();
		}
		
		String calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
		while(!calmonth.equals(month))
		{
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[3]/div/a")).click();
			calmonth=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/div/div/span[1]")).getText();
			
		}
		
		WebElement table=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		boolean flag=false;
		for(int i=0;i<rows.size();i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
		    for(int j=0;j<cols.size();j++)
		    {
		    	if(cols.get(j).getText().equals(day))
		    	{
		    		cols.get(j).click();
		    		flag=true;
		    		break;
		    	}
		    }
		    if(flag==true)
		    {
		       break;
	     	}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
