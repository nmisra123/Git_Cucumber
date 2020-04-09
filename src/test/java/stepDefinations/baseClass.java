package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public  static WebDriver driver;
	
	public static  WebDriver getDriver()
	{
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
	
	driver= new ChromeDriver();
	
	return driver;
	}
}
