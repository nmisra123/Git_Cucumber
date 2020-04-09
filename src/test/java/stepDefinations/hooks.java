package stepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import org.openqa.selenium.WebDriver;


public class hooks extends baseClass{
	
	WebDriver wd;

	@Before("@Regression")
	public WebDriver BeforeValidation()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		wd= new ChromeDriver();
		 wd.get("https://www.google.com");
		 return wd;
	}
	
	/*@Before("@Active")
	public void BeforeValidation1()
	{
		
		 wd = getDriver();
		 wd.get("https://www.google.com");
		
	}*/
	
	@Before("")
	public WebDriver BeforeValidation2()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		 wd.get("https://www.google.com");
		 return wd;
	}
	
	@After("@Makemytrip")
	public void AfterValidation1()
	{
		System.out.println("completed");
		baseClass.driver.close();
	}
	
	@After("@Active")
	public void AfterBrowserDone()
	{
		baseClass.driver.close();
	}
	
	
}

