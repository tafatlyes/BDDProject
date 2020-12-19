package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.HomePage;
import com.pnt.bdd.pages.LandingPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class HomePageFunctionality {
    private HomePage homePage;

    @Then("^user clicks on Log Out Button$")
    public void user_clicks_on_Log_Out_Button() {
        homePage = PageFactory.initElements(TestBase.driver, HomePage.class);
        homePage.clickOnLogOutButton();

    }


}
