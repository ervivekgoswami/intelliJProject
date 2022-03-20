package com.memberweb.pageobjects;

import com.memberweb.utilities.WaitHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Locale;

public class LoginPage {
	
	private WebDriver driver;

	@FindBy(css="a[data-gps-track='login.click']")
	public WebElement homePageLoginButton;

	@FindBy(css="input[id='email']")
	public WebElement username;

	@FindBy(css="input[id='passwor']")
	public WebElement password;

	@FindBy(css="button")
	public WebElement signInButton;

	WaitHelper waitHelper;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}

	public void clickHomePageLogin(){
		this.homePageLoginButton.click();
	}
	public void  clickVisibleOnSignIn(String text){
		String getButtonText = this.signInButton.getText();
		if(getButtonText.toLowerCase().equals(text)){
			this.signInButton.click();
		}
	}

	public void usernameAndPassword(String uName, String password){
		this.username.sendKeys(uName);
		this.password.sendKeys(password);
	}
	

}
