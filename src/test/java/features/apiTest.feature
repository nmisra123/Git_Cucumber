Feature: LOGIN API

Scenario: Login API
	Given User has "BaseURI" and "Resource"
	When User creates "Request" 
	Then Response with staus code 200 recieved
	And Login ID is recieved