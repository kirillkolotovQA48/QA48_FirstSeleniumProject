package com.qa48.hw.kirillkolotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class HW_4_TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demowebshop.tricentis.com");
    }

    @AfterMethod(enabled = false)
    public void terDown(){
        driver.quit();
    }

    protected boolean isElementPresent(By loc) {
        return driver.findElements(loc).size() > 0;
    }
}
