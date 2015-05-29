package day17;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CookiesTesting1 {
	FirefoxDriver  driver;
	@BeforeMethod
	public void setUp()
	{
		
		driver=new FirefoxDriver();
		driver.get("http://mirror.co.uk");
		
	}
	
	@Test
	public void cookiesTest()
	{
		Set<Cookie> myCookies=driver.manage().getCookies();
		System.out.println(myCookies.size());
		Iterator<Cookie> it=myCookies.iterator();
		while(it.hasNext())
		{
			Cookie c=it.next();
			System.out.println(c.getName()+"--"+c.getValue()+
					                         "--"+c.getDomain());
		}
		driver.manage().deleteAllCookies();
		myCookies=driver.manage().getCookies();
		System.out.println(myCookies.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
