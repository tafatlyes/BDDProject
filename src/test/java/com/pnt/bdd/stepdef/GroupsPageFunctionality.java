package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.GroupsPage;
import com.pnt.bdd.pages.LandingPage;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;

public class GroupsPageFunctionality {
    private GroupsPage groupsPage;

    @Then("^user select letter L in Groups page$")
    public void user_select_letter_L_in_Groups_page() {
        groupsPage = PageFactory.initElements(TestBase.driver, GroupsPage.class);
        groupsPage.selectLtterL();

    }

    @Then("^user see list of groups stating with letter L$")
    public void user_see_list_of_groups_stating_with_letter_L() {
        groupsPage.validateUserCanSeeGroupsStartingWithLetterL();
    }
}
