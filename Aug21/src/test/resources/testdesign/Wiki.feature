Feature: Wiki Infosys Page Automation
  @wiki01
  Scenario: Verify the mapping of shareholding and shareholder value

    // Given user navigates to infosys wiki page
    When user extracts the shareholder value
    And user extracts the shareholding value
    Then validate the mapping
