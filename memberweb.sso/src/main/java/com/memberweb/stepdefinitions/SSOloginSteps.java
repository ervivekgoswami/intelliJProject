package com.memberweb.stepdefinitions;

import com.memberweb.teststeps.SSOloginStepsCode;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSOloginSteps {
    SSOloginStepsCode ssologinStepsCode = new SSOloginStepsCode();

    @Given("^User opens stackoverflow page \"([^\"]*)\"$")
    public void user_verifies_Test_harness_page_is_opened(String url) {
        ssologinStepsCode.openUrl(url);
        ssologinStepsCode.verifyUrlAndClickLogin(url);
    }

    @Given("^User enters username \"([^\"]*)\" and password \"([^\"]*)\" login page$")
    public void enterUserNameAndPassword(String username, String password) {
        ssologinStepsCode.enterUsenameAndPassword(username,password);
    }

    @Then("^User verifies sign in button is displayed$")
    public void user_verifies_text_fields_are_populated() {
        ssologinStepsCode.verifySignInPageAmaZon();
    }

    @When("^User clicks on \"([^\"]*)\" button$")
    public void ButtonClickLogin(String buttonText) throws InterruptedException {
        ssologinStepsCode.clickLoginButton(buttonText);
    }
    
    @When("^User clicks on homepage button$")
    public void ButtonClickHomePage() throws InterruptedException {
        ssologinStepsCode.clickHomePageLoginButton();
    }

}
