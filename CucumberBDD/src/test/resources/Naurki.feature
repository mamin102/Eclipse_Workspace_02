Feature: login to naukri website

Background: user is on the home page  
	Given user is home page at naukri

Scenario: user should login with current credential
	//Given user is home page at naukri
	When user is on login tab
	Then user enters currect userName and password
	And user hit the login button 
	Then user should be on the home page
	Then if wrong user should see a massage
	
Scenario: Search your desire Job in the United states
	//Given user in the homePage
	When user enters job title in the search box
	And user enters the location
	And user clicks on the search Button
	Then user should see the searched options
