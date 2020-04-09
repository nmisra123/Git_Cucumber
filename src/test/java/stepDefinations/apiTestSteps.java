package stepDefinations;

import org.junit.runner.RunWith;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class apiTestSteps {

	@Given("^User has \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_has_and(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("API login");
	}

	@When("^User creates \"([^\"]*)\"$")
	public void user_creates(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("API request");
	}

	@Then("^Response with staus code (\\d+) recieved$")
	public void response_with_staus_code_recieved(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("API response");
	}

	@Then("^Login ID is recieved$")
	public void login_ID_is_recieved() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("API successful");
	}


}
