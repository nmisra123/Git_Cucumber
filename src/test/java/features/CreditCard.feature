Feature: Credit Card Payment

Scenario: Login to Netbanking
	Given User is on "Home" page
	When User  click on "Login" button and enter User name and password
	Then Payment successful page is displayed
	And Payment Reference number is displayed

Scenario: SignUp to Netbanking
	Given User is on "Home" page
	When User  click on Login button and enter User name and password
	Then Payment successful page is displayed
	And Payment Reference number is displayed
	
	
@Regression
Scenario: Minimum Amount Due
	Given User is on "Credit Card Pay" page
	When User fills all details and click on Minimum Due Payment button
	Then Payment successful page is displayed
	And Payment Reference number is displayed


