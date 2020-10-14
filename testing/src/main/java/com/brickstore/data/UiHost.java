package com.brickstore.data;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class UiHost {

    private static final String DRIVER_PATH = "./src/main/resources/chromedriver.exe";
    private static UiHost uiHost;
    private ChromeDriver driver;

    private UiHost() {
    }

    public static UiHost getInstance() {
        if (uiHost == null) {
            uiHost = new UiHost();
        }

        return uiHost;
    }

    public void load(String url) {
        getDriver().get(url);

    }

    private ChromeDriver getDriver() {
        if (driver == null) {
            driver = instantiateDriver();
        }
        return driver;
    }

    private ChromeDriver instantiateDriver() {
        System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
        ChromeDriver aDriver = new ChromeDriver();
        return aDriver;
    }

    public void waitUntilVisible(By locator) {
        int count = 0;
        boolean found = false;
        while (!found && count < 10) {
            //noinspection CatchMayIgnoreException
            try {
                found = UiHost.getInstance().findElement(locator).isDisplayed();
            } catch (Exception e) {
            }
            waitOneSecond();
            count += 1;
        }
        LogManager.getLogger(this.getClass().getName()).warn("Unable to confirm the state of the 'Products' view");
    }

    public WebElement findElement(By locator) {
        List<WebElement> elements = getDriver().findElements(locator);
        return elements.size() == 0 ? null : elements.get(0);
    }

    private void waitOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        driver.quit();
        driver = null;
    }
}
