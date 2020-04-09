package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.webTestObjects;

public class preRequisite extends baseClass {
	
	public static WebDriver wd;
	baseClass driver;
	
	public preRequisite()
	{
		
		this.wd=baseClass.driver;
	}
	
	@Given("^Validate the browser$")
	public void validate_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 //initialize driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver_win32\\chromedriver_win32\\chromedriver.exe");
		
		wd= new ChromeDriver();
		//this.wd=getDriver();
		System.out.println("Browser validation");
		
	}

	@When("^Browser is triggered$")
	public void browser_is_triggered() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.get("http://www.google.com");
		
	}

	@Then("^Check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Browser started");
	}

	@Then("^Home page is launched$")
	public void home_page_is_launched() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page launched");
		
		
	
	}

}
