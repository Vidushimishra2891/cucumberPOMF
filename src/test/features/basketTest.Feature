Feature: Basket
  As a user
  I add and update item to the Basket

    #Test-case 1
    Scenario: User selects an item and expects it to get added to the basket
    Given I am on Home Page "https://www.next.co.uk"
    When I enter an item in the search bar "Jeans"
    When I click on search button
    Then Jeans of all the brands are displayed
    When I click on one of the items "Mid Blue Slim Jeans"
    And I select a size "12L"
    When I click on Add to basket
    And I click on edit basket button
    And I select a quantity "3"
     Then Item is updated in the bag