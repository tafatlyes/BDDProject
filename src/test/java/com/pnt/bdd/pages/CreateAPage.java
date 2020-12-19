package com.pnt.bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CreateAPage {


    @FindBy(xpath = "//div[text()='Create a Page']")
    private WebElement createAPageText;




    public void validateUserCanSeeCreatePageText() {
        Assert.assertTrue(createAPageText.isDisplayed());
    }
}
