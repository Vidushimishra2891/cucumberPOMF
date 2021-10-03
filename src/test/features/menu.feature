Feature: Menu Test
  As a user
  I should get re-directed appropriately

  Scenario Outline: Menu re-direction verification
    Given I'm on the home page "http://www.next.co.uk"
    When I click on Menu "<MenuOption>"
    Then i should get re-directed to