Feature: my validation on mercury application
@Sanity
Scenario: user access to signup in website 
Given Mercury website is launched
And user clicks on sign up button 
When user enters proper data 
Then clicks on submit button for account creation
 @Regression
Scenario: user access to login for registered Member
Given registered user clicks on signIn link
Then he provies valid data for login input fields
And clicks on submit button for the login validation 
@Smoke
Scenario: user access to Book Flight
Given uer verifies the flights available 
Then selects the desired flight
When user makes the payments
Then Tickets are generated 


