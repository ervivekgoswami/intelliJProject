package com.memberweb.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.log4j.Logger;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.memberweb.enums.Browsers;
import com.memberweb.testBase.BrowserInitialization;

public class Hooks {

  
BrowserInitialization browserInit;
Logger log = LoggerHelper.getLogger(Hooks.class);

    @Before
    public void initializeTest() {
    	System.out.println("Running Before Hook"); 
    	browserInit = new BrowserInitialization();
        browserInit.selectBrowser(Browsers.CHROME.name());

    }

    @After
    public void endTest(Scenario scenario) {
        System.out.println("Running After Hook");
        if (scenario.isFailed()) {

            try {
                log.info(scenario.getName() + " is Failed");
                final byte[] screenshot = ((TakesScreenshot) browserInit.driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "", "image/png"); // ... and embed it in
            } catch (WebDriverException e) {
                e.printStackTrace();
            }

        } else {
            try {
                log.info(scenario.getName() + " is pass");
                scenario.attach(((TakesScreenshot) browserInit.driver).getScreenshotAs(OutputType.BYTES), "", "image/png");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        BrowserInitialization.driver.quit();
       
    }
}
