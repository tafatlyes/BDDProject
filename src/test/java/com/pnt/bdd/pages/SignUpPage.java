package com.pnt.bdd.pages;

import com.pnt.bdd.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SignUpPage extends TestBase {


    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstNameTab;

    @FindBy(xpath = "//input[@name='lastname']")
    private WebElement lastNameTab;

    @FindBy(xpath = "//input[@name='reg_email__']")
    private WebElement emailAddressTab;

    @FindBy(xpath = "//input[@name='reg_email_confirmation__']")
    private WebElement emailAddressConfirmationTab;

    @FindBy(xpath = "//input[@name='reg_passwd__']")
    private WebElement passwordTab;

    @FindBy(xpath = "//select[@name='birthday_month']")
    private WebElement monthTab;

    @FindBy(xpath = "//select[@name='birthday_day']")
    private WebElement dayTab;

    @FindBy(xpath = "//select[@name='birthday_year']")
    private WebElement yearTab;

    @FindBy(xpath = "//input[@value='2']")
    private WebElement genderTAB;

    @FindBy(xpath = "//button[@name='websubmit']")
    private WebElement signUpButton;



    public void validateSignUpPageIsDisplayed() {
        sleepFor(4);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/r.php");
    }


    public void enterFirstNameAndPassword() {
        firstNameTab.sendKeys("jack");
        lastNameTab.sendKeys("mcnifee");

    }

    public void enterEmailAdressAndPassword() {
        emailAddressTab.sendKeys("jackmcufee@gmail.com");
        emailAddressConfirmationTab.sendKeys("jackmcufee@gmail.com");
        passwordTab.sendKeys("LLLLLL123456");

    }

    public void selectBirthdayInformation() {
        Select select = new Select((monthTab));
        select.selectByValue("10");
        Select select1 = new Select((dayTab));
        select1.selectByValue("18");
        Select select2 = new Select((yearTab));
        select2.selectByValue("2000");

    }

    public void selectGender() {
        genderTAB.click();
        sleepFor(5);
    }

    public void clickOnSIgnUpButton() {
        signUpButton.click();
        sleepFor(5);
    }
}
