package com.qa48.hw.kirillkolotov;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_4_CreateAccountTests extends HW_4_TestBase {

    @Test
    public void newUserRegistrationPositiveTest(){
        driver.findElement(By.cssSelector("[href=\"/register\"]")).click();
        driver.findElement(By.id("gender-male")).click();

        driver.findElement(By.id("FirstName")).click();
        driver.findElement(By.id("FirstName")).clear();
        driver.findElement(By.id("FirstName")).sendKeys("Kirill");

        driver.findElement(By.id("LastName")).click();
        driver.findElement(By.id("LastName")).clear();
        driver.findElement(By.id("LastName")).sendKeys("Kolotov");

        String email = "2345@mail.ru";
        driver.findElement(By.id("Email")).click();
        driver.findElement(By.id("Email")).clear();
        driver.findElement(By.id("Email")).sendKeys(email);

        driver.findElement(By.id("Password")).click();
        driver.findElement(By.id("Password")).clear();
        driver.findElement(By.id("Password")).sendKeys("Aa123456789!");

        driver.findElement(By.id("ConfirmPassword")).click();
        driver.findElement(By.id("ConfirmPassword")).clear();
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Aa123456789!");

        driver.findElement(By.id("register-button")).click();

        By accountLink = By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
        String displayedText = driver.findElement(accountLink).getText();

        Assert.assertTrue(displayedText.equals(email));

    }
}

