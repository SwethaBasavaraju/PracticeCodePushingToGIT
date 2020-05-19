Feature: Application Login

Scenario: Homepage default login
Given User is on Netbanking landing page
When User login into application with username and password
Then Home page is displayed
And Cards are displayed