package com.memberweb.stepDefinitions;

import com.memberweb.testSteps.SSOloginStepsCode;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSOloginSteps {
    SSOloginStepsCode ssologinStepsCode = new SSOloginStepsCode();

    @Given("^User opens Test harness page \"([^\"]*)\"$")
    public void user_verifies_Test_harness_page_is_opened(String url) {
        ssologinStepsCode.openUrl(url);
        ssologinStepsCode.verifyUrl(url);
    }
    @When("^User hovers mouse over sign in button$")
    public void hoverMouse() {
        ssologinStepsCode.hoverSignIn();
    }
    @Then("^User verifies sign in button is displayed$")
    public void user_verifies_text_fields_are_populated() {
        ssologinStepsCode.verifySignInPageAmaZon();
    }
    @When("^User clicks on \"([^\"]*)\" button$")
    public void encryptButtonClickHomePage(String buttonText) throws InterruptedException {
        ssologinStepsCode.clickEncryptButton(buttonText);
    }
    @When("^User is navigated to \"([^\"]*)\" page successfully$")
    public void user_is_navigated_to_page_successfully(String dashbordText) throws Throwable {
        ssologinStepsCode.verifyNewWindowOpened(dashbordText);
    }
    @When("^User enters text \"([^\"]*)\" in \"([^\"]*)\" textbox$")
    public void enterTextInTextBox(String textToEnter, String textBoxName) {
        ssologinStepsCode.enterText(textToEnter,textBoxName);
    }
    @When("^User selects dropdown option \"([^\"]*)\" for Content Area$")
    public void selectContentAre(String dropDownOptionToSelect) {
        ssologinStepsCode.selectContentAreaOption((dropDownOptionToSelect));
    }
}
