package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LandingPage extends TestBase{

    @FindBy(xpath = "//img[@class='fb_logo _8ilh img']")
    private WebElement fbLogo;

    @FindBy(linkText = "Log In")
    private WebElement logInButton;

    @FindBy(id ="email")
    private WebElement emailField;

    @FindBy(id ="pass")
    private WebElement passwordField;

    @FindBy(id ="u_0_b")
    private WebElement loginBtn;

    @FindBy(xpath = "//div[@class='_9ay7']")
    private WebElement errorMessage;

    @FindBy(xpath = "//a[@title='Sign Up for Facebook']")
    private WebElement signUpButton;

    @FindBy(linkText = "People")
    private WebElement peopleButton;

    @FindBy(xpath = "//a[text()='Forgot Password?']")
    private WebElement forgetPasswordButton;

    @FindBy(xpath = "//a[text()='Create a Page']")
    private WebElement createAPageButton;

    @FindBy(xpath = "//a[@title='Show more languages']")
    private WebElement showMoreLanguagesButton;

    @FindBy(linkText = "Eastern Europe")
    private WebElement easternEurope;

    @FindBy(linkText = "Română")
    private WebElement  RomânăLanguage;

    @FindBy(linkText = "Create New Account")
    private WebElement    createAccountButton;

    @FindBy(linkText = "Français (France)")
    private WebElement frenchLanguageButton;

    @FindBy(xpath = "//h2[text()='Avec Facebook, partagez et restez en contact avec votre entourage.']")
    private WebElement FrenchText;

    @FindBy(linkText = "Groups")
    private WebElement groupsButton;





    public void validateFBLogIsDisplayed() {
        Assert.assertTrue(fbLogo.isDisplayed());
    }

    public void clickOnLoginButton() {
        logInButton.click();
    }

    public void fillUsernameAndPasswordField(String username, String password) {
        emailField.sendKeys(username);
        passwordField.sendKeys(password);
    }

    public void clickOnLoginBtn() {
        loginBtn.click();
    }


    public void validateErrorLoginMessage() {
        sleepFor(3);
        errorMessage.isDisplayed();
    }

    public void clickOnSignUpButton() {
        signUpButton.click();
    }


    public void clickOnPeopleButton() {
        peopleButton.click();
    }


    public void enterUsername(String username) {
        emailField.sendKeys(username);
    }

    public void clickOnForgetPasswordButton() {
        forgetPasswordButton.click();
    }

    public void clickOnCreateAPageButton() {
        createAPageButton.click();
    }

    public void clickOnShewMoreLanguages() {
        showMoreLanguagesButton.click();
    }

    public void selectEasternEurope() {
        sleepFor(3);
        easternEurope.click();
    }

    public void validateRomânălanguageiSDisplayed() {
        sleepFor(3);
        RomânăLanguage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickOnCreateAccountButton() {
        createAccountButton.click();
    }


    public void clickOnFrenchLanguageButton() {
        frenchLanguageButton.click();
    }

    public void validateUserIsInFrenchLandingPage() {
    String expected = driver.getTitle();
    String actual = "Facebook - Connexion ou inscription";
    Assert.assertEquals(expected, actual);
    }

    public void clickOnGroupsButton() {
        groupsButton.click();
    }
}




