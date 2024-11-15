Feature: Facebook login

Scenario: Login to facebook with current credential
	Given user is on the login page
	When titile of login page is Facebook
	Then user enters current UserName and password
	And user clicks on the login button