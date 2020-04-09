package stepDefinations;



import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.webTestObjects;

import java.util.*;

@RunWith(Cucumber.class)
public class webTestSteps extends webTestObjects{
	
	
	
	public WebDriver wd;
	webTestObjects wto=new webTestObjects();

			
		@Given("^User is on Main page$")
		public void user_is_on_Main_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			
	}
		
		@When("^enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enter_and(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			InputUsername().sendKeys("arg1");
			  InputPwd().sendKeys("arg2");
		}
		

		
	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
// Write code here that turns the phrase above into concrete actions
		
	}
	
	@Then("^Payment successful page is displayed$")
	public void payment_successful_page_is_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("payment successful");
	 
	}

	@Then("^Username displayed on the top right corner$")
	public void username_displayed_on_the_top_right_corner() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("Web name displayed");
	}
	
	@When("^User sign up with details$") // Using concept of DataTable
	public void user_sign_up_with_details(DataTable data) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(1).get(3));
				
	
	}
	
	@Given("^User is on <Main> page$")
	public void user_is_on_Main_page1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	
}
