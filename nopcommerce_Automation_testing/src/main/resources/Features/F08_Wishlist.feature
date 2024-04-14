@Smoke
Feature: F08_Wishlist | The user can use the functionality of adding products to wishlist successfully

  Scenario Outline:  wish button is clickable
    When user clicks on wish button for element <0>
    Then success notification displayed
    Examples:
      | 0 |
      | 2 |
  Scenario: product added successfully to the wishlist
    When user clicks on wish button for element 2
    And user close success notification bar
    And user go to wishlist page
    Then item added to the wishlist
