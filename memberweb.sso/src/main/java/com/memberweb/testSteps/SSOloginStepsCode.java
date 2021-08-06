
package com.memberweb.testSteps;
import com.memberweb.pageObjects.LoginPage;
import com.memberweb.testBase.BrowserInitialization;
import com.memberweb.utilities.WebActions;
import com.memberweb.utilities.WaitHelper;


public class SSOloginStepsCode extends BrowserInitialization {

    LoginPage homePage = new LoginPage(driver);
    WaitHelper waitHelper = new WaitHelper(driver);
    WebActions webActions = new WebActions();

    public void openUrl(String url){
        getdriver().get(url);
    }
    public void verifyUrl(String url){
        String pageUrl = getdriver().getCurrentUrl();
        System.out.println("Current URL IS: "+pageUrl);
    }
    public void hoverSignIn(){
        homePage.clickOnSignIn();
        waitHelper.WaitForElement(homePage.signInButton,3);
        homePage.clickVisibleOnSignIn();
    }
    public void verifySignInPageAmaZon(){
        //homePage.verifySignInPage();
        boolean visibility = homePage.verifySignInPage();
        System.out.println("Sign In Page is Displayed: "+visibility);
    }
    public void clickEncryptButton(String buttonText) throws InterruptedException {
       // homePage.clickEncryptButton(buttonText);
        Thread.sleep(5000);
    }
    public  void verifyNewWindowOpened(String windowTitle) throws InterruptedException {
        //webActions.switchToNewWindow();
        String newWindowUrl = driver.getCurrentUrl();
        String winTitle = driver.getTitle();
    }
    public void enterText(String text, String textboxname){
        //homePage.enterTextIntextBox(text,textboxname);
    }
    public void selectContentAreaOption(String option){
        //homePage.selectContentAreaDropDown(option);
    }
    public void clickLogoutLink(){
        //dashboardPage.clickLogoutButton();
    }
}