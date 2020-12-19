package com.pnt.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(linkText = "Log Out")
    private WebElement logOutButton;


    public void clickOnLogOutButton() {
        logOutButton.click();
    }
}
