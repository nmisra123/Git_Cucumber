package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import stepDefinations.preRequisite;

public class webTestObjects  {

	//public WebDriver wd;
	preRequisite pR = new preRequisite();
	
	
	
	By input=By.xpath("//input[@name='q']");
	By pwd=By.xpath("//input[@name='q']");
	

	public WebElement InputUsername()
	{
		
		return pR.wd.findElement(input);
	}
	
	public WebElement InputPwd()
	{
		
		return pR.wd.findElement(pwd);
	}
	
	




	
	
	
}
