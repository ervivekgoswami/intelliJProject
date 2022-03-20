
package com.memberweb.teststeps;
import org.openqa.selenium.WebDriver;

import com.memberweb.pageobjects.LoginPage;
import com.memberweb.testbase.BrowserInitialization;
import com.memberweb.utilities.WebActions;
import com.memberweb.utilities.Hooks;
import com.memberweb.utilities.WaitHelper;


public class SSOloginStepsCode extends BrowserInitialization {

	//public WebDriver driver = initializeTest();
    LoginPage homePage = new LoginPage(driver);
    WaitHelper waitHelper = new WaitHelper(driver);
    WebActions webActions = new WebActions();

    public void openUrl(String url){
    	driver.get(url);
    }
    public void verifyUrlAndClickLogin(String url){
        String pageUrl = driver.getCurrentUrl();
        homePage.clickHomePageLogin();
        System.out.println("Current URL IS: "+pageUrl);
    }

    public void enterUsenameAndPassword(String useranme, String password){
        homePage.usernameAndPassword(useranme,password);
    }
    public void verifySignInPageAmaZon(){
        //homePage.verifySignInPage();
        //boolean visibility = homePage.verifySignInPage();
        //System.out.println("Sign In Page is Displayed: "+visibility);
    }
    public void clickLoginButton(String buttonText) {
       homePage.clickVisibleOnSignIn(buttonText);
    }
    
    public void clickHomePageLoginButton() {
        homePage.clickHomePageLogin();
     }
}