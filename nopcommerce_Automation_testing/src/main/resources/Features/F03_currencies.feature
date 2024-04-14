@smoke
Feature: Currencies Feature

  Scenario: Verify Euro symbol on product prices
    When go to homepage
    And user selects Euro currency
    Then Euro symbol "€" is shown on the product prices
