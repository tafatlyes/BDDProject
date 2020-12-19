package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class GroupsPage extends TestBase {

    @FindBy(linkText = "L")
    private WebElement letterL;

    @FindBy(linkText = "Ladies House")
    private WebElement ladiesHouseGroup;


    public void selectLtterL() {
        letterL.click();
    }

    public void validateUserCanSeeGroupsStartingWithLetterL() {
       sleepFor(5);
        Assert.assertTrue(ladiesHouseGroup.isDisplayed());
    }
}
