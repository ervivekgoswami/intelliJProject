Feature: As a Amazon user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given User opens Test harness page "https://www.amazon.in/"
    When User hovers mouse over sign in button
    Then User verifies sign in button is displayed
   
