Feature: As a Amazon user I should be able to login and logout with valid credentials

  Scenario: Login into the application with valid credentials
  	Given User opens stackoverflow page "https://stackoverflow.com/"
  	And User clicks on homepage button
    When User enters username "vivek4u406@gmail.com" and password "march111" login page
    Then User verifies sign in button is displayed
    And User clicks on "log in" button
   
