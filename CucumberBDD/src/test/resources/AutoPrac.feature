Feature: Sign in to automationPractice website

Description: create an account  and sign in successfully at AutomationPractice 	

Scenario: Create an account 

Given enter the url
When user is on the home page
Then user clicks on the signIn
And user enter's vaild email to create an account
And user clicks on the create an account button
Then user fill up the personal information Form
And user clicks on the register button


Scenario: Login to an account 

Given enter the url
Then user clicks on the signIn
When user enter's valid email and password
And user clicks on the sign in button
Then login should be successful

