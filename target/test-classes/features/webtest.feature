Feature: Login to Application


#Prerequisite for executing your scenarios within this feature file
Background:
	Given Validate the browser
	When Browser is triggered 
	Then Check if browser is started
	And Home page is launched 

 #using tags
 
 @Makemytrip
Scenario: Login using Username and Pwd
	Given User is on Main page
	When User click on Login button 
	And enter "Username" and "password"
	Then Payment successful page is displayed
	And Username displayed on the top right corner
	

#Using DataTable

Scenario: SignUP using Username and Pwd
	Given User is on Main page
	When User sign up with details
	| neha | misra | 9910079534 | India |
	| pradeep | misra | 9810079534 | Pakistan |  
	
	And enter User name and password
	Then Payment successful page is displayed
	And Username displayed on the top right corner
	

#Using Parameterization

Scenario Outline: Login using Username and Pwd
	Given User is on <Main> page
	When User click on Login button 
	And enter User name and password
	Then Payment successful page is displayed
	And Username displayed on the top right corner
	
	Examples:
	|Home|
	|GoogleHome|
	|AppHome|