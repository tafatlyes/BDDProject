package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.IdentifyPage;
import com.pnt.bdd.pages.LandingPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class IdentifyPageFunctionality {

    private IdentifyPage identifyPage;


    @Then("^user can see Please enter your email or phone number to search for your account message$")
    public void user_can_see_Please_enter_your_email_or_phone_number_to_search_for_your_account_message()  {
        identifyPage = PageFactory.initElements(TestBase.driver, IdentifyPage.class);
        identifyPage.validateUserBeingAbleToSeePleaseenteryouremail();
    }
}
