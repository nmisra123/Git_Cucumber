package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class active {
	
	
	public WebDriver wd;
	
	
	@Given("^User invokes browser$")
	public void user_invokes_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		wd=baseClass.getDriver(); // Used common base class to invoke browser
		 wd.get("http://www.google.com");
	}
	
	@When("^User enters \"([^\"]*)\" in the text box$")
	public void user_enters_in_the_text_box(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
	  wd.findElement(By.xpath("//input[@name='q']")).sendKeys(arg1);
	  
	}

	@When("^clicks enter$")
	public void clicks_enter() throws Throwable {
		  baseClass.driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	    
	}

	@Then("^User closes browser$")
	public void user_closes_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}


}
