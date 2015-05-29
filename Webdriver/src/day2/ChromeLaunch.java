package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","c:\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://citibank.com");
	driver.findElement(By.linkText("Learn More")).click();
	}

}
