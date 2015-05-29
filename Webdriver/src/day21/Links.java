package day21;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Links  extends Launch{
	@Test
	public void linkstest() throws IOException
	{
		
		
		FileInputStream f=new FileInputStream("E:\\April27Batch\\Webdriver\\src\\com\\qedge\\excelfiles\\links.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		Row r=null;
		Cell c=null;
		
		Iterator<Row> row=ws.iterator();
		row.next();
		while(row.hasNext())
		{
			r=row.next();
			try
			{
			   String linkname=r.getCell(0).getStringCellValue();
			   driver.findElement(By.linkText(linkname)).click();
			   String acturl=driver.getCurrentUrl();
			   c=r.createCell(2);
			   c.setCellValue(acturl);
			   String expurl=r.getCell(1).getStringCellValue();
			   c=r.createCell(3);
			   if(acturl.equals(expurl))
			   {
				   c.setCellValue("Passed");
			    }
			   else
			  {
				  c.setCellValue("Failed");
			   }
			  driver.navigate().back();
			  
			}
			catch(Exception e)
			{
				c=r.createCell(3);
				c.setCellValue("Link not found");
			}
			
			
			
		}
		
		FileOutputStream f1=new FileOutputStream("E:\\April27Batch\\Webdriver\\src\\com\\qedge\\resultexcelfiles\\links.xlsx");
		wb.write(f1);
		f1.close();
		
		
		
		
		
		
		
	}

}
