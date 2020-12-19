Feature: people functionality features

  Background:
    Given user opens the browser and navigate to facebook.com
    When user see the facebook logo is displayed
    Then user clicks on the people button from the footer
    And user can see people list page is displayed


  Scenario: user being able to click on people button from the footer of the landing page
    And user closes the browser


  Scenario Outline: user being able to search for people in people page
    And user can see search for people tab is displayed in people page
    Then user provides <name> in the search field
    Then user clicks on search button
    And user can see Find your friends on Facebook text is displayed
    And user closes the browser

    #we use Examples when we use parameterization
    Examples:
      |name            |
      |Lyes            |
      |Tester1         |
      |Tester2         |