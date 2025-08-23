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

public class KirillKolotov_HW_3 {
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
    public void findElementByCssSelectorTestOf(){
                              //css
        //id
        driver.findElement(By.cssSelector("#dialog-notifications-success"));
        //class name
        driver.findElement(By.cssSelector(".header"));
        //tagName
        driver.findElement(By.cssSelector("li"));
        //[attr = 'value']
        driver. findElement(By.cssSelector("[href='/login']"));
        driver.findElement(By.cssSelector(".ico-login"));
        //contains
        driver. findElement(By.cssSelector("[href*='/lo']"));
        //start
        driver.findElement(By.cssSelector("[href^='/lo']"));
        //end on
        driver. findElement(By.cssSelector("[href$='in']"));
        //tag + id
        driver.findElement(By.cssSelector("div#dialog-notifications-success"));
        //tag+class
        driver.findElement(By.cssSelector("div.bar-notification"));
        //tag+id+[attr='value']
        driver.findElement(By.cssSelector("div#dialog-notifications-success[title='Notification']"));
    }

    @Test
    public void findElementByXpath() {
        //xpath
        //tagName
        driver.findElement(By.xpath("//li"));
        //id
        driver.findElement(By.xpath("//div[@id='dialog-notifications-success']"));
        //class name
        driver.findElement(By.xpath("//div[@class='header']"));
        //contains
        driver.findElement(By.xpath("//a[contains(text(),'Log')]"));
        //equal
        driver.findElement(By.xpath("//*[text()='Log in']"));
        //start
        driver.findElement(By.xpath("//a[starts-with(@href,'/lo')]"));
        //move up
        driver.findElement(By.xpath("//div[@class='header-logo']/.."));
        //parent
        driver.findElement(By.xpath("//div[@class='header-logo']/parent::*"));
        driver.findElement(By.xpath("//div[@class='header-logo']/parent::div"));
        driver.findElement(By.xpath("//div[@class='header-logo']/.."));
        //ancestor
        driver.findElement(By.xpath("//div[@class='header-logo']/ancestor::*"));
        driver.findElement(By.xpath("//div[@class='header-logo']/ancestor::div"));
        driver.findElement(By.xpath("//div[@class='header-logo']/ancestor::div[2]"));
        //following
        driver.findElement(By.xpath("//div[@class='header-logo']/following::form"));
        //preceding-sibling
        driver.findElement(By.xpath("//div[@class='header-links-wrapper']/preceding-sibling::*"));
    }
}
