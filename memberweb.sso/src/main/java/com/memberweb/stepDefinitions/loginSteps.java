package com.memberweb.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {

    @Given("I am on the Login page URL {string}")
    public void i_am_on_the_login_page_url(String string) {

        System.out.println(string+"This is first step");
    }

    @When("I click on sign in button and wait for sign in page")
    public void i_click_on_sign_in_button_and_wait_for_sign_in_page() {

        System.out.println("This is 2nd step");
    }

    @Then("I should see Sign In Page")
    public void i_should_see_sign_in_page() {

        System.out.println("This is third step");
    }
}
