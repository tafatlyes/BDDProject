package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.PeoplePage;
import com.pnt.bdd.pages.SignUpPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class PeoplePageFunctionality {
 private PeoplePage peoplePage;


    @Then("^user can see people list page is displayed$")
    public void user_can_see_people_list_page_is_displayed() {
        peoplePage = PageFactory.initElements(TestBase.driver, PeoplePage.class);
        peoplePage.validatePeopleListPageIsDisplayed();

    }

    @Then("^user can see search for people tab is displayed in people page$")
    public void user_can_see_search_for_people_tab_is_displayed_in_people_page() {
       peoplePage.validateSearchForPeopleTab();
    }

    @Then("^user provides (.*) in the search field$")
    public void user_provides_firs_name_last_name_in_the_search_field(String name) {
        peoplePage.fillSearchBarField(name);

    }

    @Then("^user clicks on search button$")
    public void user_clicks_on_search_button(){
        peoplePage.clickOnSearchButton();
    }

    @Then("^user can see Find your friends on Facebook text is displayed$")
    public void user_can_see_Find_your_friends_on_Facebook_text_is_displayed()  {
        peoplePage.validateFindYouFriendText();
    }

}
