@smoke
Feature: Search functionality
  Scenario Outline: User could search using product name
    Given the user is on the home page
    When the user searches for product with name "<productName>"
    And each search result should contain the search keyword
    And Url contains search Url
    Then search results should be relevant
    Examples:
      | productName |
      | book        |
      | laptop      |
      | nike        |
    @smoke

  Scenario Outline: User could search for product using SKU
    Given the user is on the home page
    When the user searches for product with SKU "<productSKU>"
    Then user should click on the product in search results
    And the SKU shown on the product page should contain the searched SKU

    Examples:
      | productSKU |
      | SCI_FAITH  |
      | APPLE_CAM  |
      | SF_PRO_11  |
