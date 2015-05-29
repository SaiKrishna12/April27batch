package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksTesting5 {

	
	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.pvrcinemas.com/");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
	    List<WebElement> links=block.findElements(By.tagName("a"));
	    for(int i=0;i<links.size();i++)
	    {
	    	System.out.println(links.get(i).getText());
	    	links.get(i).click();
	    	System.out.println(driver.getCurrentUrl());
	    	driver.navigate().back();
	    	block=driver.findElement(By.xpath("html/body/div[6]/div[1]/div[2]"));
		    links=block.findElements(By.tagName("a"));
	    }
	}

}
