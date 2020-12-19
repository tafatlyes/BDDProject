package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IdentifyPage {

    @FindBy(xpath = "//div[text()='Please enter your email or phone number to search for your account.']")
    private WebElement pleaseEnterYourEmailMessage;

    public void validateUserBeingAbleToSeePleaseenteryouremail() {
        TestBase.sleepFor(3);
        Assert.assertTrue(pleaseEnterYourEmailMessage.isDisplayed());
    }
}
