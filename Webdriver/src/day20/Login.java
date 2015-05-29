package day20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void loginTest() throws IOException, InterruptedException
	{
		FileInputStream f1=new FileInputStream("E:\\April27Batch\\Webdriver\\GmailLogin.properties");
		Properties pr=new Properties();
		pr.load(f1);
		
		LoginActions keys=new LoginActions();
		FileInputStream f=new FileInputStream("E:\\April27Batch\\Webdriver\\src\\com\\qedge\\keywords\\LoginKeywords.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheetAt(0);
	    Iterator<Row>row=ws.iterator();
	    row.next();
	    Row r=null;
	    while(row.hasNext())
	    {
	    	r=row.next();
	    	String action=r.getCell(3).getStringCellValue();
	    	if(action.equals("launchBrowser"))
	    	{
	    		keys.launchBrowser();
	    	}
	    	else if(action.equals("navigate"))
	    	{
	    		keys.navigate();
	    	}
	    	else if(action.equals("enterUsername"))
	    	{
	    		keys.enterUsername(pr.getProperty("txtUsername"));
	    	}
	    	else if(action.equals("clickNext"))
	    	{
	    		keys.clickNext(pr.getProperty("btnNext"));
	    		Thread.sleep(2000);
	    	}
	    	else if(action.equals("enterPassword"))
	    	{
	    		keys.enterPassword(pr.getProperty("txtPassword"));
	    	}
	    	else if(action.equals("clickLogin"))
	    	{
	    		keys.clickLogin(pr.getProperty("btnSignin"));
	    	}
	    }
	    
	}

}
