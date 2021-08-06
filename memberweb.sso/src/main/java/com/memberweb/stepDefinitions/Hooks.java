package com.memberweb.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;


public class Hooks {
    private static boolean initialized = false;

    private WebDriver driver;

    @Before
    public void setup() {

    }

    public WebDriver getDriver() {
        return driver;
    }

    @After
    public void after() {

    }
}
