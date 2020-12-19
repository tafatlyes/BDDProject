package com.pnt.bdd.stepdef;

import com.pnt.bdd.TestBase;
import com.pnt.bdd.pages.LandingPage;
import com.pnt.bdd.pages.SignInPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LandingPageFunctionality {
    private LandingPage landingPage;


    @Given("^user opens the browser and navigate to facebook\\.com$")
    public void user_opens_the_browser_and_navigate_to_facebook_com() {
        TestBase.setupBrowser();
        TestBase.driver.get("https://www.facebook.com");
        TestBase.driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        TestBase.driver.manage().window().maximize();
    }

    @When("^user see the facebook logo is displayed$")
    public void user_see_the_facebook_logo_is_displayed() {
        landingPage = PageFactory.initElements(TestBase.driver, LandingPage.class);
        landingPage.validateFBLogIsDisplayed();
    }

    @Then("^user clicks on the login button from the footer$")
    public void user_clicks_on_the_login_button_from_the_footer() {
        landingPage.clickOnLoginButton();
    }


    @Then("^user closes the browser$")
    public void user_closes_the_browser() {
        TestBase.driver.close();
    }



    @Then("^user provides (.*) and (.*) in the desired field$")
    public void user_provides_testuser_gmail_com_and_abc_in_the_desired_field(String username, String password)  {
        landingPage.fillUsernameAndPasswordField(username, password);
    }

    @Then("^user clicks on the login button$")
    public void user_clicks_on_the_login_button()  {
        landingPage.clickOnLoginBtn();
    }

    @Then("^user can see error message$")
    public void user_can_see_error_message() {
        landingPage.validateErrorLoginMessage();

    }

    @Then("^user clicks on the signup button from the footer$")
    public void user_clicks_on_the_signup_button_from_the_footer() {
        landingPage.clickOnSignUpButton();

    }

    @Then("^user clicks on the people button from the footer$")
    public void user_clicks_on_the_people_button_from_the_footer(){
      landingPage.clickOnPeopleButton();
    }

    @Then("^user provides (.*) in email field$")
    public void user_provides_username_in_email_field(String username) {
        landingPage.enterUsername(username);

    }

    @Then("^user clicks on forget password button$")
    public void user_clicks_on_forget_password_button()  {
        landingPage.clickOnForgetPasswordButton();
    }

    @Then("^user clicks on create page button$")
    public void user_clicks_on_create_page_button() {
       landingPage.clickOnCreateAPageButton();
    }


    @Then("^user clicks on  show more languages button from the footer of the landing page$")
    public void user_clicks_on_show_more_languages_button_from_the_footer_of_the_landing_page(){
      landingPage.clickOnShewMoreLanguages();
    }

    @Then("^select Eastern Europe from Suggested Languages$")
    public void select_Eastern_Europe_from_Suggested_Languages() {
    landingPage.selectEasternEurope();
    }

    @Then("^user can see Română language displayed$")
    public void user_can_see_Română_language_displayed() {
      landingPage.validateRomânălanguageiSDisplayed();
    }

    @Then("^user clicks on create new account button$")
    public void user_clicks_on_create_new_account_button() {
    landingPage.clickOnCreateAccountButton();
    }


    @Then("^user select French button on the footer of the page$")
    public void user_select_French_button_on_the_footer_of_the_page() {
        landingPage.clickOnFrenchLanguageButton();
    }

    @Then("^user land on French login page$")
    public void user_land_on_French_login_page() {
        landingPage.validateUserIsInFrenchLandingPage();
    }

    @Then("^user clicks on Groups Button$")
    public void user_clicks_on_Groups_Button() {{
        landingPage.clickOnGroupsButton();
    }
    }









}