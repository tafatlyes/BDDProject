Feature: signup functionality features

  Background:
    Given user opens the browser and navigate to facebook.com
    When user see the facebook logo is displayed


  Scenario: user being able to click on signup button from the footer of the landing page
    Then user clicks on the signup button from the footer
    And user can see the signup page is displayed
    And user closes the browser



    Scenario: user being able to create a facebook account
      Then user clicks on the signup button from the footer
      And user can see the signup page is displayed
      And user provides first name and last name
      And user provides email address and password
      Then user select birth day information
      And user click choose gender
      And user clicks on sigh up button
      Then user clicks on Log Out Button
      And user closes the browser
