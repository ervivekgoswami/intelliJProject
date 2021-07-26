package com.memberweb.stepDefinitions;

import com.memberweb.testSteps.loginStepsCode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
    loginStepsCode loginSteps = new loginStepsCode();
    @Given("User enters username  \"username\" on amazon application")
    public void enterUserName(String userName) {
        System.out.println(userName);
    }

    @When("User enters password \"password\" on amazon application")
    public void enterPassword(String password) {
        System.out.println(password);
    }

    @Then("User clicks on login \"login\" button")
    public void i_should_see_sign_in_page(String login) {
        System.out.println(login);
    }
}
