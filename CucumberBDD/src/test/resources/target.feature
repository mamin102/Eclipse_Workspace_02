Feature: Search items

Background: open browser
#Given user opens the chrome browser
When user is on the homepage of target

@SmokeTest @RegressionTest @End2EndTest
Scenario: search item from home page

Given user enters the currect url
Then search desire item on search box
And user clicks on search button
Then user should be on the searched page

@SmokeTest @RegressionTest 
Scenario: go to men catagoray 

Given user enters the currect url
Then search men on search box
And user clicks on search button
Then user should be on the searched page

@SmokeTest @RegressionTest
Scenario: go to women catagoray 

Given user enters the currect url
Then search women on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest 
Scenario: go to young adult catagoray 

Given user enters the currect url
Then search young adult on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest
Scenario: go to grocery catagoray 

Given user enters the currect url
Then search grocery on search box
And user clicks on search button
Then user should be on the searched page

@SmokeTest
Scenario: go to kids catagoray 

Given user enters the currect url
Then search kids on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest
Scenario: go to baby catagoray 

Given user enters the currect url
Then search baby on search box
And user clicks on search button
Then user should be on the searched page

@SmokeTest
Scenario: go to shoes catagoray 

Given user enters the currect url
Then search shoes on search box
And user clicks on search button
Then user should be on the searched page

@End2EndTest
Scenario: go to kitchen catagoray 

Given user enters the currect url
Then search kitchen on search box
And user clicks on search button
Then user should be on the searched page

@End2EndTest
Scenario: go to toy catagoray 

Given user enters the currect url
Then search toy on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest @End2EndTest
Scenario: go to electronics catagoray 

Given user enters the currect url
Then search electronics on search box
And user clicks on search button
Then user should be on the searched page

@End2EndTest
Scenario: go to video game catagoray 

Given user enters the currect url
Then search video game on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest
Scenario: go to furniture catagoray 

Given user enters the currect url
Then search furniture on search box
And user clicks on search button
Then user should be on the searched page

@End2EndTest
Scenario: go to sports catagoray 

Given user enters the currect url
Then search sports on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest @End2EndTest
Scenario: go to beauty catagoray 

Given user enters the currect url
Then search beauty on search box
And user clicks on search button
Then user should be on the searched page

@SmokeTest @RegressionTest
Scenario: go to health catagoray 

Given user enters the currect url
Then search health on search box
And user clicks on search button
Then user should be on the searched page

@RegressionTest @End2EndTest
Scenario: go to pets catagoray 

Given user enters the currect url
Then search pets on search box
And user clicks on search button
Then user should be on the searched page

