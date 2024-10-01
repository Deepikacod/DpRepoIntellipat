Feature: Amazon homepage validation
  @amazon01
  Scenario: Validation of search functionality
    Given user navigates to amazon home page
    When user enter the product name "iphone"
    And user clicks on search icon
    Then user verify the title of the page

@amazon02
    Scenario: Dropdown Validation
      Given user selects the value from the category dropdown
      When user extracts all the values

@amazon03
  Scenario: Baby wish list validation
    Given user navigates to baby wishlist page
    Then verify the baby wishlisttext
