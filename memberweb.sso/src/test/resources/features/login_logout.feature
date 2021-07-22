Feature: As a Amazon user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given I am on the Login page URL "https://www.amazon.in/"
    When I click on sign in button and wait for sign in page
    Then I should see Sign In Page
   
