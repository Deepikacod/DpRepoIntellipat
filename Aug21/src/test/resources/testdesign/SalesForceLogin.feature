Feature: Functional validation of Salesforce login page
  @SaleForce01
  Scenario: Validation of login functionality

    #Given user navigates to salesforce login page
    When user enter username "lmti" and password "123"
    And user clicks on the login page
    Then user validates the navigation to the homepage

    Scenario: Validation of error message

      When user enter username "lmti" and password "abc"
      And user clicks on the login page
      Then user validates the error page

