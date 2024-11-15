Feature: Sign in to automationPractice website

Description: create an account  and sign in successfully at AutomationPractice 	

Scenario: Create an account 

Given enter the url
When user is on the home page
Then user clicks on the signIn
And user enter's vaild email to create an account
And user clicks on the create an account button
Then user is registration form page
And user fill up the personal information Form
And user clicks on the register button


Scenario: Login to an account with valid email and password

Given enter the url
When user clicks on the signIn
And user enter's valid email 
And user enter's valid password
And user clicks on the sign in button
Then user login successful


Scenario: Test the Login with invalid email and password
Given user is on automationpractice.com
When user clicks on the signIn
And user enter invalid email 
And user enter invalid password
And clicks on sign in
Then user is able to see error message

Scenario: Verify login with valid email and invalid password
Given user is on automationpractice.com
When user clicks on the signIn
And user enter valid email 
And user enter invalid password 
And clicks on sign in
Then user is able to see error message

Scenario: Test login with invalid email and valid password
Given user is on automationpractice.com
When user clicks on sign in
And user enter invalid email 
And user enter valid password 
And clicks on sign in
Then user is able to see error message


Scenario: Testing Summer Dress Functionality
Given user is on the home page
When user hover on women 
And clicks on summer dress
And user select price range to "26.00"
Then user clicks on Printed Chiffon dress
And user select the size M
And user select color Green
When user clicks on add to cart
And user clicks on the procced to checkout

Scenario: Checkout the items on the cart 

Given user is on Shopping cart - summery tab
When user increases the quantity to 4
And user clicks on procced to checkout 
And user clicks on Update Billing Address
When user changes the Mobile phone number
And user clicks on the Save button
Then user verify the new mobile phone number
And user clicks on procced to checkout 
When user clicks on terms of service Checkbox
And user clicks on Read the terms of service
And clicks on dismiss button to close the terms of service
Then user clicks on procced to checkout 

Scenario: payment fuctionality 

Given user is on the payment tab
When user clicks on pay by bank wire
And  user clciks on i confirm my order button
Then user clicks on back to order button
When user clicks on order reference 
Then user verify the order by total price 
When user clicks on pdf link to download the invoice 
And user clicks on return to home button 
Then user clicks on sign out 
And user closes the Browser
