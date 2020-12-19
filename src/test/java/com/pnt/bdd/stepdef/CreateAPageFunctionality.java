package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.CreateAPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class CreateAPageFunctionality {
    private CreateAPage createAPage;

    @Then("^user can see Create A Page text in the top left of the page$")
    public void user_can_see_Create_A_Page_text_in_the_top_left_of_the_page() {
        createAPage = PageFactory.initElements(TestBase.driver, com.pnt.bdd.pages.CreateAPage.class);
        createAPage.validateUserCanSeeCreatePageText();
    }

}
