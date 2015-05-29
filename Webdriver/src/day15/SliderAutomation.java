package day15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderAutomation {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		
		FirefoxProfile fp=new FirefoxProfile();
		fp.setEnableNativeEvents(true);
		driver=new FirefoxDriver(fp);
		driver.get("https://jqueryui.com/slider/#slider-vertical");
		
	}
	
	@Test
	public void sliderTest()
	{
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id='slider-vertical']/span"));
	    int y=slider.getLocation().y;
	    Actions action=new Actions(driver);
	    action.dragAndDropBy(slider,25,y).build().perform();
	}

}
