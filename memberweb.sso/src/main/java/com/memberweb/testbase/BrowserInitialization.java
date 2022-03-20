package com.memberweb.testbase;

import com.memberweb.enums.Browsers;
import com.memberweb.enums.OS;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserInitialization {
    public static WebDriver driver;
    public String url = "https://stackoverflow.com/";


    public WebDriver selectBrowser(String browser) {
        if (System.getProperty("os.name").toLowerCase().contains(OS.WINDOW.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                //driver.get(url);
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
                driver = new FirefoxDriver();
                driver.get(url);
            }
        } else if (System.getProperty("os.name").toLowerCase().contains(OS.MAC.name().toLowerCase())) {
            if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver");
                driver = new ChromeDriver();
                //driver.get(url);
            } else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
                System.setProperty("webdriver.firefox.marionette", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver");
                driver = new FirefoxDriver();
                driver.get(url);
            }
        }
        return driver;
    }
}
