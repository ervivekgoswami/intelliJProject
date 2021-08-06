package com.memberweb.pageObjects;

import com.memberweb.utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="")
	public WebElement userName;

	@FindBy(css="[id*=nav-link-accountList]")
	public WebElement signIn;

	@FindBy(xpath="//h1[contains(text(),'Sign-In')]")
	public WebElement signInPage;

	@FindBy(css="span[class='nav-action-inner']")
	public WebElement signInButton;

	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void enterUserName(String userName){
		this.userName.sendKeys(userName);
	}
	public void  clickOnSignIn(){
		this.signIn.click();
	}
	public void  clickVisibleOnSignIn(){
		this.signInButton.click();
	}


	public boolean verifySignInPage(){
		return this.signInPage.isDisplayed();
	}
	

}
