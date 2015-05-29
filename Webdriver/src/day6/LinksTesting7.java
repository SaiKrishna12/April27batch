package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class LinksTesting7 {

	
	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("SeleniumUser");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links count is "+links.size());
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				count++;
			}
		}
		System.out.println("Visible links count is "+count);
		System.out.println("Hidden liks count is "+(links.size()-count));
		
		
		
		
		
		
		
	}

}
