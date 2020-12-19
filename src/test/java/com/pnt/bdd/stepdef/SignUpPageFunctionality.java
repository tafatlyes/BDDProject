package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.SignUpPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class SignUpPageFunctionality {
private SignUpPage signUpPage;


    @Then("^user can see the signup page is displayed$")
    public void user_can_see_the_signup_page_is_displayed()  {
        signUpPage = PageFactory.initElements(TestBase.driver, SignUpPage.class);
        TestBase.sleepFor(3);
        signUpPage.validateSignUpPageIsDisplayed();
    }




    @Then("^user provides first name and last name$")
    public void user_provides_first_name_and_last_name() {
        signUpPage.enterFirstNameAndPassword();
    }

    @Then("^user provides email address and password$")
    public void user_provides_email_address_and_password(){
        signUpPage.enterEmailAdressAndPassword();

    }

    @Then("^user select birth day information$")
    public void user_select_birth_day_information() {
        signUpPage.selectBirthdayInformation();

    }

    @Then("^user click choose gender$")
    public void user_click_choose_gender() {
        signUpPage.selectGender();

    }

    @Then("^user clicks on sigh up button$")
    public void user_clicks_on_sigh_up_button() {
        signUpPage.clickOnSIgnUpButton();

    }

}
