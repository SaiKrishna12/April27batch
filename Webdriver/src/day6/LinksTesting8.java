package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting8 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				String linkname=links.get(i).getText();
				String expurl=links.get(i).getAttribute("href");
			    links.get(i).click();
			    String acturl=driver.getCurrentUrl();
			    if(acturl.contains(expurl))
			    {
			    	System.out.println(linkname+" is working correctly");
			    }
			    else
			    {
			    	System.out.println(linkname+" is working not correctly");
			    }
			    driver.navigate().back();
			    links=driver.findElements(By.tagName("a"));
			}
			
			
		}
		driver.close();
	}

}
