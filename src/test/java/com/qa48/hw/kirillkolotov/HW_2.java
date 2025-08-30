package com.qa48.hw.kirillkolotov;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HW_2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void terDown(){
        driver.quit();
    }
    @Test
    public void findElementBySimpleLocatorsD(){
        WebElement element = driver.findElement(By.id("dialog-notifications-success"));
        System.out.println(element.getText());

        WebElement header = driver.findElement(By.className("header"));
        System.out.println(header.getText());
    }
    @Test
    public void findElementByTag() {
        List<WebElement> webElementList = driver.findElements(By.tagName("a"));
        System.out.println(webElementList.size());
    }
    @Test
    public void findElementByTagError(){
        WebElement r = driver.findElement(By.tagName("r"));
        System.out.println(r.getText());
    }

}
