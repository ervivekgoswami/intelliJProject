package com.memberweb.testSteps;

import com.memberweb.pageObjects.LoginPage;
import com.memberweb.testBase.BrowserInitialization;
import com.memberweb.utilities.WaitHelper;


public class loginStepsCode extends BrowserInitialization {
    LoginPage loginPage = new LoginPage(driver);
    WaitHelper waitHelper = new WaitHelper(driver);

    public void enterUserName(String userName){
        loginPage.enterUserName(userName);
    }

    public void enterPassword(String password){
        loginPage.enterUserName(password);
    }

}
