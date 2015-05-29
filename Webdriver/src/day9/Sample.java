package day9;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	@BeforeClass
	public void fun1()
	{
		System.out.println("abc");
	}
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("This is for login app");
	}
	
	
	@Test(priority=1)
	public void registrationTest()
	{
		System.out.println("This is for registration");
	}
	
	@Test(priority=2)
	public void logoutTest()
	{
		System.out.println("This is for logout app");
	}
	
	
	
	
	
	

}
