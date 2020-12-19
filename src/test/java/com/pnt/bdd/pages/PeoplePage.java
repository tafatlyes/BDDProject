package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class PeoplePage extends TestBase {


    @FindBy(xpath = "//span[@class='fwb']")
    private WebElement PeopleDirectoryResultsTab;

    @FindBy(xpath = "//input[@title='Search for people']")
    private WebElement searchForPeopleTab;

    @FindBy(xpath = "//input[@id='search_form_button']")
    private WebElement searchForPeopleButton;


    @FindBy(xpath = "//div[text()='Find your friends on Facebook']")
    private WebElement findYourFriendsOnFacebookText;






    public void validatePeopleListPageIsDisplayed() {
        sleepFor(3);
        PeopleDirectoryResultsTab.isDisplayed();
    }

    public void validateSearchForPeopleTab() {
        sleepFor(6);
        searchForPeopleTab.isDisplayed();
    }

    public void fillSearchBarField(String name) {
        sleepFor(3);
        searchForPeopleTab.sendKeys(name);
    }

    public void clickOnSearchButton() {
        sleepFor(3);
        searchForPeopleButton.click();
    }

    public void validateFindYouFriendText() {
        sleepFor(3);
        findYourFriendsOnFacebookText.isDisplayed();
    }
}
