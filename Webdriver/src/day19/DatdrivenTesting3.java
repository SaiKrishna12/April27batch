package day19;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatdrivenTesting3 {
	FirefoxDriver driver=null;
	@BeforeMethod
	public void setUp()
	{
		driver=new FirefoxDriver();
		driver.get("https://care.ideacellular.com/wps/portal/account/express-paybill?gclid=CNDS8enD3sUCFVgMjgod8kAAlg#Z7_JH56H4K0K8MP90AS8PIGS60CN3?iFrameAction=com.idea.selfcare.action.UrlRedirectAction");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@Test
	public void datadrivenTest() throws IOException
	{
		FileInputStream f=new FileInputStream("E:\\April27Batch\\Webdriver\\src\\com\\qedge\\excelfiles\\ajaxdata.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		Cell c=null;
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			r=row.next();
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_confmobileNo")).click();
			WebElement ajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label"));
			String actajax=null;
			if(!ajax.getText().isEmpty())
			{
			    actajax=driver.findElement(By.xpath("//*[@id='errorHolder']/label")).getText();
			   
			   
		    }
			else
			{
					 actajax="No Ajax";
			}
			r.createCell(2).setCellValue(actajax);
			String expajax=r.getCell(1).getStringCellValue();
			if(actajax.equals(expajax))
			{
				   r.createCell(3).setCellValue("Passed");
			}
			else
			{
				r.createCell(3).setCellValue("Failed");
			  }
			  driver.findElement(By.id("ns_Z7_JH56H4K0KOIPA0ASI08BTI30O5_mobileNumber")).clear();
		}
		FileOutputStream f1=new FileOutputStream("E:\\April27Batch\\Webdriver\\src\\com\\qedge\\resultexcelfiles\\Ajaxdata.xlsx");
		wb.write(f1);
		f1.close();
		
	}	
		
		
		
		
		
		

}
